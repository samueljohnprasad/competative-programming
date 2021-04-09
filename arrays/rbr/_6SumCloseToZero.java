package arrays.rbr;
import java.util.Arrays;

public class _6SumCloseToZero {
    public static void main(String aa[]){

        int arr[]={0,59-9,69,-79,84,1,0};
        System.out.println(closeToZero(arr));


    }

    public static int closeToZero(int [] arr){

        Arrays.sort(arr);

        int leftIndex=0;
        int rightIndex=arr.length-1;
        int currSum=0;
        int closestSum=Integer.MAX_VALUE;
        int min_l_index=0;
        int min_r_index=arr.length-1;


        while(leftIndex<rightIndex){

            currSum=arr[leftIndex]+arr[rightIndex];
            if(Math.abs(currSum)<Math.abs(closestSum)){
                closestSum=currSum;
                min_l_index=leftIndex;
                min_r_index=rightIndex;


            }

            if(currSum<0){
                leftIndex++;
            }else{
                rightIndex--;
            }



        }

        return closestSum;

    }
    
}
