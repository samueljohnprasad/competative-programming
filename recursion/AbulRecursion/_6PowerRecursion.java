package recursion.AbulRecursion;

public class _6PowerRecursion {
    public static void main(String aa[]){
       System.out.println(power(2,2));
    }
    public static int power(int m, int n){
        if(n==0)
        return 1;

        return power(m,n-1)*m;
    }
    
}
