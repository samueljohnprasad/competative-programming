package graphs.BC;
import java.util.*;

public class _9CycleDetectionUndirectedGraphDfs {
          static Map<Integer,List<Integer>> map= new HashMap<>();
          static int V;
    public static void main(String args[]){

        V=5;
        addEdge(0,1);
        addEdge(1,2);
        addEdge(2,3);
        addEdge(3,4);
      //  addEdge(4,0);

        System.out.println(containsCycles());

    }
    

    public static boolean containsCycles(){
        boolean []visited=new boolean[V];
         return  cyclesHelper(0,visited,-1);
    }

   static boolean cyclesHelper(int node , boolean [] visited,int parent){

        visited[node]=true;
        for(Integer nbr: map.get(node)){

            if(!visited[nbr]){  //not visited
                //go and recursively visit the neighbours
                boolean cycleMila=cyclesHelper(nbr,visited,node);
                if(cycleMila){
                    return true;
                }
            }else if(nbr!=parent){  //parent and nbr are not same the cycle is there
                
                return true;

            }


        }
        return false;

    }

    public static void addEdge(int x,int y){
        boolean directed=true;
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

class pairs{
    int first;
    boolean second;
    pairs(int first,boolean second){
        this.first=first;
        this.second=second;
    }
}