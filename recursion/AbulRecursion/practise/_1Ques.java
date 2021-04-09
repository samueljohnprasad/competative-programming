package recursion.AbulRecursion.practise;

public class _1Ques {
    static int i=1;
    public static void main(String aa[]){
        System.out.println(fun(1));

    }

    public static int fun(int n){

       
        if(n>=5) return n;
        n=n+i;
        i++;
        return fun(n);

    }
    
}
