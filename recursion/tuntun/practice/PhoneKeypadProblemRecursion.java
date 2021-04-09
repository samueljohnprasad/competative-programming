package recursion.tuntun.practice;
import java.util.Scanner;

public class PhoneKeypadProblemRecursion {

    static String  [] keypad ={"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    public static void main(String aa[]){

        Scanner sc=new Scanner(System.in);
       String str= sc.nextLine();

       generate_names(str,"");

       sc.close();


    }

    public static void generate_names(String ques,String ans){
 
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch=ques.charAt(0);
        String sub= ques.substring(1);

        String str= keypad[ch-'0'];   
        for(int i=0;i<str.length();i++ ){
            char charat= str.charAt(i);
            generate_names(sub,ans+charat); 
        }
       
    }

    
}
