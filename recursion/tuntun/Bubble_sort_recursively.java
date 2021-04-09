package recursion.tuntun;

public class Bubble_sort_recursively {
    public static void main(String aa[]){
        int [] arr={5,3,4,1};
        System.out.println(bubble_sort_recursively(arr, 0,4));
        for (int i : arr) {
            System.out.print(i+",");
            
        }

    }
    // public static int[] bubble_sort_recursively(int [] arr,int j,int n){
    //     if(n==1)
    //      return arr;

    //      if(j==n-1){
    //      return bubble_sort_recursively(arr, 0, n-1);
    //      }

    //       if(arr[j]>arr[j+1]){
    //       int temp=arr[j+1];
    //       arr[j+1]=arr[j];
    //       arr[j]=temp;
    //       }

          
    //       return bubble_sort_recursively(arr,j+1,n);


    // }
    public static  int[] bubble_sort_recursively(int [] arr, int j,int n){
        if(n==1)
        return arr;

        if(j==n-1)
        return bubble_sort_recursively(arr, 0, n-1);

        if(arr[j]>arr[j+1]){
            int temp =arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
        }

        return bubble_sort_recursively(arr, j+1, n);
    }
    
}
