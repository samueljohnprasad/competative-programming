package _7Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

 class Nodee
{
  int data;
  Nodee left, right;
}
class TopViewNode{
    BTrees node;
    int horizontalDis;

    TopViewNode(BTrees node,int hd){
        this.node=node;
        this.horizontalDis=hd;

    }
}

public class BTree {

  
       /* Helper function that allocates a new node */
      static  BTrees head =null;
      static BTrees prev=null;
 static   Nodee newNode(int data)
 {
   Nodee node = new Nodee();
   node.data = data;
   node.left = node.right = null;
   return (node);
 }

 static void preOrder(Nodee node)
 {
   if (node == null)
     return;
   System.out.printf("%d ", node.data);
   preOrder(node.left);
   preOrder(node.right);
 }
   
    public static void main(String args[]){

        BTrees root=new BTrees(1);
        root.left=new BTrees(2);
        root.right=new BTrees(3);
        root.left.left=new BTrees(4);
        root.left.left.left=new BTrees(100);
        root.left.left.left.left=new BTrees(99);

        root.left.right=new BTrees(5);
        root.right.left=new BTrees(6);
       root.right.left.left=new BTrees(12);
       root.right.left.right=new BTrees(13);
        root.right.right=new BTrees(7);

        // preOrderTraversal(root);
        // System.out.println();
        // Inorder(root);
        // System.out.println();
        // Stack<Integer> st=postOrderStacks(root);
        // int n=st.size();
        // for(int i=0;i<n;i++){
        //     System.out.print(st.pop()+" ");
        // }
        // System.out.println();

        // System.out.print("post order using 1 stack ");
        //  postOrderStack(root);

        //  System.out.println(heightTree(root));

        //  List<Integer> list=   levelOrder(root);
        //  for(int i=0;i<list.size();i++){
        //      System.out.print(list.get(i)+" ");
        //  }
          
        //         Stack<Integer> stack=reverseLevelOrderTraversal(root);
        //         int h=stack.size();
        //  for(int i=0;i<h;i++){
        //     System.out.print(stack.pop()+" ");
        // }


       // reverseLevelOrder(root);

      //  System.out.println(diameterOfTree(root));

           // leftViewOfTree(root);
           ///rightViewOfTree(root);

          // leftViewRecursion(root, 0);
              
          //rightViewOfTree(root);

          //topView(root);
           // Map<Integer,TopViewNode> maper=new HashMap<>();
        //    topViewRecursion(root, maper, 0, 0);
        //    maper.forEach((key,value)-> System.out.print(value.node.data+" "));
             
            // buttonViewTreeRecursion(root,maper,0,0);
            // maper.forEach((key,value)-> System.out.print(value.node.data+" "));
            // System.out.println();
            // bottomViewTree(root);root==null

    
          // zigZagTree(root);
             
            // zigZigTreeTwoStacks(root);

             //zigZagRecursion(root);

          // IsTreeBalancedOrNot(root);
               
         // diagonalTravelTreeRecursive(root);

        // VerticalTravelTree(root);

        // diagonalTravelTree(root);

         //boundaryOfTree(root);
    //     String str="4(2(3)(1))(6(5))";
    //    // Nodee r= BinaryTreeFromStrBracket(str, 0,str.length()-1);
    //     BTrees r = str2Tree(str);
    //     preOrderTraversal(r);
        
          //BinaryTree2DoublyList(root);
        
        //   Btree2DDL(root);
       
        //   while(head!=null){
        //       System.out.print(head.data+" ");
        //       head=head.right;

        //   }

        // sumTree(root);
        // preOrderTraversal(root);

        //BtreeFromInorderPreorder();
        System.out.println(sizeOfTree(root));

       

}


      public static int sizeOfTree(BTrees root){
           if(root==null) return 0;

           return 1+ sizeOfTree(root.left)+sizeOfTree(root.right);
      }
       public static void BtreeFromInorderPreorder(){
        int [] inorder={3,1,4,0,5,2};
        int [] preorder={0,1,3,4,2,5};

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<inorder.length;i++){

            map.put(inorder[i],i);
        }

        

