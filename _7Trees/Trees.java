package _7Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {

    public static void main(String args[]){

        Tree t =new Tree();
        t.insert(1);
         t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(5);
        t.insert(6);
        t.insert(7);

        t.traverse();
        System.out.println();

        t.preOrderTraversal();

        

    }


    
}

class Tree{
         TreeNode root;
    public void insert(int x){
        if(root==null){
            root=new TreeNode(x);
        }else{
            root.insert(x);
        }


    }


    public void traverse(){
        if(root!=null){
               root.traverse(root);
        }
    }
   


    public void preOrderTraversal( ){
          
      TreeNode  rootNode=root;

      Queue<TreeNode> qu=new LinkedList<>();
      qu.add(rootNode);

      while(!qu.isEmpty()){

             TreeNode curr=qu.remove();
              System.out.print(curr.data+" ");
             if(curr.rightChild!=null){
                 qu.add(curr.rightChild);

             }

             if(curr.leftChild!=null){
                 qu.add(curr.leftChild);
             }



      }


    }
}
class TreeNode{
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(int data){
        this.data=data;
    }

    public  void insert(int data){
        if(data==this.data){
            return;
        }

        if(data<this.data){
            if(leftChild==null){
                leftChild=new TreeNode(data);
            }else{
                leftChild.insert(data);
            }
        }else{
            if(rightChild==null){
                rightChild=new TreeNode(data);
                
            }else{
                rightChild.insert(data);
            }
        }

    }

    public void traverse(TreeNode root){

        if(root ==null){
            return;
        }

          traverse(root.leftChild);

        // if(leftChild!=null){
        //     leftChild.traverse();
        // }
         System.out.print(root.data+" " );
         traverse(root.rightChild);

        // if(rightChild!=null){
        //     rightChild.traverse();
        // }

    }
}

// class Tree{
//     private TreeNode root;

//     public void insert(int value){
//         if(root==null){
//             root=new TreeNode(value);

//         }else{
//             root.insert(value);
//         }
//     }

//     public void traverse(){
//         if(root!=null){
//             root.traverseInorder();
//         }
//     }
 
// }

// class TreeNode{
//     private int data;
//     private TreeNode leftChild;
//     private TreeNode rightChild;

//     TreeNode(int data){
//         this.data=data;
//     }


//     public void traverseInorder(){
//         if(leftChild!=null){
//             leftChild.traverseInorder();
//         }

//         System.out.println(data);

//         if(rightChild!=null){
//             rightChild.traverseInorder();
//         }
//     }
//     public void insert(int value){
//         if(value==data){
//             System.out.println(value+"v d"+data);
//             return;
//         }

//         if(value<data){
//             if(leftChild==null){
//                 leftChild=new TreeNode(value);
//             }else{
//                 leftChild.insert(value);
//             }
//         }else{
//             if(rightChild==null){
//                 rightChild=new TreeNode(value);
//             }else{
//                 rightChild.insert(value);
//             }
//         }
//     }
// }