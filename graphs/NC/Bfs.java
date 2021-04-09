package graphs.NC;
import java.util.*;
public class Bfs {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();

        int matrix[][]= new int[v][v];

        for(int i=0;i<e;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();

            matrix[v1][v2]=1;
            matrix[v2][v1]=1;

        }

        bfsTraversal(matrix);


    }
    public static void bfsTraversal(int [][] matrix){

             Queue<Integer> qu= new LinkedList<>();

             boolean visited[]= new boolean [matrix.length];

             visited[0]=true;
             qu.add(0);
             while(!qu.isEmpty()){

                int currentVertex=qu.poll();
                System.out.print(currentVertex+" ");
                for(int i=0;i<matrix.length;i++){

                       if(matrix[currentVertex][i]==1 && !visited[i]){
                           qu.add(i);
                           visited[i]=true;
                       }
                }
             }

    }
   
    
}
