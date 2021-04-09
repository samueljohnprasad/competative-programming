package recursion.AbulRecursion;

public class _5SumOfNaturalNum {
    public static void main(String aa[]){
        System.out.println(sum(10));

    }

    public static int sum(int num){
        if(num==0){
            return 0;
        }else{
            return sum(num-1)+num;
        }
        
    }
    
}
