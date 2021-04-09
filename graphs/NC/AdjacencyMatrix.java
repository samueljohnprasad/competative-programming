package graphs.NC;
import java.util.*;

public class AdjacencyMatrix {

/*
4 5
0 1
0 2
3 0
1 3
2 3
*/
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();

        int adjMatrix[][] = new int[n][e];

        for(int i=0;i<e;i++){
            int v1=sc.nextInt();
            int v2= sc.nextInt();
            adjMatrix[v1][v2]=1;
            adjMatrix[v2][v1]=1;
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }


        sc.close();
    } 
    
}
