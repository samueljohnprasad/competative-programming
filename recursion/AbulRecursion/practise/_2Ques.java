package recursion.AbulRecursion.practise;
public class _2Ques {
    public static void main(String aa[]){

        int a=2048;
        int sum=0;
        fun(a,sum);
        System.out.print(sum);
    
    }

    public static void fun(int n,int sum){
        int k=0;
        if(n==0 ) return ;
        k=n%10;
        int j=n/10;
        sum=sum+k;
        fun(j,sum);
        System.out.print(k);


    }
    
}
