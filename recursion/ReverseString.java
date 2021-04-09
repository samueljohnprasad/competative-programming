package recursion;

public class ReverseString {
   public static void main(String aa[]){
       System.out.println(revStr("samueljohnprasad"));

   }
   
   public static String revStr(String str){
       if(str==null||str.length()<=1||str.isEmpty()){
           return str;

       }
       return revStr(str.substring(1))+str.charAt(0);

   }
}