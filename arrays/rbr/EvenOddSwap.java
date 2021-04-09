package arrays.rbr;
import java.util.ArrayList;
import java.util.List;

 class EvenOddSwap {
    public static void main(String aa[]){

        List<Long> l= new ArrayList<>();
        l.add((long)1);
        l.add((long)2);
        l.add((long)3);
        l.add((long)4);
        l.add((long)8);


        evenOdd(l);

    }
    public static void evenOdd(List<Long> arr){
        int n=arr.size();
        int left=0;
        int right=n-1;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr.get(i)%2==0){
                left++;
            }
            if(arr.get(i)%2!=0){
                right--;
            }

            if(left<right){

                long temp=arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);

                count++;

            }
        }


        System.out.println(count);


    }
    
}
