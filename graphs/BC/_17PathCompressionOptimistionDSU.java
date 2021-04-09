package graphs.BC;

import java.util.*;

public class _17PathCompressionOptimistionDSU {

    static List<Pairs> arrlist = new ArrayList<>();
    static int V;

    public static void main(String args[]) {

        V = 4;
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
         addEdge(3,0);

        System.out.print(containsCycle());

    }

    public static boolean containsCycle() {
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = -1;
        }

        for (Pairs edge : arrlist) {

            int i = edge.x;
            int j = edge.y;
            int s1 = findSet(i, parent);
            int s2 = findSet(j, parent);

            if (s1 != s2) {
                unionSet(s1, s2, parent);
            } else {
                System.out.println("same parent for " + s1 + "and" + s2);
                return true;
            }

        }

        return false;

    }

    public static void addEdge(int x, int y) {
        arrlist.add(new Pairs(x, y));
    }

    public static int findSet(int i, int[] parent) {

        if (parent[i] == -1)return i;
            

        parent[i] = findSet(parent[i], parent);
        return parent[i];

    }

    public static void unionSet(int x, int y, int[] parent) {
        int s1 = findSet(x, parent);
        int s2 = findSet(y, parent);

        if (s1 != s2) {
            parent[s1] = s2;
        }
    }

}

class Pairs {
    int x;
    int y;

    Pairs(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
