package recursion.AbulRecursion;

public class _10FibwithDp {
    static int arr[]= new int[10];
    public static void main(String aa[]){
        for(int i=0;i<10;i++){
            arr[i]=-1;
        }
        
       System.out.println(fib(10));

    }


   
    public static int fib(int num){
        if(num<=1){
            arr[num]=num;
            return num;
        }else{

            if(arr[num-2]==-1)
            arr[num-2]=fib(num-2);


            if(arr[num-1]==-1)
            arr[num-1]=fib(num-1);
        }
        return arr[num-2]+arr[num-1];
    }
    
}
