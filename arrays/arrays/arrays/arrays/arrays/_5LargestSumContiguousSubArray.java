public class _5LargestSumContiguousSubArray {

  //[2,3,-5,3,4,5];

  public static void main(String[] args){
    subArray(new int[]{-1,-2,-3,-4});
  }

  public static void subArray (int[] arr){

    int sum=arr[0];
    int max=Integer.MIN_VALUE;
    for(int i=1;i< arr.length;i++){
        
        sum+=arr[i];
        if(sum>max){
          max=sum;
        }

        if(sum<0){
          sum=0;
        }
      System.out.println(sum +"  > "+ max);

    }

  }
  
}
