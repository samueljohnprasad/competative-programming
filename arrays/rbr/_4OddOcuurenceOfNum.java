package arrays.rbr;
public class _4OddOcuurenceOfNum {

    public static void main(String aa[]){

        int arr[]={2,3,4,2,4,3,5,5,7,6,6,7,8};
        System.out.println(oddNum(arr));


    }

    public static int oddNum(int [] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res^=arr[i];

        }
        return res;
    }

   
    
}
