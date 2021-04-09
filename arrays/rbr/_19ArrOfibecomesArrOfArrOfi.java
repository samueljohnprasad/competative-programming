package arrays.rbr;
public class _19ArrOfibecomesArrOfArrOfi {

    public static void main(String args[]){

        int arr[] ={4,3,2,5,6,1,0};
        rearrangeArr(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }

    }

    public static void  rearrangeArr(int input[]){

        //first step increase all values by (arr[arr[i]%n]) *n
        int i=0;
        int size=input.length;
        for(i=0;i<size;i++){
            input[i]+=(input[input[i]]%size)*size;

        }

        //second step- divide all values by n

        for(i=0;i<size;i++){
            input[i]/=size;
        }

    }
    
}
