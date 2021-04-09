package recursion;

public class PrintStringArrayAsChar {

    static String  [][] keypad ={{""},{""},{"ABC"},{"DEF"},{"GHI"},{"JKL"},{"MNO"},{"PQRS"},{"TUV"},{"WXYZ"}};

    public static void main(String aa[]){

        char [] in=new char[10];
        String [] out =new String[100];
        generate_names();


    }

    public static void generate_names(){

        
        for(int digit=0;digit<keypad.length;digit++)
        for(int k=0;k<keypad[digit].length;k++){

            for(int x=0;x<keypad[digit][k].length();x++)
             System.out.println(keypad[digit][k].charAt(x));
        }

    }

    
}
