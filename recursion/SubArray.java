package recursion;

public class SubArray {

    public static void main(String aa[]){
        int [] arr={1,2,3};
        subArr(arr,0,0);

    }
    public static void subArr(int [] arr,int start, int end){

        if(end==arr.length){
            return;
        }else if(start>end){
            subArr(arr,0,end+1);
        }else{
            System.out.printf("[");
            for(int i=start;i<end;i++){
                System.out.printf(arr[i]+"]");
            }
            System.out.println(arr[end]+"]");
            subArr(arr, start+1, end);

        }

    }

   
    
}
