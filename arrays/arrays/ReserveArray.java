package arrays;


//one pointer from start and one from end, and swap the values
// two edge cases   //[1,2,3,4,5] //[1,2,3,4]
// n/2 complexity
class ReverseArray{
  public static void main(String [] args ){
   int[] reversedArray= reverseArray(new int[]{1,2,34,65});
    for(int i: reversedArray){
       System.out.println(i);
    }
  }

  public static int[] reverseArray(int[] arr){
      int i=0;
      int j = arr.length-1;
      while(i<=j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
        i++;
        j--;
      }

      return arr;
  }
}