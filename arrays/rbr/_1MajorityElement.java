package arrays.rbr;
public class _1MajorityElement {

    public static void main(String aa[]){

        int arr[]={1,2,2,2,3,4};
          int majorElement=majority(arr);
          isMajorElement(arr,majorElement);

    }

    public static int majority(int[] arr){

        int majorityIndex=0;
        int count=1;

        int n=arr.length;
        for(int i=0;i<n;i++){
              
            if(arr[majorityIndex]==arr[i]){
                count++;

            }else {
                count--;
            }

            if(count==0){
                majorityIndex=i;
                count=1;
            }
        }

        return arr[majorityIndex];


    }

   static  boolean isMajorElement(int [] arr,int majorElement){
        int count=0;
        int n=arr.length/2;
        for(int i=0;i<n;i++){
            if(arr[i]==majorElement){

                count++;

            }
        }

        return (count>n/2);
    }

    
}
