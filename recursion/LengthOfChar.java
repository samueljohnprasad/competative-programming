package recursion;

public class LengthOfChar {
    public static void main(String aa[]){
        char []c={'d','f','r','r','d','f','r','r','d','f','r','r','d','f','r','r','d','f','r','r'};
        char []remX=new char[10];
        remX[0]='z';
        remX[1]='x';
        remX[2]='f';
         remX[3]='s';
         remX[4]='x';
         remX[5]='g';
        remX[6]='x';
        remX[7]='j';
         remX[8]='h';
        // remX[9]='x';
       //  remX[9]='x';
        // remX[5]='r';
        // remX[6]='x';
        //System.out.println(charSize(c, c.length));
       removeX(remX, 0);
       for(char cc: remX){
           System.out.println(cc);
       }

    }

    public static void removeX(char[] c,int size){
        // int i=size;
        // index=(++i)-size;
        System.out.println(size+" s");

        if(size>=c.length)
        return;

        if(c[size]=='\0')
        return;

        if(c[size]!='x'){
           // System.out.println(c[size]);
            removeX(c,size+1);
            
            

        }else{
           int i=size+1;
           for(;c[i]!='\0';i++){
               c[i-1]=c[i];
           }
           c[i-1]=c[i];
           // System.out.println("x "+size);
            
           removeX(c,size+1);

        }
    }
    public static int charSize(char [] c,int size){
        if(size==0)
         return 0;

        int s= charSize(c,size-1);

        return 1+s;

    }
    

}
