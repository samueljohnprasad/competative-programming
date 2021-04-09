package recursion.tuntun;

public class MulWithoutStar {
    public static void main(String aa[])
    {
        System.out.println(mul(7,7));

    }
    public static int mul(int a,int n){
        if(n==1)
        return a;

        return a+ mul(a,n-1);
    }
    
}