        BTrees h=contructBtree(inorder, preorder,map,0,inorder.length-1);
          
        // preOrderTraversal(h);
        postOrderRecursion(h);
        
       }

       static int preIndex=0;
     public static BTrees contructBtree(int[] inorder,int [] preorder,Map<Integer,Integer>map,int start,int end){
           if(start > end) return null;
           BTrees node =new BTrees(preorder[preIndex]);
           ++preIndex;

           if(start==end) return node;

          int index=map.get(node.data);

          node.left=contructBtree(inorder, preorder, map, start, index-1);
          node.right=contructBtree(inorder, preorder, map, index+1, end);
          return node;



          
     }
     public static int sumTree(BTrees root){

        if(root==null) return 0;

        int a=sumTree(root.left);
        int b=sumTree(root.right);

        int x=root.data;

        root.data=a+b;   // for curr node
        return a+b+x;     //for the node above the curr node



    

     }

    

     public static BTrees Btree2DDL(BTrees root){
         //using queue
           Queue<BTrees> qu =new LinkedList<>();
           Inorder(root,qu);
          // BTrees h=null;
           while(!qu.isEmpty()){
               BTrees curr=qu.poll();
               if(head==null){
                   head=curr;
                  
               }

               else{
                   prev.right=curr;
                   curr.left=prev;
                 

               }
               prev=curr;
           }

           return head;


     }
      

     public static void Inorder(BTrees root,Queue<BTrees> qu){
         if(root==null) return ;
         Inorder(root.left,qu);
         qu.add(root);
         Inorder(root.right,qu);

     }
     public static void BinaryTree2DoublyList(BTrees root){


            if(root ==null) return;

              BinaryTree2DoublyList(root.left);

              if(prev==null){
                  head=root;
                  prev=root;
              }else{
                 
                 prev.right=root;
                 root.left=prev;
                 prev=root;
              }
             

              BinaryTree2DoublyList(root.right);
        
      }


       

       static int start =0;
     public static BTrees  str2Tree(String s){
        //iterative
         if(s==null || s.length() ==0){
             return null;
         }

         return str2TreeHelper(s);
        }

       static  BTrees  str2TreeHelper(String s){
            if(start >= s.length())
             return null;

             boolean neg=false;
             if(s.charAt(start)=='-'){
               neg=true;
               start++;
             }

             int num=0;
             while(start<s.length() && Character.isDigit(s.charAt(start))){
                 int digit =Character.getNumericValue(s.charAt(start));
                 num=num*10+digit;
                 start++;
             }

             if(neg) num=-num;
             BTrees root=new BTrees(num);
             if(start>=s.length()) return root;

             if(start<s.length() && s.charAt(start)=='('){
                 start++;
                 root.left=str2TreeHelper(s);
             }

             if(start <s.length() && s.charAt(start)==')'){
                start++;
                return root;
            }


             if(start<s.length() && s.charAt(start)=='('){
                start++;
                root.right=str2TreeHelper(s);
            }

             if(start <s.length() && s.charAt(start)==')'){
                 start++;
                 return root;
             }

             return root;

        }
 
      
  
     

          public static Nodee BinaryTreeFromStrBracket(String str,int start,int end){
            //recursive
               if(start> end) return null;

               Nodee root=newNode(str.charAt(start)-'0');
               int index=-1;

               if(start+1<=end && str.charAt(start+1)=='('){
                   index=findIndex(str,start+1,end);
               }

               if(index!=-1){
                   root.left=BinaryTreeFromStrBracket(str, start+2, index-1);
                   root.right=BinaryTreeFromStrBracket(str, index+2, end-1);
               }

               return root;

          }

          static int findIndex(String str,int start,int end){
               
            if(start>end) return -1;

               Stack<Character> stack=new Stack<>();
               for(int i=start;i<=end;i++){

                   if(str.charAt(i)=='('){
                   stack.add(str.charAt(i));
                   }else if(str.charAt(i)==')'){
                       if(stack.peek()=='('){
                           stack.pop();

                           if(stack.isEmpty()){
                               return i;
                           }
                       }
                   }
               }
               return -1;
          }



    
        public static void boundaryOfTree(BTrees root){
            leftNodes(root);
            leafNodes(root);
            rightNodes(root);
           


        }

        public static void leftNodes(BTrees root){

                if(root==null) return ;

                if(root.left!=null){
                     System.out.print(root.data+" ");
                     leftNodes(root.left);

                    
                }else if(root.right!=null){
                    System.out.print(root.data+" ");
                    leftNodes(root.right);
                }

        }

        public static void rightNodes(BTrees root){
                   if(root==null) return;
                   if(root.right!=null){
                       rightNodes(root.right);
                       System.out.print(root.data+" ");
                   }else if(root.left!=null){
                       rightNodes(root.left);
                       System.out.print(root.data+" ");
                   }

        }

        public static void leafNodes(BTrees root){
               if(root!=null){
                   leafNodes(root.left);
                   if(root.left==null  && root.right==null) System.out.print(root.data+" ");
                   leafNodes(root.right);
               }
        }

           
       public static void VerticalTravelTree(BTrees root){

              Map<Integer,List<Integer>>map=new TreeMap<>();
              Queue<TopViewNode> qu=new LinkedList<>();
               
              
              qu.add(new TopViewNode(root,0));
              int min=Integer.MAX_VALUE;
              int max=Integer.MIN_VALUE;

              while(!qu.isEmpty()){
                      
                    TopViewNode curr=qu.poll();
                    min=Math.min(min,curr.horizontalDis);
                    max=Math.max(max,curr.horizontalDis);
                    if(map.get(curr.horizontalDis)==null){
                        List <Integer> l=new LinkedList<>();
                        l.add(curr.node.data);
                        map.put(curr.horizontalDis,l);
                    }else{
                        map.get(curr.horizontalDis).add(curr.node.data);
                    }

                    if(curr.node.left!=null) qu.add(new TopViewNode(curr.node.left,curr.horizontalDis-1));
                    if(curr.node.right!=null) qu.add(new TopViewNode(curr.node.right,curr.horizontalDis+1));

              }

              while(min<=max){
                       
                    if(map.get(min)!=null){
                    int size=map.get(min).size();
                     for(int i=0;i<size;i++){
                         System.out.print(map.get(min).get(i)+" ");
                     }
                    }
                  ++min;

              }

       }

       public static void diagonalTravelTree(BTrees root){
                    
                       Map<Integer,List<Integer>> map=new TreeMap<>();
                       Queue<TopViewNode> qu=new LinkedList<>();
                       int min=Integer.MAX_VALUE;
                       int max=Integer.MIN_VALUE;

                       qu.add(new TopViewNode(root,0));

                       while(!qu.isEmpty()){
                           TopViewNode curr=qu.poll();
                           min=Math.min(min,curr.horizontalDis);
                           max=Math.max(max,curr.horizontalDis);
                            if(map.get(curr.horizontalDis)==null){
                                List<Integer>l=new LinkedList<>();
                                l.add(curr.node.data);
                                map.put(curr.horizontalDis,l);
                            }else{
                                map.get(curr.horizontalDis).add(curr.node.data);
                            }

                            if(curr.node.left!=null)  qu.add(new TopViewNode(curr.node.left,curr.horizontalDis-1));
                            if(curr.node.right!=null)  qu.add(new TopViewNode(curr.node.right,curr.horizontalDis));
                       }

                       while(min<=max){
                       
                        if(map.get(min)!=null){
                        int size=map.get(min).size();
                         for(int i=0;i<size;i++){
                             System.out.print(map.get(min).get(i)+" ");
                         }
                        }
                      ++min;
    
                  }


       }
       public static void diagonalTravelTreeRecursive(BTrees root){
            Map<Integer,List<Integer>> map=new TreeMap<>(Collections.reverseOrder());

            diagonalTravel(root,map,0);

            map.forEach((key,value)->{
                for(int i=0;i<value.size();i++){
                System.out.print(value.get(i)+" ");
                }
                System.out.println();

                }
                );


       }

       public static void diagonalTravel(BTrees root ,Map<Integer,List<Integer>> map,int level){
             if(root==null) return ;
                
            //   map.put( level,  map.getOrDefault(level, new LinkedList<Integer>()).add(root.data));

               if(map.get(level)==null){
                   List<Integer> l=new LinkedList<>();
                   l.add(root.data);
                   map.put(level,l);
                }else{
                    map.get(level).add(root.data);
                }
             diagonalTravel(root.left,map,level-1);
             diagonalTravel(root.right,map,level);



       }
               
        public static void IsTreeBalancedOrNot(BTrees root){

                
                 if( checkTreeBalanced(root)==-1){
                     System.out.println(false);

                 }else{
                    System.out.println(true);
                 }


        }
         public  static int checkTreeBalanced(BTrees root){

                  if(root==null) return 0;
                 
                                    
                  int leftHeight=checkTreeBalanced(root.left);
                  int rightHeight=checkTreeBalanced(root.right);

                  if(Math.abs(leftHeight-rightHeight)>1) {
                    //  System.out.println(false+"f");
                      // IsTreeBalanced=-1;
                      return -1;
                  }

                  return 1+Math.max(leftHeight,rightHeight);




    } 

    public static void zigZagRecursion(BTrees root){
             int height=heightTree(root);

             for(int level=0;level<height;level++){
                 printZigZag(root,level,false);
             }

    }

    public static void printZigZag(BTrees root,int level,boolean flag){

              if(root==null) return;
               if(level==0)  System.out.print(root.data+" ");
               else if(level>0){
                   printZigZag(root.left,level-1,flag);
                   printZigZag(root.right,level-1,flag);
               }else{
                   printZigZag(root.right,level-1,flag);
                   printZigZag(root.left,level-1,flag);
               }
    }
    
    public static void zigZigTreeTwoStacks(BTrees root)
    {
         Stack<BTrees > stack1 =new Stack<>();
          Stack<BTrees> stack2=new Stack<>();
          stack1.push(root);
        
           while(!stack1.empty() || !stack2.empty())
         {
              while(!stack1.empty())
              { 
                BTrees curr=stack1.pop();
                     System.out.print(curr.data+" ");
                    
                     if(curr.right!=null)  stack2.push(curr.right);
                      if(curr.left!=null)  stack2.push(curr.left);
                        
                   }
    
                while(!stack2.empty())
                {
                    BTrees curr=stack2.pop();
                   System.out.print(curr.data+" ");
                
                    if(curr.left!=null) stack1.push(curr.left);
                    if(curr.right!=null) stack1.push(curr.right);
               }
                  
         }
    }
    
    public static  void zigZagTree(BTrees root)
    {
         Queue<BTrees> qu=new LinkedList<>();
          Stack <Integer> stack =new Stack<>();
            
          boolean ltr=false;
          qu.add(root);
          while(!qu.isEmpty())
         {  
                int size=qu.size();
                while(size-->0)
                {
                    BTrees curr= qu.poll();
                     if(ltr=true) {System.out.print(curr.data+" ");}
                       else {
                         stack.push(curr.data);
                       }
    
                       if(curr.left!=null)
                         {
                              qu.add(curr.left);
                            }
                      if(curr.right!=null)
                      {  
                            qu.add(curr.right);
                          }
                   }
                 if(ltr==false){
                        int n=stack.size();
                         for(int i=0;i<n;i++){
                              System.out.print(stack.pop()+" ");
                           }  
                           ltr=true;
                    }
                  
            }
         
    }
    

    public static void buttonViewTreeRecursion(BTrees root,Map<Integer,TopViewNode> map,int distance ,int level)
    {
                if(root ==null) return;
                
                   if(!map.containsKey(distance) || map.get(distance).horizontalDis<level)
                     {
                                 map.put(distance,new TopViewNode(root,level));
                        }
    
                        buttonViewTreeRecursion(root.left,map,distance-1,level+1);
                        buttonViewTreeRecursion(root.right,map,distance+1,level+1);
    }
    
    public static void bottomViewTree(BTrees root)
    {
    
          Map<Integer,Integer> map=new TreeMap<>();
          Queue<TopViewNode> qu=new LinkedList<>();
           qu.add(new TopViewNode(root,0));
    
           while(!qu.isEmpty()){
            TopViewNode curr=qu.poll();
             map.put(curr.horizontalDis,curr.node.data);
            
               if(curr.node.left!=null) qu.add(new TopViewNode(curr.node.left,curr.horizontalDis-1));
               if(curr.node.right!=null) qu.add(new TopViewNode(curr.node.right,curr.horizontalDis+1));
         }

         map.forEach((k,v)-> System.out.print(v+" "));
}
    
    
           
           
         public static void topViewRecursion(BTrees root,Map<Integer,TopViewNode> maper,int dist,int level){
               
                 if(root==null){
                     return;
                 }

                 if(!maper.containsKey(dist) || maper.get(dist).horizontalDis> level ){

                    maper.put(dist,new TopViewNode(root,level));
                    

                 }

                 topViewRecursion(root.left, maper, dist-1, level+1);
                 topViewRecursion(root.right, maper, dist+1, level+1);


    }


   
    public static void topView(BTrees root){
         
        Queue<TopViewNode> qu=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();

        qu.add(new TopViewNode(root,0));

        while(!qu.isEmpty()){
            TopViewNode curr=qu.poll();
           // map.putIfAbsent(curr.horizontalDis,curr.node.data);

            if(map.get(curr.horizontalDis)==null){
                map.put(curr.horizontalDis,curr.node.data);
            }

            if(curr.node.left!=null){
              qu.add(new TopViewNode(curr.node.left,curr.horizontalDis-1));

            }
            if(curr.node.right!=null){
                  qu.add(new TopViewNode(curr.node.right,curr.horizontalDis+1));
            }
        }

        map.forEach( (key,value)->System.out.print(value+" ") );

    }
        static int maxLevel=-1;
      public void rightViewOfTree(BTrees root,int level)
        {
             if(root==null)
             {  
               return;
             }

       if(maxLevel<level)
         {
               System.out.println(root.data);
                maxLevel=level;
           }

          rightViewOfTree(root.right,level+1);
          rightViewOfTree(root.left,level+1);
     }

                    public static void leftViewRecursion(BTrees root,int level){
                         if(root==null) return;
                          
                         if(maxLevel<level){
                             System.out.print(root.data+" ");
                             maxLevel=level;
                         }

                         leftViewRecursion(root.left,level+1);
                         leftViewRecursion(root.right,level+1);

                    }

                   public static void rightViewOfTree(BTrees root){
                         
                      Queue<BTrees> qu=new LinkedList<>();
                      qu.add(root);

                      while(!qu.isEmpty()){
                           
                              int size=qu.size();
                               for(int i=0;i<size;i++){
                                    
                                      BTrees curr=qu.poll();
                                       
                                      if(i==size-1){
                                          System.out.print(curr.data+" ");

                                      }

                                      if(curr.left!=null) qu.add(curr.left);
                                        if(curr.right!=null) qu.add(curr.right);

                               }

                      }


                   }

           public static void leftViewOfTree(BTrees root){

            Queue<BTrees> qu=new LinkedList<>();

            qu.add(root);

            while(!qu.isEmpty()){

                int size=qu.size();
                for(int i=0;i<size;i++){

                    BTrees curr=qu.poll();
                     if(i==0){
                        System.out.print(curr.data+" ");

                     }

                     if(curr.left!=null) 
                      qu.add(curr.left);
                     if(curr.right!=null) qu.add(curr.right);
                }

            }

           }

      public static int diameterOfTree(BTrees root){

                  if(root==null) return 0;

                    int ln=heightTree(root.left);
                    int rn=heightTree(root.right);
                   
                     int lDiameter=diameterOfTree(root.left);
                     int rDiameter=diameterOfTree(root.right);

                  int res=    Math.max(ln+rn+1 , Math.max(lDiameter,rDiameter));
                    
                  return res;   
                  
      }
    public static  void reverseLevelOrder(BTrees root)
    {    //recursion
                 int h=heightTree(root);
    
                    for(int i=h;i>=0;i--)
                {      
                    helperr(root,i);
                  System.out.println();
               }
       }
    
    public static  void helperr(BTrees root,int i)
    {              
              if(root==null)
              {   
                 return;
               }
               if(i==0){
                 System.out.print(root.data+" " );
                 return;
            }
    
               helperr(root.left,i-1);
               helperr(root.right ,i-1);
     }
    

        
       public static Stack<Integer> reverseLevelOrderTraversal(BTrees root){
            Queue<BTrees> qu=new LinkedList<>();
            qu.add(root);
            Stack<Integer> stack=new Stack<>();

            while( !qu.isEmpty()){

                BTrees curr=qu.poll();
                 stack.push(curr.data);
                if(curr.right!=null){
                    qu.add(curr.right);

                }

                if(curr.left!=null){
                        qu.add(curr.left);
                }


            }

            return stack;

       }
        public static  List<Integer> levelOrder(BTrees root){

              int h=heightTree(root);
              List<Integer> list =new ArrayList<>();
            for(int i=0;i<h;i++){
                helper(i,0,root,list);
            }

            return list;

        }

        static void helper(int level,int currLevel,BTrees root,List<Integer> list){
            if(root==null){
                return;
            }

            if(currLevel==level){
                  list.add(root.data);
            }
            helper(level, currLevel+1, root.left, list);
            helper(level, currLevel+1, root.right, list);
        }

    public static void postOrderRecursion(BTrees root){
         if(root==null) return;

         postOrderRecursion(root.left);
         postOrderRecursion(root.right);
         System.out.print(root.data+" ");

    }
    public static void postOrderStack(BTrees root){

        Stack<BTrees> stack=new Stack<>();

        BTrees curr=root;
        BTrees prev=null;

        while(curr!=null || !stack.empty()){

            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }else{
                curr =stack.peek();
                if(curr.right ==null || curr.right==prev){
                    System.out.print(curr.data+ " ");
                    stack.pop();
                    prev=curr;
                    curr=null;
                }else{
                    curr=curr.right;
                }
            }

        }


    }

    public static int heightTree(BTrees root){
           
        if(root==null) return 0;  //0 calculates node , -1 calculates edges

        return 1+Math.max(heightTree(root.left), heightTree(root.right));
    }

    public static Stack<Integer> postOrderStacks(BTrees root){
        //using two stacks

        Stack <BTrees> stack1=new Stack<>();
        Stack <Integer> stack2=new Stack<>();

        stack1.push(root);
        while(!stack1.isEmpty()){

            BTrees curr=stack1.pop();
            stack2.push(curr.data);
            //System.out.print(curr.data+ "k ");

            if(curr.left!=null){
                stack1.push(curr.left);
            }

            if(curr.right!=null){
                stack1.push(curr.right);
            }



        }
        return stack2;


    }


    public static void Inorder(BTrees root){
        if(root==null) return;
       
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static  void preOrderTraversal(BTrees root ){
          
        BTrees  rootNode=root;
  
        Queue<BTrees> qu=new LinkedList<>();
        qu.add(rootNode);
  
        while(!qu.isEmpty()){
  
            BTrees curr=qu.remove();
                System.out.print(curr.data+" ");

                if(curr.left!=null){
                    qu.add(curr.left);
                }
               if(curr.right!=null){
                   qu.add(curr.right);
  
               }
  
              
  
  
  
        }
    }


    
}

class BTrees{
    int data;
    BTrees left;
    BTrees right;

    BTrees(int data){
        this.data=data;
    }

}
