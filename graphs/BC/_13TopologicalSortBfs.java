package graphs.BC;
import java.util.*;

public class _13TopologicalSortBfs {
        static  List<List<Integer>> arrlist= new ArrayList<>();
       static int V;
     public static void main(String args[]){

             V=6;
             for(int i=0;i<V;i++){
                arrlist.add(i,new ArrayList<>());
            }
             addEdge(0,2);
             addEdge(1,2);
             addEdge(1,4);
             addEdge(2,3);
             addEdge(2,5);
             addEdge(3,5);
             addEdge(4,5);
              
             topologicalSort();
            



    }

    public static void topologicalSort(){

        int [] indegree= new int[V];
        for(int i=0;i<V;i++){
            indegree[i]=0;
        }

        for(int i=0;i<V;i++){
              
              for(Integer y: arrlist.get(i)){
                  indegree[y]++;
              }

        }

        Queue<Integer > qu= new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                qu.add(i);
            }
        }

        while(!qu.isEmpty()){
            int node = qu.poll();
            System.out.print(node+" ");
            //itr over nbrs of that node and reduce their indegree
            for( Integer nbr : arrlist.get(node) ){

                indegree[nbr]--;
                if(indegree[nbr]==0){
                    qu.add(nbr);
                }

            }
        }

    }
    public static void addEdge(int x,int y){
            arrlist.get(x).add(y);
         //   arrlist.get(y).add(x);
    }

    
}
