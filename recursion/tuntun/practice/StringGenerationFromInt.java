package recursion.tuntun.practice;

public class StringGenerationFromInt {
    public static void main(String aa[]){
       
          String in="1345";
        //String [] out=new String[100];
        intToString(in, "");

    }
    public static void intToString(String in,String out){
        if(in.length()==0){
            System.out.println(out);
            return;}

        //rec case
        // 1digit
        int digit=in.charAt(0)-'0';
        //System.out.println(digit);
        char ch= (char)(digit+'A'-1) ;
        //out+=ch;
        //System.out.println(ch);
        String sub=in.substring(1);
       // System.out.println(sub);
        intToString(sub, out+ch);
      

          if(in.length()+1>2){
             int scnd= in.charAt(1)-'0';
            int no= digit*10+ scnd;
          //  System.out.println(scnd);
              if(no<=26){
                ch=(char)(no+'A'-1);
                sub=in.substring(2);
                intToString(sub, out+ch);
            }

           // System.out.println(in.length()+1 + scnd);
        }
        
        return;
        

    }
    
}
