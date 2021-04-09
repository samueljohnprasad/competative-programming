package graphs.OnlineJudge;

import java.util.*;

public class TheseusAndMinotaur {

    static int MAX = 300;
    static int K;

    public static void main(String args[]) {

        killMonster();

    }

    public static void killMonster() {

        Scanner sc = new Scanner(System.in);
        String ss;

        while (true) {
            // boolean visited[] = new boolean[MAX];
            Map<Character, Boolean> visited = new HashMap<>();
            Map<Character, List<Character>> map = new HashMap<>();
            ss = sc.nextLine();
            int ei = 0;
            char e[] = new char[2];
            char[] line = ss.toCharArray();

            if (line[0] == '#') {
                break;
            }

            int i;
            char s;
            char t;

            for (i = 0; i < line.length; i++) {
                if (line[i] == '.')
                    break;
                if (line[i] == ':' || line[i] == ';') {
                    ei = line[i] == ':' ? 1 : 0;

                } else {
                    // System.out.println(ei+"ei");
                    e[ei] = line[i];

                    if (ei == 1) {
                        if (map.get(e[0]) == null) {
                            List<Character> list = new LinkedList<>();
                            list.add(e[1]);
                            map.put(e[0], list);

                        } else {
                            map.get(e[0]).add(e[1]);
                        }

                    }

                }

            }

            // System.out.println(ss);
            i++;
            while (line[i] == ' ')
                i++;
            s = line[i++];
            while (line[i] == ' ')
                i++;
            t = line[i++];
            while (line[i] == ' ')
                i++;
            K = 0;
            while (i < line.length)
                K = K * 10 + (line[i++] - '0');

             printMap(map);
            for (Map.Entry<Character, List<Character>> entry : map.entrySet()) {
                char key=entry.getKey();
                visited.put(key,false);
            }
           
            dfs(map, visited, s, t, 1);

        }
    }

    public static void printMap(Map<Character, List<Character>> map) {

        for (Map.Entry<Character, List<Character>> entry : map.entrySet()) {

            char key = entry.getKey();
            System.out.print(key + ": ");

            for (Character c : entry.getValue()) {
                System.out.print(c + " ");

            }
            System.out.println();

        }

    }

    public static void dfs(Map<Character, List<Character>> map, Map<Character, Boolean> visited, char start, char s,
            int step) {

        if (step == K) {
            System.out.println(step + " " + start);
            step = 0;
        }
        visited.put(start, true);
        for (Character nbr : map.get(start)) {
         
            if (!visited.get(nbr)) {
                dfs(map, visited, nbr, s, step + 1);
            }
         
        }

    }

}

/*
 * A:BCD;B:AD;D:BG;F:H;G:DEH;E:FGH;H:EG;C:AD. A C 3 #
 * 
 * A:BCD;B:AD;D:BG;F:H;G:DEH;E:FGH;H:EG;C:AD. A C 3
A:BCD;B:ACD;C:ABD;D:ABCG;G:DEFH;E:GFH;F:GEH;H:EFG. A C 1
A:BCD;B:ACD;C:ABD;D:ABCG;G:DEFH;E:GFH;F:GEH;H:EFG. A C 6
A:BCD;B:ACD;C:ABD;D:ABCG;G:DEFH;E:GFH;F:GEH;H:EFG. A C 7
A:B;B:A. B A 3
A:B;B:C;C:A. B A 6
C:A;A:B. A C 999999999
A:BCD;B:AD;D:BG;F:H;G:DEH;E:FGH;H:EG;C:AD. A C 3
A:BCD;B:AD;D:BG;F:H;G:DEH;E:FGH;H:EG;C:AD. A C 1
A:DBC. A B 20
A:DBC. A B 1
A:BC:A A B 1
#

//
D F G /E
A B C D G E F /H
C D /B
A B D /C
/B
A /C
/B
D F G /E
A B D G E F /H
/D
A /D
/A
 */