package recursion.tuntun;

public class MergeSortRecursion {
    
    public static void main(String aa[]){
        int [] arr={5,3,6,1};
       mergeSort(arr, 0, arr.length-1);

       for (int i=0;i<arr.length;i++) {
           System.out.print(arr[i]+",");
       }

    }

    public static void mergeSort(int[] arr,int start,int end){

      

        //base element 1 or 0 element
        if(start>=end) return  ;

        //follow 3steps
        //1. divide
        int mid=(start+end)/2;

        //2.sort
        //recursively sort the two arrays ==> (start,mid)and (mid+1 ,end)
        mergeSort(arr, start, mid);
        
        mergeSort(arr, mid+1,end);

        //3.Merge the two parts
        //System.out.println(start+","+end);
         merge(arr,start,end);

        
        
    }

    public static  void merge(int[] arr,int start ,int end){
       
        int mid=(start+end)/2;
        int i=start;
        int j=mid+1;
        int k=start;
        int[] temp=new int[100];
 
       
        
        

    
        
        

        while(i<=mid && j<= end){
           // System.out.println(arr[i]+" < "+arr[j]);
            
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }

        
         while(i<=mid){
                temp[k]=arr[i];
                k++;
                i++;
          }

        
        
        while(j<=end){
            temp[k]=arr[j];
            k++;
            j++;
        }
    

        for (int l=start;l<=end;l++) {

           arr[l]=temp[l];
         
            
        }
        

        // for(int p=0;p<arr.length;p++){
        //     arr[p]=temp[p];
          
        // }

    }
    
}
