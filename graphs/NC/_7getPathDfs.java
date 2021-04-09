package graphs.NC;
import java.util.*;
import java.io.*;

public class _7getPathDfs {
    public static void main(String args[]) throws IOException{

        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));

        String [] str=br.readLine().split("\\s");
        int n=Integer.parseInt(str[0]);
        int e=Integer.parseInt(str[1]);

        int edges[][]=new int[n][n];

        for(int i=0;i<e;i++){
            String[] str1=br.readLine().split(" ");
            int fv=Integer.parseInt(str1[0]);
            int sv=Integer.parseInt(str1[1]);

            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }

        String []str2= br.readLine().split(" ");
        int src=Integer.parseInt(str2[0]);
        int dest=Integer.parseInt(str2[1]);

        ArrayList<Integer> arr= getPathDfs(edges,src,dest);
        
        if(arr!=null){
            for(int i: arr){
                System.out.print(i+" ");
            }
        }
        




    }

    public static ArrayList<Integer> getPathDfs(int [][] edges,int src,int dest){
        boolean visited[] = new boolean[edges.length];

        return getPathDfs(edges,src,dest,visited);


    }

    public static ArrayList<Integer> getPathDfs(int [][] edges,int src,int dest,boolean [] visited){
          
              if(src==dest){
                  ArrayList<Integer> res= new ArrayList<>();
                  res.add(src);
                  return res;

              }
              visited[src]=true;

              for(int i=0;i<edges.length;i++){
                  if(edges[src][i]==1 && !visited[i]){
                      ArrayList<Integer> output= getPathDfs(edges, i, dest, visited);
                      if(output!=null){
                          output.add(src);
                          return output;
                      }
                  }

              }
           
              return null;

    }


    
}
