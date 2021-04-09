package _7Trees;

public class TreeArray {
     
        public static void main(String args[])
       {
    
           char tree[] =new char[15];
             tree[0]='A';
            setLeftChild(tree,'B',0);
           setRightChild(tree,'C',0);
            setLeftChild(tree,'D',1);
           setRightChild(tree,'E',1);
           setLeftChild(tree,'F',2);
           setRightChild(tree,'G',2);
           setLeftChild(tree,'H',3);
           setRightChild(tree,'I',3);
           

           for(char c:tree){
               System.out.println(c);
           }
               
        }
      
        public static void setLeftChild(char tree[],char charValue,int parentIndex)
        {     
                 tree[2*parentIndex+1]=charValue;
            }
    
       public static void setRightChild(char tree[],char charValue,int parentIndex)
       {   
            tree[2*parentIndex+2]=charValue;
        }
     }
    