package recursion;

public class CheckIfArraySorted {
    public static void main(String aa[]){
        int [] arr={2,3,4,5,8,9,11,22,33,44,55,66,77,88,99};
        System.out.println(sortedArray(arr,arr.length-1));
    }
     public static boolean sortedArray(int [] arr,int size){

        if(size==1)
          return true;

          if(arr[size-1]>arr[size])
             return false;
             
         
        boolean b= sortedArray(arr, size-1);

        return b;

    }
    
}
