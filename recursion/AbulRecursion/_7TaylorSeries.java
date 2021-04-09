package recursion.AbulRecursion;
public class _7TaylorSeries {
     //1 + x/1 + x2/2! + x3/3!......

     static double p=1,f=1;

    static double s=1;
    public static void main(String aa[]){
      //System.out.println( taylorSeries(2,10));
      System.out.println( taylorSeries(2,10));
      

    }

    //o(n)
    public static double taylorSeries(double x,double n){
        
        if(n==0)
        return s;

        s=1+x/n*s;
        return taylorSeries(x,n-1);


    }

    //o(n2)
    public static double taylorSeriess(double  x,double n){
        int r=0;
        if(n==0) return 1;
        else taylorSeriess(x,n-1);
             p=p*x;
             f=f*n;

        
    return r+p/f;
}
    
}
