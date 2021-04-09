package graphs.NC;
import java.util.*;
import java.io.*;

public class _9isConnected {
// 4 3
// 0 1
// 1 3 
// 0 3
//false

    public static void main(String args[]) throws IOException{


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str[]= br.readLine().split(" ");
        int n= Integer.parseInt(str[0]);
        int e=Integer.parseInt(str[1]);

        int arr[][] = new int[n][n];

        for(int i=0;i<e;i++){
            String s[]=br.readLine().split(" ");
            int v1=Integer.parseInt(s[0]);
            int v2=Integer.parseInt(s[1]);

              arr[v1][v2]=1;
              arr[v2][v1]=1;

            
        }

         System.out.println( isConnected(arr));






    }

    public static boolean isConnected(int [][] matrix){

        boolean [] visited= new boolean [matrix.length];

        dfs(matrix,0,visited);
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                return false;
            }
        }

        return true;

    }

    public static void dfs(int [][] matrix,int src,boolean [] visited){
          
        visited[src]=true;
        for(int i=0;i<matrix.length;i++){

            if(matrix[src][i]==1 && !visited[i]){
                dfs(matrix,i,visited);

            }

        }

    }
    
}
