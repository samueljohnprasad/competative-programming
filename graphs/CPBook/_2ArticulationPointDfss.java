package graphs.CPBook;

import java.util.*;

public class _2ArticulationPointDfss {

    private int n, rootNodeOutcomingEdgeCount;
    static int id;
    boolean solved;
    int[] low, ids;
    boolean[] visited, isArti;
    List<List<Integer>> graph;

    public static void main(String args[]) {
        textExample();

    }

    _2ArticulationPointDfss(List<List<Integer>> graph, int n) {

        this.graph = graph;
        this.n = n;

    }

    public static void textExample() {
        int n = 9;
        List<List<Integer>> graph = createGraph(n);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 2, 5);
        addEdge(graph, 5, 6);
        addEdge(graph, 6, 7);
        addEdge(graph, 7, 8);
        addEdge(graph, 8, 5);

        // addEdge(graph, 1, 2);
        // addEdge(graph, 2, 3);
        // addEdge(graph, 3, 1);
        // addEdge(graph, 3, 4);
        // addEdge(graph, 4, 5);

        _2ArticulationPointDfss solver = new _2ArticulationPointDfss(graph, n);
        boolean[] isArti = solver.findArticulationPoints();

        for (int i = 0; i < n; i++) {
            if (isArti[i])
                System.out.println("Node " + i + "is an articulation");
        }
    }

    public static List<List<Integer>> createGraph(int n) {

        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());

        }
        return graph;
    }

    public boolean[] findArticulationPoints() {

        if (solved)
            return isArti;

        id = 0;
        low = new int[n];
        ids = new int[n];
        visited = new boolean[n];
        isArti = new boolean[n];

        // for(int i=0;i<n;i++){
        // if(!visited[i]){
        rootNodeOutcomingEdgeCount = 0;
        dfs(1, 1, -1);

        // isArti[i]=(rootNodeOutcomingEdgeCount>1);
        // }
        // }

        solved = true;
        return isArti;

    }

    public void dfs(int root, int at, int parent) {
        // if(parent==root) rootNodeOutcomingEdgeCount++;

        visited[at] = true;
        int noChild = 0;
        low[at] = ids[at] = id++;

        List<Integer> edges = graph.get(at);
        for (Integer to : edges) {
            // if(to==parent ) continue;
            if (!visited[to]) {
                dfs(root, to, at);
                noChild++;
                low[at] = Math.min(low[at], low[to]);

                if (parent != -1 && ids[at] <= low[to]) {
                    isArti[at] = true;
                }
            } else if (to != parent) {
                low[at] = Math.min(low[at], ids[to]);
            }

        }

        if (parent == 0 && noChild >= 2) {
            isArti[at] = true;
        }

    }

    public static void addEdge(List<List<Integer>> graph, int from, int to) {

        graph.get(from).add(to);
        graph.get(to).add(from);

    }

}
