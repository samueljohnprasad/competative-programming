package arrays.rbr;
public class ZeroOneSwap {
    public static void main(String aa[]){

        int arr[]={0,1,0,1,1,0,1,0,0,1,0,1,1,1,0,1,0};
        int arr1[]={5,74,6,8,4,4,7,7,6,4,646,47,47,4,64,7,7,7,64,6,6,6,6,6,3,1,1,57674,8};

        // zeroOne(arr);

        // for (int i : arr) {
        //     System.out.print(i+" ");
            
        // }

        evenOdd(arr1);
        for (int i : arr1) {
            System.out.print(i+" ");
            
        }

    }

    public static void evenOdd(int [] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){

            while(arr[left]%2==0 && left<right){
                left++;
            }

            while(arr[right]%2!=0 && left<right){
                right--;
            }

            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

            }
        }
    }

    public static void zeroOne(int [] arr){
        int left=0;
        int right=arr.length-1;

        while(left<right){

            while(arr[left]==0&& left<right){
                left++;
            }

            while(arr[right]==1 && left<right){
                right--;
            }

            if(left<right){

                arr[left++]=0;
                arr[right--]=1;


            }

        }

    }
    
}
