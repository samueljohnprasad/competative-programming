 
 package arrays.rbr;
 import java.io.*;
import java.util.*; 
 class Solution {
     public static void main(String aa[]){
         ArrayList<Integer> arr=new ArrayList<>();
         arr.add(4);
         arr.add(5);
         arr.add(2);
         arr.add(10);
         arr.add(8);

        // DoubleLinkedList d=new DoublyLinkedList();
         
        arr= prevSmaller(arr);
         for(int i=0;i<arr.size();i++){
             System.out.println(arr.get(i));
         }
     }
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        ArrayList<Integer> retval=new ArrayList<>();
        Stack<Integer> st=new Stack<Integer>();
        
        for(int i=0;i<arr.size();++i){
            while(!st.isEmpty() && arr.get(i)<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                retval.add(-1);
            }
            else{
                retval.add(st.peek());
            }
            st.add(arr.get(i));
        }
        
        return retval;
    }
}