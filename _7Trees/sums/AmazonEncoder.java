package _7Trees.sums; 


import java.util.PriorityQueue;

public class AmazonEncoder {

    public static void main(String argd[]){

        int arr[]={8,4,6,12};

        System.out.println(encoder(arr));

    }

    public static int encoder(int arr[]){

        PriorityQueue <Integer> pq=new PriorityQueue<>();
        int res=0;

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        while(pq.size()>1){
         
                int a=pq.poll();
                 int b=pq.poll();
                 res +=(a+b);
                 pq.add((a+b));
            
        }

        return res;

    }
    
}
