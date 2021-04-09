package graphs.BC;
import java.util.*;

public class _12TopologicalSortDfs {
    static Map<String,List<String>> map= new TreeMap<>();
    static Map<String,String> keys= new TreeMap<>();
    public static void main(String args[]){

        addEdge("python","dataprocessing");
        addEdge("python","pyTorch");
        addEdge("python","ML");
        addEdge("dataprocessing","ML");
        addEdge("pyTorch","DL");
        addEdge("ML","DL");
        addEdge("DL","faceRecogn");
        addEdge("DataSet","faceRecogn");

        dfs();


    }

    public static void addEdge(String x, String y){
        if(map.get(x)==null){
            List<String> list= new LinkedList<>();
            list.add(y);
            map.put(x,list);
            keys.put(x,y);
            

            

        }else{
            map.get(x).add(y);
            keys.put(x,y);


        }

        if(keys.get(y)==null){
            keys.put(y,x);
    
        }
    }

   


    public static void dfs(){
         Map<String,Boolean> visited=new HashMap<>();
         for(Map.Entry<String,String> entry: keys.entrySet()){
                String k=entry.getKey();
                // System.out.print(k+": ");
                //     for(String s : entry.getValue()){
                //         System.out.print(s+" ");
                //     }
                //     System.out.println();
                visited.put(k,false);

         }
         Deque<String> list= new LinkedList<>();

         for(Map.Entry<String,List<String>> entry : map.entrySet()){

                  String node = entry.getKey();
                //  System.out.println(node);
                   if(!visited.get(node)){
                      dfsHelper(node ,visited,list);

                  }

         }


         for(String s: list){
             System.out.println(s);
         }


    }

    public static void dfsHelper(String src, Map<String,Boolean> visited,Deque<String> list){
           
              visited.put(src,true);
              if(map.get(src)!=null){
              for(String nbr: map.get(src)){
                    // System.out.println(nbr+" nbr");
                 if(visited.get(nbr)!=null){
                  if(!visited.get(nbr)){
                      dfsHelper(nbr,visited,list);

                  }
                }else{
    

                }
               
                
              }
            }

              list.addFirst(src);
              return;
             
              

    }
    
}
