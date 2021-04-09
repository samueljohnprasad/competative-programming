package graphs.BC;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class _20Dijkstras {

    static Map<Object,List<Pairr>>  map= new HashMap<>();


    public static void main(String args[]){
           
           
            // addEdge(1,2,1);
            // addEdge(1,3,4);
            // addEdge(2,3,1);
            // addEdge(3,4,2);
            // addEdge(1,4,7);
            
            
            addEdge("amistsar","delhi",1);
            addEdge("amistsar","jaipur",4);
            addEdge("jaipur","delhi",2);
            addEdge("jaipur","mumbai",8);
            addEdge("bhopal","agra",2);
            addEdge("mumbai","bhopal",3);
            addEdge("agra","delhi",1);

            printAdj();
            dijskraSSSp("amistsar");
           
    }

  static void dijskraSSSp(Object src){

        Map<Object, Integer > dist=new HashMap<>();

        for(Map.Entry<Object,List<Pairr>> entry: map.entrySet()){

             dist.put(entry.getKey(),Integer.MAX_VALUE);


        }
               
              SortedMap<Integer,Object> set= new TreeMap<>();

              dist.put(src,0);
              set.put(0,src );

              while(!set.isEmpty()){

                     Integer nodeDist=set.firstKey();
                     Object node= set.get(nodeDist);

                     int x=set.firstKey();
                     set.remove(x);

                     System.out.println(node+" node "+nodeDist+" nd");

                     for(Pairr pair:  map.get(node) ){
                          if(nodeDist+ pair.dist <dist.get(pair.city)){

                              Object dest= pair.city;
                             

                             dist.put(dest,nodeDist+ pair.dist);
                             set.put(dist.get(dest),dest);
                          }
                     }

            

                      
                       
              }

              for(Map.Entry<Object,Integer>  entry: dist.entrySet()){

                System.err.println(entry.getKey()+" is located at distance of "+ entry.getValue());

           }

              
           

    }

    public static void addEdge(Object x,Object y,int dist){
          if(map.get(x)==null){
         //   System.out.println("Hello");
             LinkedList<Pairr>list=new LinkedList<>();
             list.add(new Pairr(y,dist));
             map.put(x,list);

          }else{ 
           //   System.out.println("Hello");
              map.get(x).add(new Pairr(y,dist));
          }

          if(map.get(y)==null){

            LinkedList<Pairr> list= new LinkedList<>();
            list.add(new Pairr(x,dist));
            map.put(y,list);
          }else{
              map.get(y).add(new Pairr(x,dist));
          }

    }

       static void printAdj(){

            for(Map.Entry<Object,List<Pairr>> entry : map.entrySet()){
                    
                            System.out.print(entry.getKey()+"-> ");

                            for(Pairr pair: entry.getValue()){

                                System.out.print( pair.city+" "+ pair.dist+" ");

                            }
                            System.out.println();

            }

    }
}

class Pairr{

    Object city;
    int dist;

    Pairr(Object city,int dist){
        this.city=city;
        this.dist=dist;
    }
}
