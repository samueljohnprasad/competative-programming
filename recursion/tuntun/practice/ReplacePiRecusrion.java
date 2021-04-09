package recursion.tuntun.practice;

public class ReplacePiRecusrion {
    public static void main(String aa[]){
        String str="dnpigfhpipichcpi";
        char[] c=new char[100];
        for(int i=0;i<str.length();i++){
            c[i]=str.charAt(i);
        }
       // c=str.toCharArray();
        replacePi(c, 0);
       // System.out.println(c.length);
        for (char d : c) {
            System.out.print(d);
            
        }

    }
    public static void replacePi(char [] c,int i){
        if(c[i]=='\0' ||  c[i+1]=='\0' ) return ;

        if(c[i]=='p' && c[i+1]=='i'){
           int  j=i+2;

           while(c[j]!='\0'){
               j++;
           }

           while(j>=i+2){
               c[j+2]=c[j];
               j--;
           }
           c[i]='3';
           c[i+1]='.';
           c[i+2]='1';
           c[i+3]='4';
           
           replacePi(c, i+4);
           

        }else{
            replacePi(c, i+1);
        }
        return;
    }
    
}
