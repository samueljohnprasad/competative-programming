package recursion.tuntun.practice;

public class SubSequenceGenaration {
    public static void main(String aaa[]){
 
        String str="abc";
        char [] in=new char[10];
        for (int i=0;i<str.length();i++) {
            in[i]=str.charAt(i);
        }
        // for (char c : in) {
        //     System.out.println(c);
        // }
        char [] out=new char[50];
        subsequnce(in, out, 0, 0);
        
      
    }
    public static void subsequnce(char [] in,char [] out,int i,int j){
        if(in[i]=='\0'){
             out[j]='\0'; 
            for(int k=0;k<=out.length;k++) {
                if(out[k]!='\0'){
                    System.out.print(out[k]);
                }else{
                    break;
                }
               
            }
        
         System.out.println(); 
         return;
        }

        out[j]=in[i];
        subsequnce(in, out, i+1, j+1);
        subsequnce(in, out, i+1, j);
        
    }
    
}
