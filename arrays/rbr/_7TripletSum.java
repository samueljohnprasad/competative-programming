package arrays.rbr;
import java.util.Arrays;

public class _7TripletSum {
    

    public static void main(String aa[]){

        int arr[]={0,3,44,5,9,7};
      System.out.println( threeSome(arr,19));

    }
    public static boolean threeSome(int []arr,int sum){
         int n=arr.length;
          Arrays.sort(arr);

        for(int i=0;i<n-2;i++){
            int left=i+1; 
            int right=arr.length-1;

            while(left<right){
                int tripletSum=arr[i] + arr[left] + arr[right];

                if(tripletSum==sum){
                     return true;
                }

                if(tripletSum<sum){
                    left++;

                }else{
                    right--;
                }
            }


        }

        return false;
    }
}
