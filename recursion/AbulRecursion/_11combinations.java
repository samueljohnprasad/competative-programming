package recursion.AbulRecursion;

public class _11combinations {

    public static void main(String aa[]){
        System.out.println(NCR(4,2));

    }

    public static int NCR(int n,int r){
        if(n==r || r==0)
        return 1;;


        return NCR(n-1,r-1)+NCR(n-1,r);
    }
    
}
