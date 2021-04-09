package arrays.rbr;
public class _12SubArrayWithSum0 {

    public static void main(String args[]){
        int arr[]={1,1,-1,1,-1,1,-1,-1,1,-1};
        subArraySum(arr);


    }

    public static void subArraySum(int arr[]){

        int i,j,currSum;
        int size=arr.length;

        for( i=0;i<size;i++){

            currSum=0;
            for(j=1;j<size;j++){
                currSum+=arr[j];

                if(currSum==0){
                    System.out.println(i+" "+j);
                }
            }

        }

    } 
    
}
