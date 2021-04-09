package recursion.AbulRecursion;

public class _3RecusionWithStaticVar {
    static int x=0;
    public static void main(String aa[]){
        System.out.println(staticVarEx(5));
        System.out.println(staticVarEx(5)); //static increses from 5to10
        System.out.println(withoutStaticVar(5));

    }


    public static int staticVarEx(int num){
        if(num>0){
            x++;
            return staticVarEx(num-1)+x;
       }
        return 0;
    }
    
    public static int withoutStaticVar(int num){
        if(num<1)
         return 0;


       return withoutStaticVar(num-1)+num;
    }

    

    
}
