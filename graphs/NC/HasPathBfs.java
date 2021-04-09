package graphs.NC;
import java.io.*;
import java.util.*;
public class HasPathBfs {

    public static void main(String args[]) throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

     String[] strNums;
     strNums=br.readLine().split("\\s");
     int n=Integer.parseInt(strNums[0]);
     int e=Integer.parseInt(strNums[1]);

     int edges[][]= new int[n][n];

     for(int i=0;i<e;i++){
         String [] strNums1;
         strNums1=br.readLine().split("\\s");
         int fv=Integer.parseInt(strNums1[0]);
         int sv=Integer.parseInt(strNums1[1]);
         edges[fv][sv]=1;
         edges[sv][fv]=1;

     }

     String[] strNums1;
     strNums1=br.readLine().split("\\s");
     int sv=Integer.parseInt(strNums1[0]);
     int ev=Integer.parseInt(strNums1[1]);

     System.out.print(hasPath(edges,sv,ev));
    }

    public static boolean hasPath(int[][] edges,int sv,int ev){
         boolean visited[]= new boolean[edges.length];
         return bfs(edges,sv,ev,visited);

    }

    public static boolean  bfs(int[][] edges,int sv, int ev,boolean [] visited){
         
             if(sv>(edges.length-1) || ev> (edges.length-1)){
                 return false;
             }

             if(edges[sv][ev]==1){
                 return true;

             }

             Queue<Integer> qu=new LinkedList<>();
             visited[sv]=true;
             qu.add(sv);
             while(!qu.isEmpty()){
                 int front =qu.remove();
                 for(int i=0;i<edges.length;i++){
                     if(edges[front][i]==1 && !visited[i]){
                              if(i==ev) return true;

                              else{
                                  visited[i]=true;
                                  qu.add(i);
                              }
                     }
                 }
             }
             return false;

    }

    
}
