package recursion;

public class ReverseNum {
    public static void main(String aa[]){

        revNum(52642);

    }

    public static void revNum(int num){
        if(num<10){
        System.out.println(num);
        return;
        }else{


        System.out.print(num%10);
        revNum(num/10);
        }
    }
    
}
