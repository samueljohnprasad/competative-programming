package graphs.BC;
import java.util.*;

public class _6ConnectedGraphsDfs {
     static Map<Integer,List<Integer>>  map= new HashMap<>();

   public static void main(String args[]){

    addEdge(0,1);
    addEdge(1,2);
    addEdge(2,3);
    addEdge(0,3);
    addEdge(0,4);

    addEdge(5,6);
    addEdge(6,7);
    addEdge(8,8);

    dfs();
   }


    public static void dfs(){

         Map<Integer,Boolean > visited= new HashMap<>();
         for(Map.Entry<Integer,List<Integer> > entry: map.entrySet()){

               int node =entry.getKey();
               visited.put(node,false);

         }
 
         int count=0;
         for(Map.Entry<Integer,List<Integer>> p: map.entrySet()){

              int node =p.getKey();
              

              if(!visited.get(node)){

                count++;
                System.out.print("Component :"+count +"--> ");
                
               
                dfsHelper(node ,visited);
                System.out.println();

              }

             

         }

    }

    public static void dfsHelper(int src,Map<Integer,Boolean> visited){
                   
                      System.out.print(src+" ");
                      visited.put(src,true);

                        if(map.get(src)!=null){

                            int size= map.get(src).size();
                            for(int i=0;i<size;i++){
                                   int nbr=map.get(src).get(i);
                                   if(visited.get(nbr)!=null){

                                    if(!visited.get(nbr)){
                                        dfsHelper(nbr, visited);
                                    }

                                   }
                            }
                        }


    }

   public static void addEdge(int x,int y){

    if(map.get(x)==null){

        List<Integer> list= new LinkedList<>();
        list.add(y);
        map.put(x,list);
    }else{
        map.get(x).add(y);
    }


    if(map.get(y)==null){
        List<Integer> list = new LinkedList<>();
        list.add(x);
        map.put(y,list);
    }else{
        map.get(y).add(x);
    }




       

   }
}
