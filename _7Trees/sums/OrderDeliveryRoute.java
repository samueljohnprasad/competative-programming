package _7Trees.sums; 

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class OrderDeliveryRoute {

    public static void main(String args[]){
        int arr[][]={{1,1,1},
                     {1,9,1},
                     {1,9,1}};

        System.out.println(order(arr));


    }

    public static int order(int arr[][]){

        QItems source= new QItems(0, 0,0 );
        int N=arr.length;
        int M=arr[0].length;

        boolean visited [][]=new boolean [N][M];

        for(int i=0;i<N;i++ ){
            for(int j=0;j<M;j++){
                if(arr[i][j]==0){
                    visited[i][j]=true;
                }else{
                    visited[i][j]=false;
                }
            }
        }


        

         source.row=0;
         source.col=0;



         Queue<QItems> q=new LinkedList<>();
         q.add(source);
         visited[ source.row][source.col]=true;
         while(!q.isEmpty()){
              QItems p= q.poll();

             //destination found
             if(arr[p.row][p.col]==9){
             return p.dist;
             }

             //moving up
             if(p.row- 1 >= 0 && visited[p.row-1][p.col]==false ){
                 q.add(new QItems(p.row-1,p.col,p.dist+1));
                 System.out.println(p.row- 1+"p.row " +(arr[p.row-1][p.col])+" ar[][] A");
                 visited[p.row-1][p.col]=true;
                }

             //moving down
             if(p.row+1< arr.length && visited[p.row+1][p.col]==false){
                 q.add(new QItems(p.row+1,p.col,p.dist+1));
                 visited[p.row+1][p.col]=true;
                

             }

             //movind left
             if(p.col-1>=0 && visited[p.row][p.col-1]==false){
                q.add(new QItems(p.row,p.col-1,p.dist+1));
                visited[p.row][p.col-1]=true;
                
             }

             //moving right
             if(p.col+1< arr[0].length && visited[p.row][p.col+1]==false){
                q.add(new QItems(p.row,p.col+1,p.dist+1));
                System.out.println(p.col+1+"p.row " +( arr[p.row][p.col+1])+" ar[][] D");
                visited[p.row][p.col+1]=true;
               
             }
         }
         return -1;


    }

    
    
}

class QItems{
    int row;
    int col;
    int dist;
    QItems(int x,int y,int w){
        this.row=x;
        this.col=y;
        this.dist=w;


    }
}
