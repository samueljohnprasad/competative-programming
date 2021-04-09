package graphs.OnlineJudge;
import java.util.*;
import java.io.*;
public class _4vertex {
      public static boolean [][]mat;
       public static boolean [] traveled;
    public static void main(String args[]) throws IOException{
       

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine()) !=null){

             int n=Integer.parseInt(s);
             if(n==0){
                 break;
             }

             mat=new boolean [n][n];
             while(true){
                 StringTokenizer st=new StringTokenizer(br.readLine());
                 int src=Integer.parseInt(st.nextToken())-1;

                 if(src==-1){
                     break;
                 }

                 while(st.hasMoreTokens()){
                     int dest=Integer.parseInt(st.nextToken())-1;
                     if(dest==-1){
                         break;
                     }

                     mat[src][dest]=true;
                 }
             }

             printMat(mat);
             StringTokenizer st=new StringTokenizer(br.readLine());
             int checkCount=Integer.parseInt(st.nextToken());
             for(int i=0;i<checkCount;i++){
                 int toCheck=Integer.parseInt(st.nextToken())-1;
                 traveled=new boolean[n];
                 floodfill(toCheck);
                 int [] unavailableList= new int[n+1];

                   
                 for(int k=0;k<n;k++){
                    if(!traveled[k]){
                        System.out.println(traveled[k]+" "+k );
                        
                    }
                }

                 for(int k=0;k<n;k++){
                     if(!traveled[k]){
                                          //increasing the count at 0th index and inserting k in order based on count
                         unavailableList[++unavailableList[0]]=k+1;  //plus 1 bz its 1 based index
                     }
                 }
                 //System.out.println(unavailableList[0]);

                 for(int k=0;k<=unavailableList[0];k++){
                    // System.out.print(unavailableList[k]+"k ");
                     if(k<unavailableList[0]){
                        // System.out.print(' ');
                     }
                 }
                // System.out.println();
             }

        }

      


    }

    public static void floodfill(int start){

        for(int i=0;i<mat.length;i++){
            if(mat[start][i] && !traveled[i]){
                traveled[i]=true;
                System.out.print(i+"i");
                floodfill(i);
                System.out.println();

            } 
        }
    }

    public static void printMat(boolean[][] mat){

        for(boolean[] b: mat){

            for(boolean bb: b){
                System.out.print(bb+" ");
            }
            System.out.println();

        }

    }

/*
3
1 2 0
2 2 0
3 1 2 0
0
2 1 2
0

*/

    
}
