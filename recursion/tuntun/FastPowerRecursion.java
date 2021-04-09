package recursion.tuntun;

public class FastPowerRecursion {
    public static void main(String aa[]){
        System.out.println(power(5,3));
        System.out.println(fastPower(5,2));

    }
    public static int power(int a,int n){
        if(n==0)
        return 1;

        return a * power(a,n-1);

    }
    public static int  fastPower(int a,int n){

        if(n==0)
        return 1;

        int smaller_ans=fastPower(a, n/2);
        smaller_ans*=smaller_ans;

        if( (n&1)==1){
            return smaller_ans*a; 
        }
        return smaller_ans;
          


    }
    
}
