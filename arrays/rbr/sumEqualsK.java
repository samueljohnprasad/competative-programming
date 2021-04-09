package arrays.rbr;
import java.util.HashMap;
import java.util.Map;

public class sumEqualsK {
    
    public static void main(String aa[]){

        int arr[]={1,2,3,4,5,6};
        int k=6;
        sum(arr,k);
        

    }

    public static void sum(int arr[],int k){
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
           int temp= k-arr[i];

           if(map.containsKey(temp)){
               map.get(temp);
               System.out.println(temp+" "+i);
           }

           map.put(arr[i],i);
        }

    }
}