package arrays.rbr;
public class _20RotateSquareBy90deg {
    public static void main(String aa[]){

        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        reverseColums(arr);

        for(int[] i:arr){
            for(int x:i){
            System.out.print(x+" ");
            }
            System.out.println();
        }
       

    }

    public static void reverseColums(int arr[][]){

        int Rows=arr.length;
        int Colums=arr[0].length;
       // int k=0;

        for(int i=0;i<Rows;i++){
            for(int j=0,k=Colums-1;j<k;j++,k--){

                swap(arr,i,j,k);

            }
        }

        //transpose matrix

        for(int i=0;i<Rows;i++){
            for(int j=1;j<Colums;j++){
                swap(arr,i,j);
            }
        }

       
    }

    public static void swap(int [][] arr,int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;

    }
    public static void swap(int[][] arr,int i,int j,int k ){

        int temp=arr[i][j];
        arr[i][j]=arr[i][k];
        arr[i][k]=temp;

        
            
    }
    
}
