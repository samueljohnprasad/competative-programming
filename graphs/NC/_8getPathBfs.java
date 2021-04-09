package graphs.NC;
import java.io.*;
import java.util.*;

public class _8getPathBfs {

    public static void main(String args[]) throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

         String [] strNums= br.readLine().split(" ");

          int n=Integer.parseInt(strNums[0]);
          int e=Integer.parseInt(strNums[1]);
        //   4 4
        //   0 1
        //   0 3
        //   1 2
        //   2 3
        //   1 3


          int edges[][]= new int[n][n];

          for(int i=0;i<e;i++){
              String [] strNums1=br.readLine().split(" ");
              int f=Integer.parseInt(strNums1[0]);
              int s=Integer.parseInt(strNums1[1]);

              edges[f][s]=1;
              edges[s][f]=1;

          }
          String [] strNums2=br.readLine().split(" ");
          int src=Integer.parseInt(strNums2[0]);
          int dest=Integer.parseInt(strNums2[1]);
          ArrayList<Integer> ans=getPathBfs(edges,src,dest);

            if(ans!=null){
                for(int i :ans){
                    System.out.print(i+" ");
                }
            }



    }
    public static ArrayList<Integer> getPathBfs(int [][] edges,int src,int dest){
      
            boolean visited []= new boolean [edges.length];
            return getPathBfs(edges,src,dest,visited);


    }

    public static ArrayList<Integer> getPathBfs(int [][] edges,int src,int dest,boolean [] visited){

             int n=edges.length;
             Map<Integer,Integer> map=new HashMap<>();
             Queue<Integer> qu=new LinkedList<>();
               
             if(src>edges.length-1 || dest > edges.length-1){
                 return null;
             }

             if(edges[src][dest]==1 && src==dest){
                 ArrayList<Integer> ans= new ArrayList<>();
                 ans.add(src);
                 return ans;
             }

             qu.add(src);
             visited[src]=true;
             while(!qu.isEmpty()){
                 int current =qu.remove();

                 for(int i=0;i<n;i++){
                     if(edges[current][i]==1 && !visited[i]){
                         map.put(i,current);// for tracking
                         qu.add(i);
                         visited[i]=true;

                         if(i==dest){
                             ArrayList<Integer>ans = new ArrayList<>();
                             ans.add(dest);
                             int value=map.get(dest);

                             while(value!=src){
                                 ans.add(value);
                                 value=map.get(value);
                             }
                             ans.add(value);
                             return ans;
                         }

                     }
                 }
             }

             return null;

    }
    
}
