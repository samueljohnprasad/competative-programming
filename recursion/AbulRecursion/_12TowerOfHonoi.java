package recursion.AbulRecursion;

public class _12TowerOfHonoi {
    
    public static void main(String aa[]){
        TOH(3, 1, 2, 3);


    }

    public static void TOH(int n,int A,int B,int C){
        if(n>0){
            TOH(n-1,A,C,B);
            System.out.println("from "+A+" to "+C);
            TOH(n-1, B, A, C);
        }

    }
}
