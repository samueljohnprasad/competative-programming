package recursion.AbulRecursion.practise;

public class _3Ques {
    public static void main(String aa[]){

    }
    public static int fun(int n){
        int x=1,k;
        if(n==1) return x;
        for(k=1;k<n;k++){
            x=x+fun(k)*fun(n-k);
        }
        return x;
    }
    
}
