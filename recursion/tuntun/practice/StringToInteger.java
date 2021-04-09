package recursion.tuntun.practice;

public class StringToInteger {
    public static void main(String aa[]){
        String str="1234";
        char[] c=str.toCharArray();
       System.out.println(stringToInteger(c,str.length())+1);

    }
    public static int stringToInteger(char[] c,int n){
        if(n==0) return 0;

         int digit=c[n-1]-'0'; //last digit
         int smaller_ans=stringToInteger(c, n-1);
         return smaller_ans*10+digit; 

    }
    
}
