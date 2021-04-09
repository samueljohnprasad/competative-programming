package arrays.rbr;
public class _14FindDuplicatesInOnTimeOnspace {

    public static void main(String args[]){
        int [] arr={1,2,3,1,3,6,6};
        duplicates(arr);



    }

    public static void duplicates(int [] arr){

         int i;
         int size=arr.length;
         for( i=0;i<size;i++){
             if(arr[Math.abs(arr[i])]>=0){
                 arr[Math.abs(arr[i])]= - arr[Math.abs(arr[i])];

             }else{
                 System.err.println(Math.abs(arr[i]));
             }
         }

    }
    
}
