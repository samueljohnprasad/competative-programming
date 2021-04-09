 package graphs.CPBook;
import java.util.*;


public class _3TarjanStronglyConnectedCompAdjListDFS {

    int n;
    List<List<Integer>> graph;
    int sccCount,id;
    boolean [] visited;
    int [] ids,low,sccs;
    Deque<Integer> stack;

    boolean solved;

    static final int UNVISITED=-1;

    _3TarjanStronglyConnectedCompAdjListDFS(List<List<Integer>> graph){
        this.graph=graph;
        n=graph.size();

    }
    public static void main(String args[]){
    
        int n=8;
    List<List<Integer>> graph= createGraph(n);

    addEdge(graph, 6, 0);
    addEdge(graph, 6, 2);
    addEdge(graph, 3, 4);
    addEdge(graph, 6, 4);
    addEdge(graph, 2, 0);
    addEdge(graph, 0, 1);
    addEdge(graph, 4, 5);
    addEdge(graph, 5, 6);
    addEdge(graph, 3, 7);
    addEdge(graph, 7, 5);
    addEdge(graph, 1, 2);
    addEdge(graph, 7, 3);
    addEdge(graph, 5, 0);

    _3TarjanStronglyConnectedCompAdjListDFS solver =new _3TarjanStronglyConnectedCompAdjListDFS(graph);
    int [] sccs=solver.getSccs();

    Map<Integer,List<Integer>> map= new HashMap<>();

       for(int i=0;i<n;i++){
           if(!map.containsKey(sccs[i])) map.put(sccs[i],new ArrayList<>());
           map.get(sccs[i]).add(i);
           
       }

       System.out.println("Number of Strongly Connectecd : "+ solver.sccCount());
       for(List<Integer> scc: map.values()){
           System.out.println("nodes :"+scc+" from a strongly connected Component.");
       }
               
    }

    public int sccCount(){
        if(!solved) solved();

        return sccCount;
    }

    public int[] getSccs(){
        if(!solved) {
            solved();
        }

        return sccs;
    }

    public  void solved(){
        if(solved) return;

        ids=new int [n];
        low=new int[n];
        sccs=new int[n];

        visited= new boolean [n];
        stack= new ArrayDeque<>();
        Arrays.fill(ids,UNVISITED);

        for(int i=0;i<n;i++){
            if(ids[i]==UNVISITED){
                dfs(i);
            }
        }

        solved= true;
    }

    public  void dfs(int src){
        ids[src]=low[src]=id++;
        stack.push(src);
        visited[src]=true;

        for(int nbr: graph.get(src) ){
               if(ids[nbr]==UNVISITED){
                   dfs(nbr);
               }

               if(visited[nbr]){
                   low[src]=Math.min(low[src] ,low[nbr]);
               }
        }

        if(ids[src]==low[src]){
           while(true){
                int node =stack.pop();
                visited[node]=false;
                sccs[node]=sccCount;
                if(node == src ){
                    break;
                }
               

            }
            sccCount++;
        }
    }

    public static  void addEdge(List<List<Integer>> graph,int x,int y){

         graph.get(x).add(y);

    }

    public static List<List<Integer>> createGraph(int n){
        List<List<Integer>> graph=new ArrayList<>(n);
        for(int i=0;i<n;i++){
              graph.add(new ArrayList<>());
            }
        return graph;

    }
    
}
