package graphs.NC;
import java.util.*;

public class DfsForComponents {

    public static void main(String args[]){

// 4 4
// 0 1
// 0 3
// 1 2
// 2 3

        Scanner sc= new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int matrix[][] =new int[v][v];

        for(int i=0;i<e;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();

            matrix[v1][v2]=1;
            matrix[v2][v1]=1;
           
        }

        dfsComponents(matrix);
    }

    public static void dfsComponents(int [][] matrix){

        boolean visited[]= new boolean [matrix.length];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
             dfsComponents(matrix,i,visited);
             System.out.println();
            }
            
        }
    }

    public static void dfsComponents(int [][] matrix,int currentIndex,boolean[] visited){

              visited[currentIndex]=true;
              System.out.print(currentIndex+" ");

           for(int i=0;i<matrix.length;i++){
                  
                   if(matrix[currentIndex][i]==1 && !visited[i]){
                           
                           dfsComponents(matrix,i,visited);
                   }
           }
    }
    
}
