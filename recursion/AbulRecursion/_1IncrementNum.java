package recursion.AbulRecursion;
public class _1IncrementNum {

    public static void main(String aa[]){

        inc(10);

    }
    public static void inc(int num){

        if(num>0 ){
            inc(num-1);
            System.out.println(num);

        }
    }

    
}
