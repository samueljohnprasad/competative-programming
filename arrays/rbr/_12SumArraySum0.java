package arrays.rbr;
public class _12SumArraySum0 {

      //largest subArray with equal number of 0 and 1s

      public static void main(String aa[]){
          int arr[]={1,0,0,0,1,0,0,0,0,0,0};

        findLargestSubArray(arr);


      }

      public static void findLargestSubArray(int [] arr){

        int maxSize=-1;
        int startIndex=0;
        int sumLeft[]=new int[arr.length] ;

        int min=arr[0];
        int max=arr[0];
        int index;
        sumLeft[0] =(arr[0]==0) ?-1:1;
        int size=arr.length;

        for(index=1;index<size;index++){
            sumLeft[index]=sumLeft[index-1]+((arr[index]==0 )?-1:1);

            if(sumLeft[index]<min){
                min=sumLeft[index];

            }

            if(sumLeft[index]>max){
                max=sumLeft[index];
            }
            int hash[]=new int[max-min+1];
            for(index =0;index<max-min+1;index++){
                hash[index]=-1;
            }

            for(index=0;index<size;index++){
                if(sumLeft[index]==0){
                    maxSize=index+1;
                    startIndex=0;
                }

                if(hash[sumLeft[index]-min]==-1){
                    hash[sumLeft[index]-min]=index;
                }else{
                    if((index-hash[sumLeft[index]-min])>maxSize){
                        maxSize=index-hash[sumLeft[index]-min];
                        startIndex=hash[sumLeft[index]-min]+1;
                    }
                }
            }

            if(maxSize==-1){
                System.out.println("not found");
            }else{
                System.out.println(startIndex+" "+(startIndex+maxSize-1));
            }

        }


      }
}
