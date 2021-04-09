package recursion.tuntun.practice;

public class KnapsackRecursion {
    public static void main(String aa[]){
        int[] weights={1,2,3,5};
        int[] prices={40,20,30,100};
        int N=4;
        int C=7;
        System.out.println(knapsack(N,C,weights,prices));

    }
    public static int knapsack(int N,int C,int [] wt,int[] prices ){
        if(N==0 ||C==0) return 0;

        int ans=0;
        int inc,exc;
        inc=exc=0;
        
        //inc
        if(wt[N-1]<=C){
            inc =prices[N-1]+ knapsack(N-1, C-wt[N-1], wt, prices);
        }
        exc=knapsack(N-1, C, wt, prices);
        ans=Math.max(inc, exc);
        return ans;



    }
    
}
