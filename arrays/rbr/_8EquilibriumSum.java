package arrays.rbr;
public class _8EquilibriumSum {
    public static void main(String aa[]){

        int arr[]={7,2,1,4,6,4,0};
       System.out.println( equi(arr));

    }

    public static int equi(int arr[]){

        int i;
        int leftSum=0;
        int sum=0;

        for( i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        for( i=0;i<arr.length;i++){
            sum-=arr[i];
            if(leftSum==sum){
             return i;
            }
            
            leftSum+=arr[i];

        }

       return -1;

    }
    
}
