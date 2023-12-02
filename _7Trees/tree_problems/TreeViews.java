package _7Trees.tree_problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Map.Entry;

public  class TreeViews extends TreeTraversals {


  public void leftView(TreeNode root){

    if(root==null){
      System.out.println("Tree is empty");
      return;
    }

    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.offer(root);

    while (!q.isEmpty()) {
       int size = q.size();
       for(int i=0;i<size;i++){
      TreeNode currentTreeNode = q.poll();
        if(i==0){
          System.out.print(currentTreeNode.data+" ");
        }

        if(currentTreeNode.left!=null){
          q.offer(currentTreeNode.left);
        }


        if(currentTreeNode.right!=null){
          q.offer(currentTreeNode.right);
        }
        
       }
      
    }
  }


  public void rightView(TreeNode root){
    if(root==null){
      System.out.println("Tree is empty");
      return;
    }

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {
      int size = q.size();

      for(int i=0;i<size;i++){
        TreeNode currentTreeNode = q.poll();
         if(i==size-1){
          System.out.print(currentTreeNode.data+ " ");
         }

         if(currentTreeNode.left!=null){
          q.add(currentTreeNode.left);
         }

         if(currentTreeNode.right!=null){
          q.add(currentTreeNode.right);
         }
      }
    }
  }

  public void topView(TreeNode root){
    if(root==null){
      System.out.println("Tree is Empty");
      return;
    }

    Queue<Pair> q = new LinkedList<>();
    TreeMap<Integer, TreeNode> treeMap = new TreeMap<>();
    // -2 -1 0 1 2 //which are first inserted into keys are on top-view
    q.offer(new Pair(root, 0));

    while (!q.isEmpty()) {

      Pair currNode = q.poll();
      if(!treeMap.containsKey(currNode.horizontalDistance)){
        treeMap.put(currNode.horizontalDistance, currNode.node);
      }
      if(currNode.node.left!=null){
         q.offer(new Pair(currNode.node.left, currNode.horizontalDistance+1));
      }

      if(currNode.node.right!=null){
        q.offer(new Pair(currNode.node.right, currNode.horizontalDistance-1));
      }
      
    }

    for(Entry<Integer, TreeNode> entry: treeMap.entrySet()){
        System.out.print(entry.getValue().data+" ");
    }

  }

  public void bottomView(TreeNode root){

    if(root==null){
      System.out.print("Tree is empty");
      return;
    }


    Queue<Pair> q = new LinkedList<>();
    TreeMap<Integer, TreeNode> treeMap = new TreeMap<>();
    q.offer(new Pair(root,0));

    while (!q.isEmpty()) {

      Pair currentPairNode = q.poll();
      treeMap.put(currentPairNode.horizontalDistance, currentPairNode.node);

      if(currentPairNode.node.left!=null){
        q.offer(new Pair(currentPairNode.node.left, currentPairNode.horizontalDistance-1));
      }

      if(currentPairNode.node.right!=null){
        q.offer(new Pair(currentPairNode.node.right, currentPairNode.horizontalDistance+1));
      }
      
    }

      for(Entry<Integer,TreeNode> map : treeMap.entrySet()){
     System.out.print(map.getValue().data+" ");

  }
  }

   public int diameter(TreeNode root){

     int[] diameter = new int[1];
     diameterOfTree(root, diameter);
    return diameter[0];
  }

  public int diameterOfTree(TreeNode root, int[] diameter){
    if(root==null) return 0;

    int leftHeight = diameterOfTree(root.left, diameter);
    int rightHeight = diameterOfTree(root.right, diameter);
    diameter[0] = Math.max(diameter[0], leftHeight+ rightHeight);
    return 1+ Math.max(leftHeight, rightHeight);
  }

  public void invertBinaryTree(TreeNode root){
    if(root==null){
      System.out.println("Tree is empty");
      return;
    }

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    while(!q.isEmpty()){
      TreeNode currentTreeNode = q.poll();
      TreeNode Temp = currentTreeNode.left;
      currentTreeNode.left = currentTreeNode.right;
      currentTreeNode.right = Temp;

      if(currentTreeNode.left!=null){
        q.offer(currentTreeNode.left);
      }

      if(currentTreeNode.right!=null){
        q.offer(currentTreeNode.right);
      }

    }
  }

  public void zigZagTreeTraversal(TreeNode root){
   if(root==null){
    System.out.println("Tree i Empty");
    return;
   }
   

   Queue<TreeNode> q = new LinkedList<>();
   q.offer(root);
   LinkedList<LinkedList<Integer>> result = new LinkedList<>();
   //LinkedList<String> list = new LinkedList<String>();
   boolean leftToRight =true;
   while (!q.isEmpty()) {

  int size = q.size();
  LinkedList<Integer> list = new LinkedList<>();

   for(int i=0;i<size;i++){
    TreeNode currNode = q.poll();
        // System.out.println("sdfsf "+ currNode.data);

       if(leftToRight){
        list.addLast(currNode.data);
       }else{
         list.addFirst(currNode.data);
       }
      if(currNode.left!=null){
        q.offer(currNode.left);
      }

      if(currNode.right!=null){
        q.offer(currNode.right);
      }

   }   
       leftToRight= !leftToRight;
       result.add(list);

   }

   for (LinkedList<Integer> innerList : result) {
    for (Integer value : innerList) {
        System.out.print(value + " ");
    }
    System.out.println("sdfsf");
}

  }


  public boolean isBalancedBinaryTree(TreeNode root){
    if(root==null){
      System.out.println("emtpy tree");
      return false;
    }
    
    if(isBalanced(root)!=-1){
      return true;
    }

    return false;
  }

  public int isBalanced(TreeNode root){
     if(root==null) return 0;

    int leftHeight = isBalanced(root.left);
     if(leftHeight==-1) return -1;
    int rightHeight = isBalanced(root.right);
    if(rightHeight==-1) return -1;

    if(Math.abs(rightHeight-leftHeight)>1) return -1;
    return Math.max(leftHeight, rightHeight)+1;
  }


	
  

  
}

class Pair {
  TreeNode node;
  int horizontalDistance;
  public Pair(TreeNode node, int horizontalDistance){
    this.node = node;
    this.horizontalDistance = horizontalDistance;
  }

}
