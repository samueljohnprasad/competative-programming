package arrays.rbr;
public class _16SortInWave {

    public static void main(String aa[]){
         
        int arr[]={10,90,49,2,1,5,23};

        sortInWave(arr);

        for(int i :arr){
            System.out.print(i+" ");
        }

    }
    public static void sortInWave(int arr[]){
         int n=arr.length;
        for(int i=0;i<n;i+=2){
            if(i>0 && arr[i-1]>arr[i]){
                swap(arr, i,i-1);

            }

            if(i<n-1 && arr[i]<arr[i+1]){
                swap(arr, i, i+1);
            }
        }

    }

    public static void swap(int arr[] ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
