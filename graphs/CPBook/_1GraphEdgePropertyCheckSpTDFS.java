package graphs.CPBook;

import java.util.*;

public class _1GraphEdgePropertyCheckSpTDFS {

    static Map<Integer, List<Integer>> map = new HashMap<>();
    // static List<List<Integer>> arrlist= new ArrayList<>();
    static int visited[] = new int[9];
    static int parent[] = new int[9];

    static int matrix[][] = new int[9][9];

    public static void main(String args[]) {
        for (int i = 0; i < visited.length; i++) {
            visited[i] = -1;
        }

        addEdge(0, 1, true);
        addEdge(1, 2, true);
        addEdge(1, 3, false);
        addEdge(3, 1, false);
        addEdge(2, 3, true);
        addEdge(3, 4, true);
        // addEdge(5,5,false);
        addEdge(6, 7, true);
        addEdge(6, 8, true);

        printMatrix();
        // printList();

        int j = 0;
      //  for (int i = 0; i < visited.length; i++) {
     //       if (visited[i] == -1) {
                System.out.print("component " + ++j + ": ");
                graphCheck(0);
           //     System.out.println();
            //}

      //  }

    }

    public static void addEdge(int x, int y, boolean flag) {

        matrix[x][y] = -1;

        if (flag) {
            matrix[y][x] = -1;
        }

        // if(map.get(x)==null){
        // List<Integer> list= new LinkedList<>();
        // list.add(y);
        // map.put(x,list);
        // }else{
        // map.get(x).add(y);
        // }

        // if(flag){

        // if(map.get(y)==null){
        // List<Integer> list= new LinkedList<>();
        // list.add(x);
        // map.put(y,list);
        // }else{
        // map.get(y).add(x);
        // }
        // }

    }

    static void printMatrix() {

        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void printList() {

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {

            int key = entry.getKey();
            System.out.print(key + ": ");
            for (Integer i : entry.getValue()) {
                System.out.print(i + " ");

            }
            System.out.println();

        }
    }

    static void graphCheck(int src) {

        visited[src] = 2;

        // System.out.print(src+" ");
        // System.out.print(src+" ");

        for (int i = 0; i < matrix.length; i++) {
            int nbr = i;
            if (matrix[src][nbr] == -1) {
                if (visited[nbr] == -1) {
                    parent[nbr] = src;

                    graphCheck(nbr);

                } else if (visited[nbr] == 2) {
                    if (nbr == parent[src]) {
                        // //if alreay explored and src's parent is nbr then they are connected in
                        // undirectionally
                        System.out.println("[two ways (" + src + "," + nbr + ") (" + nbr + "," + src + ") ]");
                    } else {
                        // if nbr is not parent of source edge then its a back edge
                        System.out.println("[back edge " + src + " " + nbr + " ]");
                    }
                } else if (visited[nbr] == 1) {
                   // System.out.println("src "+src);
                    System.out.println("[forward Edge " + src + " " + nbr + " ]");

                }

            }
        }
        visited[src] = 1;

    }

}
