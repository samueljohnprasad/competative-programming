package arrays.rbr;
public class _11FindTheSubArrayWithGivenSumX {


    public static void main(String args[]){

        int [] arr={15,2,4,8,9,10,23};
        int x=arr.length;
        int sum=21;

        subArraySum(arr, x, sum);

    }

    public static void  subArraySum(int arr[],int x,int sum){

        int currSum=arr[0],start=0,index;
         
        for( index=1;index<=x;index++){

            while(currSum >sum && start <index-1){
                currSum=currSum-arr[start];

            }

            if(currSum==sum){
                System.out.println(start+" "+(index-1));
                return;
            }

            if(index<x){
                currSum=currSum+arr[index];
            }

        }

        System.out.println("not found");

    }
    
}
