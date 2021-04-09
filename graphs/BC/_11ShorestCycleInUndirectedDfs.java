package graphs.BC;
import java.util.*;

public class _11ShorestCycleInUndirectedDfs {
 
     static Map<Integer,List<Integer>> map= new HashMap<>();
     static  int ans;
    
    public static void main(String args[]){


         int i,j,n,m;
         Scanner sc=new Scanner (System.in);
         n=sc.nextInt();
         m=sc.nextInt();

         for(i=0;i<m;i++){
             int x=sc.nextInt();
             int y=sc.nextInt();
             addEdge(x,y);;
         }
           
      
        ans=n+1;
         for(i=1;i<=n;i++){
               bfs(i,n);
         } 
         System.out.println(ans);
         if(ans==n+1){
             System.out.println("No cycles");
         }else{
            System.out.println(" cycles is of length"+ans);
         }


    }

    public static void bfs(int src ,int n){
        // Map<Integer,Integer> dis= new HashMap<>();
       //  dis.put(n+1,null);
       int []  dis=new int[n+1];
       for(int i=0;i<dis.length;i++){
             dis[i]=Integer.MAX_VALUE;
       }

         Queue<Integer> qu= new LinkedList<>();
         qu.add(src);

          dis[src]=0;

          while(!qu.isEmpty()){

           // System.out.println(ans+"ansA" );

            int curr= qu.poll();
          //  System.out.println(curr+"curr");
            
            

             for(Integer nbr : map.get(curr)){

                if(dis[nbr]==Integer.MAX_VALUE){
                    //not visited simple edge
                   dis[nbr]=dis[curr]+1;
                   qu.add(nbr);
                  //  System.out.println(dis[nbr]+"nbr");

                }else if(dis[nbr]>=dis[curr]){

                    ans=Math.min(ans,dis[nbr]+dis[curr]+1);
                 //   System.out.println(ans+"ansB" );

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
             List<Integer> list= new LinkedList<>();
             list.add(x);
             map.put(y,list);
         }else{
             map.get(y).add(x);
         }

    }


    
}
