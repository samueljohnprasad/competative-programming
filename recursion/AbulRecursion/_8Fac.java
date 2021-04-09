package recursion.AbulRecursion;

public class _8Fac {
    public static void main(String aa[]){
        System.out.println(fac(5));

    }

    public static int fac(int num){
        if(num==0) return 1;

        return num*fac(num-1);
    }
    
}
