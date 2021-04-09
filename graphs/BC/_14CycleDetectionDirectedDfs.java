package graphs.BC;
import java.util.*;


public class _14CycleDetectionDirectedDfs {
      static int V;
    static List<List<Integer>> arrlist;
      public static void main(String args[]){

         V=7;
        arrlist=new ArrayList<>();
        for(int i=0;i<V;i++){
               arrlist.add(i,new ArrayList<>());
              
        }
        addEdge(0,1);
        addEdge(1,2);
        addEdge(2,3);
        addEdge(3,4);
        addEdge(4,5);
        addEdge(1,5);
        addEdge(5,6);
        addEdge(4,2);

       System.out.println(containsCycle());

    }
    public static void addEdge(int x,int y){
        arrlist.get(x).add(y);
             
    }

   static   boolean cycleHelper(int node, boolean [] visited, boolean[] stack){
             
        visited[node]=true;
        stack[node]=true; //visisted 

        // for(List<Integer> list: arrlist){
           
        //     for(Integer i:list){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        for(int nbr: arrlist.get(node)){

            if(stack[nbr]==true){
                return true;
            }
            else if(visited[nbr]==false){
                // System.out.println(nbr+" ");
                boolean cycleMila=cycleHelper(nbr, visited, stack);
                if(cycleMila==true){
                    return true;
                }

            }

       }
        // leaving node
        stack[node]= false;
        return false;

    }

    public static boolean containsCycle(){
        boolean stack[]= new boolean[V];
        boolean visited[]= new boolean[V];
        for(int i=0;i<V;i++){
            stack[i]=false;
            visited[i]=false;
        }

        return cycleHelper(0,visited,stack);





    }
    
}
