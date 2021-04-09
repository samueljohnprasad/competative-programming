package graphs.NC;
import java.util.*;
public class HasPathDfs {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();

        int matrix[][]= new int [v][v];

        for (int i=0;i<e;i++){
             
                int v1=sc.nextInt();
                int v2=sc.nextInt();

                matrix[v1][v2]=1;
                matrix[v2][v1]=1;

        }

        int s=sc.nextInt();
        int d=sc.nextInt();

         System.out.print(hasPath(matrix,s,d));



    }
    public static boolean hasPath(int [][] matrix,int source, int dest){

        boolean visited[]=new boolean [matrix.length];
         boolean path= hasPath(matrix,source,dest,visited);
         if(path){
             return true;
         }else{
             return false;
         }






    }
    public static boolean hasPath(int[][] matrix,int source,int dest,boolean [] visited){
                  if(source ==dest) return true;

                  visited[source]=true;

                  for(int i=0;i<matrix.length;i++){
                      if(matrix[source][i]==1 && !visited[i] ){
                          boolean path=hasPath(matrix,i,dest,visited);
                          if(path){
                              return true;
                          }
                      }
                  }
                  return false;

    }
    
}
