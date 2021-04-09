package recursion.tuntun.practice;

public class FriendsProblem {
    public static void main(String aa[]){
        System.out.println(fun(4));

    }
    
    public static int fun(int n){

        if(n==1 ) return 1;
        if(n==0) return 1;

        
         
          //fun(n-1);
          //fun(n-2);
          int x=0;
          x+=fun(n-1);

        return x;

    }
    
    
}
