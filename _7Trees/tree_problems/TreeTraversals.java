package _7Trees.tree_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Map.Entry;

public abstract class TreeTraversals extends Trees {

  //pop first Node from queue, print it and add left and right nodes to back of the Queue
  //repeat same 
  public void levelOrderTraversal(TreeNode root){
    if(root== null){
      System.out.println("Tree is empty");
      return;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
         TreeNode currentNode = queue.poll();
         System.out.print(currentNode.data+" ");
        if(currentNode.left!=null){
           queue.offer(currentNode.left);
        }

        if(currentNode.right!=null){
          queue.offer(currentNode.right);
        }
        
    }
  }

  public void levelOrderTraversalPrintLevelWise(TreeNode root){
  if(root== null){
      System.out.println("Tree is empty");
      return;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

     while(!q.isEmpty()){
          int currentSize = q.size();
         for(int i=0;i<currentSize;i++){
           TreeNode currentNode = q.poll();
           System.out.print(currentNode.data+ " ");
           if(currentNode.left!=null){
              q.add(currentNode.left);
           }
           if(currentNode.right!=null){
            q.add(currentNode.right);
           }

         }
         System.out.println();
     }

  }

  public void reverseLevelOrderTraversal(TreeNode root){

      if(root== null){
      System.out.println("Tree is empty");
      return;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    LinkedList<TreeNode> result = new LinkedList<>();
     while (!q.isEmpty()) {
        
      TreeNode currentTreeNode = q.poll();
      result.addFirst(currentTreeNode);

       if(currentTreeNode.right!=null){
          q.add(currentTreeNode.right);
       }

       if(currentTreeNode.left!=null){
        q.add(currentTreeNode.left);
       } 
     }

     for(TreeNode node: result){
      System.out.print(node.data+" ");
     }
  }  

  public int heightOfTree(TreeNode root){
    if(root==null) return 0;
    return Math.max(heightOfTree(root.left), heightOfTree(root.right))+1;
  }

  public int sizeOfTree(TreeNode root){
    if(root==null) return 0;
    int leftCount = sizeOfTree(root.left);
    int rightCount = sizeOfTree(root.right);

    return leftCount+rightCount+1;
  }

  public int maxInTree(TreeNode root){
   if(root==null) return Integer.MIN_VALUE;

   int returnedMax = maxInTree(root.left);
   int newMax = Math.max(returnedMax, root.data);

    int returnedMaxRight = maxInTree(root.right);
    int newMaxRight = Math.max(returnedMaxRight, root.data);
  return Math.max(newMax, newMaxRight);
  }

  public int minInTree(TreeNode root){
    if(root==null) return Integer.MAX_VALUE;
    return Math.min(root.data ,Math.min(minInTree(root.left) ,minInTree(root.right)));
  }



  

  Map<Integer, List<Integer>> map = new HashMap<>();
  public void diagonalTraversal(TreeNode root){
    diagonalTraversal1(root, 0);

    for(Entry<Integer,  List<Integer>> map: map.entrySet()){
        // for(int data: map.getValue()){
        //   System.out.println(data+" ");
        // }
        System.out.println(map.toString());
    }
  }
  public void diagonalTraversal1(TreeNode root, int hd){
    if(root==null) return ;
    List<Integer> list = map.get(hd);
    if(list==null){
       list = new ArrayList<>();
       list.add(root.data);
    }else{
      list.add(root.data);
    }
    // System.out.println("test1 "+ root.data);
    map.put(hd, list);
    //add +1 while going left
    diagonalTraversal1(root.left,hd+1);
    diagonalTraversal1(root.right,hd);
  }

  public void boundaryTraversal(TreeNode root){
    List<Integer> list = new ArrayList<>();
    if(!isLeaf(root)) list.add(root.data);
    addLeftBoundary(root,list);
    addLeaves(root, list);
    addRightBoundary(root, list);

    for(int value: list){
      System.out.print(value+" ");
    }
  }

  public void addLeftBoundary(TreeNode root, List<Integer> list){
   
     TreeNode curr = root.left;
     while(curr!=null){
       if(!isLeaf(curr)) list.add(curr.data);
       if(curr.left!=null){
          curr= curr.left;
       }else{
        curr= curr.right;
       }
     }  
  }

  public void addRightBoundary(TreeNode root, List<Integer> list){
    TreeNode curr = root.right;
    List<Integer> temp = new ArrayList<>();
    while(curr!=null){
      if(!isLeaf(curr)) temp.add(curr.data);
      if(curr.right!=null){
        curr= curr.right;
      }else{
        curr= curr.left;
      }

    }

    for(int i=temp.size()-1; i>=0;i--){
       System.out.println(temp.size() +" "+ i);
       list.add(temp.get(i));
    }
  }


  void addLeaves(TreeNode root, List<Integer> list){

    if(isLeaf(root)){
     list.add(root.data);
     return;
    }

    if(root.left!=null) addLeaves(root.left, list);
    if(root.right!=null) addLeaves(root.right, list);

  }

  boolean isLeaf(TreeNode node){
     if(node.left==null && node.right==null){
      return true;
     }
     return false;
  }



}
