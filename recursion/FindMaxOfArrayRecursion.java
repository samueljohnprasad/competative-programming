package recursion;

public class FindMaxOfArrayRecursion {
    
    public static void main(String aa[]){
        int[] arr={102,5,4,1001,8,102};
        System.out.println(findMax(arr, 0, 0));

    }
    public static int findMax(int arr[],int idx,int max){

        if(arr.length==idx){
            return max;
        }
         
            if(max<arr[idx]){
            max=arr[idx];
            
        }

        return findMax(arr, idx+1, max);
       

      

    }
}
