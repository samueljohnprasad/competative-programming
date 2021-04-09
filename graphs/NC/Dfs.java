package graphs.NC;
import java.util.*;

public class Dfs {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int v=sc.nextInt();
        int e=sc.nextInt();

        int matrix[][] = new int[v][v];
        for(int i=0;i<e;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            matrix[v1][v2]=1;
            matrix[v2][v1]=1;
        }

        dfsTraversal(matrix);
       sc.close();

    }
    public static  void dfsTraversal(int [][] matrix){
        
        boolean visited [] = new boolean [matrix.length];
        dfsTraversal(matrix,0,visited);

         

    }

    public static void dfsTraversal(int [][] matrix,int currentIndex,boolean [] visited){
            System.out.print(currentIndex +" ");
            visited[currentIndex]=true;
          for(int i=0;i<matrix.length;i++){
              if(matrix[currentIndex][i]==1 && !visited[i]){
                    dfsTraversal( matrix,i,visited);
              }
          }

    }
    
}
