package recursion;


 class PalindromeInt {
    public static void main(String[] aa){
        palindrome(4);

    }

    public static void palindrome(int x){
        if(x<1)
        return;
        else 
           System.out.printf(x+" ");
           palindrome(x-1);
           System.out.printf(x+" ");


        
    }
    
}

