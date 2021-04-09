package graphs.CPBook;
import java.util.*;

public class _1GraphPropertyCheckHashMapDFS {

    static Map<Integer,List<Integer>> map= new HashMap<>();
  //  static Map<K,E> mapp= new Map<K,E>();
    static int visited []= new int[9];
    static int parent[] = new int[9];
public static void main(String args[]){
    addEdge(0, 1, true);
    addEdge(1, 2, true);
    addEdge(1, 3, false);
    addEdge(3, 1, false);
    addEdge(2, 3, true);
    addEdge(3, 4, true);
     addEdge(5,5,false);
    addEdge(6, 7, true);
    addEdge(6, 8, true);

    int j=0;
    for(int i=0;i<visited.length;i++){
       
        if(visited[i]==0){
            System.out.println("component "+ ++j+": ");
            graphCheck(i);
            System.out.println();
        }
       
    }
}

  public static void graphCheck(int src){

          visited[src]= 2;
          for(Integer nbr: map.get(src)){

               if(visited[nbr]==0){
                   parent[nbr]=src;
                   visited[nbr]=1;
                   graphCheck(nbr);
                    
                  
               }else if(visited[nbr]==2){

                    if(nbr==parent[src]){
                        System.out.println("[two ways: "+"("+src+","+nbr+")"+"("+nbr+","+src+")]");
                    }else{
                        System.out.println("[back edge "+ src+" "+nbr+"]" );

                    }

               }else if(visited[nbr]==1){

                      System.out.println("[forward edge "+src+" "+nbr+"]");

               }
               
                

          }

  }

public static void  addEdge(int x,int y,boolean flag){

  // map[x].push_back(y);
  // map.[y].push_back(x);

     if(map.get(x)==null){
         List<Integer> list= new LinkedList<>();
         list.add(y);
         map.put(x,list);
     }else{
         map.get(x).add(y);
     }

     if(flag){
         if(map.get(y)==null){
             List<Integer> list= new LinkedList<>();
             list.add(x);
             map.put(y,list);
         }else{
             map.get(y).add(x);
         }
     }


}


}
