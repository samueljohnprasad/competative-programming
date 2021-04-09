package arrays.rbr;
public class _18TrappingRainWater {

    public static void main(String aa[]){

        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(rainWater(arr));

    }
    public static int  rainWater(int []arr){

        int index;
        int water=0;
        int left[]=new int [arr.length];
        int right[]=new int [arr.length];
        
        left[0]=arr[0];
        int size=arr.length;
        for(index=1;index<size;index++){
            left[index]=Math.max(left[index-1],arr[index]);

        }

        right[size-1]=arr[size-1];
        for(index=size-2;index>=0;index--){
           right[index]=Math.max(right[index+1],arr[index]);
        }

        for(index=0;index<size;index++){
            water+=Math.min(left[index],right[index])-arr[index];
        }

        return water;


    }
    
}
