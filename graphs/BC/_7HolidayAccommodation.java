package graphs.BC;
import java.util.*;

public class _7HolidayAccommodation {
    
        static int V;
        static int ans=0;
       static Map<Integer,List<pair>> map= new HashMap<Integer,List<pair>>();
       
      
        public static void main(String args[]){
           
    
            V=4;
            addEdge(0,1,3);
          //  System.out.println("B");
            addEdge(1,2,2);
            addEdge(2,3,2);
            System.out.println( dfs());
           
        }
    
        public static void addEdge(int u,int v,int cost){
    
                  if(map.get(u)==null){
                      List<pair> list= new LinkedList<>();
                      list.add(new pair(v,cost));
    
                      map.put(u,list);
                  }else{
                      map.get(u).add(new pair(v,cost));
                  }
    
                  if(map.get(v)==null){
                      List<pair> list= new LinkedList<>();
                      list.add(new pair(u,cost));
                      map.put(v,list);
    
                  }else{
                      map.get(v).add(new pair(u,cost));
                  }
    
    
    
    
        }
        
        public static int dfs(){
            boolean visited[]= new boolean[V];
            int count[] = new int[V];
    
            for(int i=0;i<V;i++){
                visited[i]=false;
                count[i]=0;
            }
    
          
            dfsHelper(0,visited,count);
            return ans;
    
    
    
        }
    
        public static  int dfsHelper(int node,boolean []visited,int []count){
                    visited[node]=true;
                    count[node]=1;
    
                    for(pair p: map.get(node)){
                          
                        int nbr= p.x;
                        int wt= p.y;
                       // System.out.println(nbr+"nbr "+wt+"wt ");
                        if(!visited[nbr]){
                            count[node]+=dfsHelper(nbr,visited,count);
                           // System.out.println(count[node] +"C");
                            int nx=count[nbr];
                            int ny=V-nx;
                            ans+=2*Math.min(nx,ny)*wt;
                           // System.out.println(ans+"ans");
                        }
    
                       
    
                        
    
        }
        // for(int i: count){
        //     System.out.println(i+"count");
        // }
        return count[node];
    }
    
    
    }
    class pair{
        int x;
        int y;
        pair(int x,int y){
            this.x=x;
            this.y=y;
        }
     }
    
    
    