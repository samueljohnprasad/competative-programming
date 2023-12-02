package _7Trees.tree_problems;

import java.util.Stack;

public abstract class Trees implements TreeInterface {
  

  public TreeNode  initializeTree (){
    TreeNode root= new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.left=new TreeNode(4);
    root.left.right=new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    return root;
  }

  public  void preOrderRecursion(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrderRecursion(root.left);
    preOrderRecursion(root.right);
  }

  public void inOrderRecursion(TreeNode root){
    if(root ==null){
      return;
    }
    inOrderRecursion(root.left);
    System.out.print(root.data + " ");
    inOrderRecursion(root.right);
  }

  public void postOrderRecursion(TreeNode root){
    if(root==null){
      return ;
    }

    postOrderRecursion(root.left);
    postOrderRecursion(root.right);
    System.out.print(root.data + " ");
  }

  public void preOrderIterative(TreeNode root){
    if(root== null){
      System.out.println("Tree is empty");
      return;
    }

    Stack<TreeNode> stack = new Stack<>();
    // copilot:disable
    stack.push(root);

    while(!stack.isEmpty()){
      TreeNode currNode = stack.pop();
      System.out.print(currNode.data+" ");
      if(currNode.right!=null){
        stack.push(currNode.right);
      }

      if(currNode.left!=null){
        stack.push(currNode.left);
      }

    }

  }

  public void inOrderIterative(TreeNode root){
         if(root==null){
          System.out.println("Tree is empty");
          return;
         }
         
          Stack<TreeNode> stack = new Stack<>();
          TreeNode currNode=root;

          while(!stack.isEmpty() || currNode!=null){
            if(currNode!=null){  //first go to left most node and push all the nodes in stack and last node left will be null
              stack.push(currNode);
              currNode=currNode.left; 
              continue;
            }
            currNode=stack.pop();
            System.out.print(currNode.data+" ");
            currNode=currNode.right; //now go to right node and push all the nodes in stack
          }
  }

  public void postOrderIterative(TreeNode root){
    if(root==null){
      System.out.println("Tree is empty");
      return;
    }

    Stack<TreeNode> stack = new Stack<>();
    Stack<TreeNode> output = new Stack<>();
    stack.push(root);

    while(!stack.isEmpty()){
          TreeNode currNode=stack.pop();
         output.push(currNode);
         if(currNode.left!=null){
          stack.push(currNode.left);
         }

         if(currNode.right!=null){
          stack.push(currNode.right);
         }
    }

    while(!output.isEmpty()){
      System.out.print(output.pop().data+" ");
    }
  }
}

 class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
      this.data = data;
    }
  }
