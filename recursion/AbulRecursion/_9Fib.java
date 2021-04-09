package recursion.AbulRecursion;

public class _9Fib {
    public static void main(String aa[]){

        System.out.println(fib(10));

    }

    public static int fib(int num){
        if(num==0) return 0;
        if(num ==1) return 1;

        return fib(num-1)+fib(num-2);
    }
    
}
