import java.util.*;
//Move all negative elements to end
//Given an unsorted array arr[] of size N having both negative and positive integers.
//The task is place all negative element at the end of array without
// changing the order of positive element and negative element.
public class _3MoveNegativesToEnd {
  public static void main(String args[]){
  int[] sorted= moveToEnd(new int[]{-5, 7, -3, -4, 9, 10, -1, 11});
   for(int i: sorted){
    System.out.print(i+" ");
   }
  }

  public static int[] moveToEnd(int[] arr){
    List<Integer> positives = new ArrayList<>();
    List<Integer> negatives = new ArrayList<>();

        for(int i: arr){
          if(i>=0){
            positives.add(i);
          }else{
            negatives.add(i);
          }
        }

      int [] res = new int[arr.length];
      int increment=0;
      for( int i=0;i<positives.size();i++){
        res[increment++]= positives.get(i);
      }
       for(int i=0;i<negatives.size();i++){
        res[increment++]= negatives.get(i);
      }
     
      return res;
  }
}
