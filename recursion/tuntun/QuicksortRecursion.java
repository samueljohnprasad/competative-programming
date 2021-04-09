package recursion.tuntun;

import java.lang.reflect.Array;
import java.util.Collection;

public class QuicksortRecursion {
    public static void main(String aa[]){
        int [] arr={5,6,1,7,3,4};
        System.out.println();
        quicksort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i+",");
            
        }

    }
    public static void quicksort(int [] arr,int start ,int end){

        if(start>=end) return ;

        int pivot=partition(arr,start,end);
        quicksort(arr, start, pivot-1);
        quicksort(arr,  pivot+1,end);
       
        
    }

    public static int partition (int[] arr,int start,int end){
        int  i=start-1;
        int j=start;

        int pivot=arr[end];

        for(;j<=end-1;j++){
            if(arr[j]<=pivot){
                //swap the smaller element in the i+1 region
                i+=1;
                swap(arr, i, j);
                
            }
        }
        // place the pivot in the correct index 
        // swap element i+1(first elemt in greater elements) with end 
       swap(arr, i+1,end);
       return i+1;
     }

    public static void swap(int []arr,int i,int j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
    }
    
}
