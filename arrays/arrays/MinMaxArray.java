package arrays;
import java.util.*;

//[2,3,1,5,4]
//time complexity n/2
public class MinMaxArray {
  public static void main (String[] args){

        List<Integer> minMaxList =  minMaxArray(new int[]{1,2,23,73,344,33,43,4,32,32,3,32});
        for(int i: minMaxList){
          System.err.println(i);
        }
  }

   public static List<Integer> minMaxArray(int[] arr){
    int start=0;
    int end=arr.length-1;
    int max= Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<Integer>();
        while(start<=end){
           
          if(arr[start]>max){
            max= arr[start];
          }
          if(arr[end]>max){
            max= arr[end];
          }

          if(arr[start]<min){
            min= arr[start];
          }
          if(arr[end]<min){
            min= arr[end];
          }

          start++;
          end--;

        }
        list.add(min);
        list.add(max);
    return list ;
   }
}
