package graphs.BC;
import java.util.*;

public class _10BipartiteCheckDfs {
      static  Map<Integer,List<Integer>> map= new HashMap<>();
     public static void main(String arg[]){
           Scanner sc= new Scanner(System.in);
           int N=sc.nextInt();
           int M=sc.nextInt();

           while(M-- >0){
                int x=sc.nextInt();
                int y=sc.nextInt();
                addEdges(x,y);
           }

           System.out.println(dfs(map,N));
          
    }

     static boolean  dfs(Map<Integer,List<Integer>> graph,int N){
          int visited[]= new int[N];
          int color=1;
         boolean ans= dfsHelper(graph,0,visited,-1,color);
         return ans;
    }
 
    public static boolean dfsHelper(Map<Integer,List<Integer>> graph,int node,int [] visited,int parent,int color){
           visited[node]=color;
           for(int nbr: map.get(node)){
                if(visited[nbr]==0){
                    boolean subProblem = dfsHelper(graph,nbr,visited,node,3-color);
                    if(subProblem==false){
                        return false;
                    }
                }else if(nbr!=parent && color==visited[nbr] ){ //nbr color and present color should not be same
                      return false;
                }
           } 

           return true;

    }

    public static void addEdges(int x,int y){
                if(map.get(x)==null){

                    List<Integer> list= new LinkedList<>();
                    list.add(y);
                    map.put(x,list);

                }else{
                    map.get(x).add(y);
                }

                if(map.get(y)==null){
                    List<Integer> list= new LinkedList<>();
                    list.add(x);
                    map.put(y,list);
                }else{

                    map.get(y).add(x);

                }

    }
    
}
