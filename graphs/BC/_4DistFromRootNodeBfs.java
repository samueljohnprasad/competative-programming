package graphs.BC;
import java.util.*;


public class _4DistFromRootNodeBfs {


    static Map<Integer,List<Integer>> map= new HashMap<>();
    public static void main(String args[]){

          addEdge(0,3);
          addEdge(0,1);
          addEdge(2,1);
          addEdge(3,4); 
          addEdge(4,5);
          
          bfs(0);

         for(Map.Entry<Integer,List<Integer>> res:map.entrySet() ){

            int s=res.getValue().size();
            
            System.out.print(res.getKey()+" ");
            for(int i=0;i<s;i++){
                System.out.print(res.getValue().get(i)+" ");
            }
            System.out.println();


      }

    }

        public static void addEdge(int x,int y){

           
            
            if(map.get(x)==null){

                List<Integer> list=new LinkedList<>();
                list.add(y);
                map.put(x,list);
           
           }else{
            map.get(x).add(y);
           
        }

        if(map.get(y)==null){
            List<Integer> list2=new LinkedList<>();
            list2.add(x);
        map.put(y,list2);
       }else{
        map.get(y).add(x);
    }


    }

    public static void bfs(int src ){
          Map<Integer,Integer> dist= new HashMap<>();
        //  int dist[] = new int[map.size()];
          Queue<Integer> qu= new LinkedList<>();

          for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){

                 int node =entry.getKey();

                dist.put(node,Integer.MAX_VALUE);
                 
                //  dist[node]=Integer.MIN_VALUE;
                }

                dist.put(src,0);
                qu.add(src);
        
                while(!qu.isEmpty()){
                    int node=qu.poll();
                    
                    if(map.get(node)!=null){
                   int size=  map.get(node).size();
                   for(int i=0;i<size;i++)
                   {  
                       

                        int nbr= map.get(node).get(i);
                        if(dist.get(nbr)!=null){
                        if(dist.get(nbr)==Integer.MAX_VALUE){
                            qu.add(nbr);
                            dist.put(nbr, dist.get(node)+1);
                        }
                    }
                    
                   }
                }


                    
                }

                for(Map.Entry<Integer,List<Integer>> res:map.entrySet() ){

                     int n=res.getKey();
                     int d=dist.get(n);
                     System.out.println(n+" dist from src "+ d);


                }

               

    }

   

    
}
