package recursion.AbulRecursion;

public class _2decrementNum {
    public static void main(String aa[]){
        dec(10);
    }
    public static void dec(int num){
        if(num>0){
            System.out.println(num);
            dec(num-1);
        }
    }
    
}
