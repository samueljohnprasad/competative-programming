package recursion.tuntun.practice;

public class LadderProblemRecursion {
    public static void main(String aa[]){

       // System.out.println(ladderProblem(4));
        System.out.println(ladderProblem2(10,10));



    }

    //1111
    //112
    //121
    //211
    //13
    //31
    //22
    public static int ladderProblem(int n){
        if(n==0) return 1;

        if(n<0) return 0;

        return ladderProblem(n-1)+ladderProblem(n-2)+ladderProblem(n-3);
    }

     
    public static int ladderProblem2(int n,int k){
        if(n==0) return 1;
        if(n<1) return 0;
        int ans=0;
        for(int i=1;i<=k;i++){
            ans+=ladderProblem2(n-i,k);
        }

        return ans;
    }
}
