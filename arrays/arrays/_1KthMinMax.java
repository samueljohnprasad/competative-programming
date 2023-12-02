import java.util.*;

public class _1KthMinMax {

//[1,2,3,4,5]
  //[2,1,4,3,5]
  //0 1 2
  public static void main (String [] args){
   
    int min = kthMinMax(new int[]{7, 10, 4 ,3, 20,33, 15}, 4);
    System.err.println(min);
  }

  public static int kthMinMax(int[] arr, int k){

     PriorityQueue<Integer> q = new PriorityQueue<>();
      int start=0;
      int end= arr.length-1;

      while(start<end){
          q.add(arr[start]);
          q.add(arr[end]);

          start++;
          end--;
      }

      if(arr.length%2==1){
        q.add(arr[(arr.length/2)]);
      }

     for(int i=0;i<k-1;i++){
        q.poll();
     }

    return q.poll();
  }
  
}
