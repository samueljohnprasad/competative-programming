package recursion;
class fact {
    public static void main(String aa[]){
      
       System.out.println(fac(4));

    }
  public static int fac(int a){
      if(a==0)
      return 0;

      int op=fac(a-1);
      return a*op;
  }
    
}