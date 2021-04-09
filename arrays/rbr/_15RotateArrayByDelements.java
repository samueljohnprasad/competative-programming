package arrays.rbr;
public class _15RotateArrayByDelements {

    public static void main(String aa[]){

        int arr[]={1,2,3,4,5,67,8,9};
        rotateArr(arr, 5);

        for(int i:arr){
            System.out.print(i+" ");
        }


    }
    public static void rotateArr(int arr[],int d){
        int index1,index2,index3,temp;
        int size=arr.length;
        for(index1 =0;index1<d;index1++){
            temp=arr[index1];
            index2=index1;

            while(true){
                index3=index2+d;
                if(index3>=size){
                    index3=index3-size;


                }
                if(index3==index1){
                    break;
                }

                arr[index2]=arr[index3];
                index2=index3;
            }

            arr[index2]=temp;
                }

    }
    
}
