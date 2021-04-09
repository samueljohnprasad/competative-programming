package graphs;
import java.util.*;

public class MyMain {

    public static void main(String args[]){

        Scanner sc= new Scanner (System.in);
        Long n=sc.nextLong();

        if(n<0){
            System.out.println("Wrong Input");
            return;
        }
        Long power= ((n*n)*n)*n;

        

        String str =power+"";
        int res=Integer.parseInt(str.charAt( str.length()-1)+"" );
        //System.out.println(power+" "+res);
         
        if(n== res){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");

        }
    }
    
}
