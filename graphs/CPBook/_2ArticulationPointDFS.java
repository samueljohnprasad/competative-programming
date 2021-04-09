package graphs.CPBook;

import java.util.*;

public class _2ArticulationPointDFS {
    // one application of dfs is to find articulation point

    static int V = 5;

    static Map<Integer, List<Integer>> map = new HashMap<>();
    static int disc[] = new int[V];
    static int low[] = new int[V];
    static int time = 1;
    static LinkedList<Integer> art = new LinkedList<>();

    static int dfsRoot = 0;
    static int rootChildren = 0;

    public static void main(String args[]) {

        // V=6;

        // addEdge(0, 1);
        // // addEdge(1, 2);
        // addEdge(1, 2);
        // addEdge(2,0);
        // addEdge(2, 3);
        // addEdge(3, 4);
        // //addEdge(4, 5);

        

        // addEdge(0, 1);
        // addEdge(1, 2);
        // addEdge(2, 0);
        // addEdge(1, 3);
        // addEdge(1, 4);
        // addEdge(1, 6);
        // addEdge(3, 5);
        // addEdge(4, 5);

        addEdge(1, 0);
        addEdge(0, 2);
        addEdge(2, 1);
        addEdge(0, 3);
        addEdge(3, 4);
         printList();

        // addEdge(0, 1);
        // addEdge(1, 2);
        // addEdge(2, 3);
        articulationPoint();

    }

    public static void articulationPoint() {
  
        for(int i=0;i<disc.length;i++){
            if(disc[i]==0){
               dfsx(i, -1);
            }
        }

         for(int i=0;i<disc.length;i++){
            System.out.println(disc[i]+"disc");
             System.out.println(low[i]+"low");
         }
        System.out.println(art);

    }

   
      
    

    public static void dfsx(int curr, int par) {
        disc[curr] = low[curr] = time++;
        

        int noChild = 0;
        for (Integer child : map.get(curr)) {
           // System.out.println(child+" child");

            if (disc[child] == 0) {
                dfsx(child, curr);

                noChild++;
                low[curr] = Math.min(low[curr], low[child]);

                if (par != 0 && low[child] >= disc[curr]) {
                    art.add(curr);
                    System.out.println(curr + "curr");
                }

                if (low[child] > disc[curr]) {

                }

            } else if (child != par) {
                low[curr] = Math.min(low[curr], disc[child]);
            }

        }
        if (par == 0 && noChild >= 2) {
            art.add(curr);
        }
        return;

    }

    public static void addEdge(int x, int y) {
        if (map.get(x) == null) {
            List<Integer> list = new LinkedList<>();
            list.add(y);
            map.put(x, list);
        } else {
            map.get(x).add(y);
        }

        if (map.get(y) == null) {
            List<Integer> list = new LinkedList<>();
            list.add(x);
            map.put(y, list);
        } else {
            map.get(y).add(x);
        }
    }

    public static void printList() {

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {

            int key = entry.getKey();
            System.out.print(key + ": ");
            for (int i : entry.getValue()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
