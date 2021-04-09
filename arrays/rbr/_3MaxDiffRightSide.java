package arrays.rbr;
public class _3MaxDiffRightSide {
    public static void main(String aa[]){
        int [] arr={4,3,10,2,9,1,6};

        System.out.println(getMaxDiff(arr));

    }

    public static int getMaxDiff(int []arr){
        int n=arr.length;
        int minSoFar=arr[0];
        int maxDiffSoFar=arr[1]-arr[0];
        int currDiff=arr[1]-arr[0];


        for(int i=1;i<n;i++){
            if(minSoFar>arr[i]){
                minSoFar=arr[i];
            }else{
                currDiff=arr[i]-minSoFar;
                if(currDiff>maxDiffSoFar){
                    maxDiffSoFar=currDiff;
                }
            }
        }

        return maxDiffSoFar;
    }
    
}
