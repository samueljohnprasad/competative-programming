
//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
public class _2SortZeroOneTwo {

  //[0,1,0,1,0,0]
  public static void main(String [] args){
       int[] sortedArr= sort(new int[]{1,0,2,0,1,0,1,1,1,1,2,1,0});
       for(int i: sortedArr){
         System.out.println(i);
       }
  }

  public static int[] sort(int[] arr){
     
   int start=0;
   int end= arr.length-1;

   int i=0;
   int j=arr.length-1;

   while(start<=end){

    if(arr[start]==0){
      int temp= arr[i];
       arr[i]=arr[start];
       arr[start]=temp;
       i++;
    }

      if(arr[end]==0){
       int temp= arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
       i++;
    }

     if(arr[start]==2){
      int temp= arr[j];
       arr[j]=arr[start];
       arr[start]=temp;
       j--;
    }

      if(arr[end]==2){
       int temp= arr[j];
        arr[j]=arr[end];
        arr[end]=temp;
       j--;
    }
     
    start++;
    end--;
   }
    return arr;
  }
  
}
