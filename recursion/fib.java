package recursion;

class fibi {
    public static void main(String aa[]){
      
       System.out.println(fib(9));

    }
  public static int fib(int a){
      if(a==0)
       return 0;

    if(a==1)
    return 1;

        int x=fib(a-1);
        int y=fib(a-2);

        return x+y;
     
  }
    
}