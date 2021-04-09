package arrays.rbr;
public class _2MaxDiffRightSide {



        public static void main(String aa[]){
                 
            int arr[]={3,1,4,7,5,100,10};
           System.out.println(  maxDiff(arr));
    
    
        }
        
    
       
        public static int maxDiff(int [] arr){
            int n=arr.length;
            int diff[]=new int[n];
    
            for(int i=0;i<n-1;i++){
                diff[i]=arr[i+1]-arr[i];
            }
    
            int currDiff=diff[0];
              
               
            for(int i=1;i<n-1;i++){
               
                
                if(diff[i-1]>0){
                    diff[i]=diff[i]+diff[i-1];
                }
                currDiff=Math.max(currDiff,diff[i]);
           
            }
    
            return currDiff;
    
        }
    }