
package recursion;
class Solution {

    public static void main(String aa[]){
        String s="paypalishiring";
        convert(s, 3);

    }
    public static void convert(String s, int numRows) {
        
        int n=s.length();
        
        int row=0;
        int step=1;
        String [] str=new String[numRows];
        
        for(int i=0;i<n;i++){
            
            str[row]=""+ s.charAt(i);
            
            if(row==0){
                step=1;
            }
            else if(row==numRows-1) {
                step=-1;
            }
            
            row=row+step;
            
        }
          // s="";
        String ss="";
        
        for(int i=0;i<str.length;i++){
          //  ss=ss+str[i];
          System.out.println(str[i]);
        }
        
       // return ss;
    }
}