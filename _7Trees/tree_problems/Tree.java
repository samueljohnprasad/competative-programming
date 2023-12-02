package _7Trees.tree_problems;

public class Tree {



  public static void main(String args[]) {
    Trees tree= new TreeViews();
    TreeNode root= tree.initializeTree();
    tree.preOrderRecursion(root);
    System.out.println("preOrderRecursion");
    tree.inOrderRecursion(root);
    System.out.println("inOrderRecursion");
    tree.postOrderRecursion(root);    
    System.out.println("postOrderRecursion");
    tree.preOrderIterative(root);
    System.out.println("preOrderIterative");
    tree.inOrderIterative(root);
    System.out.println("inOrderIterative");
    tree.postOrderIterative(root);
    System.out.println("postOrderIterative");
    tree.levelOrderTraversal(root);
    System.out.println("levelOrderTraversal");
    tree.levelOrderTraversalPrintLevelWise(root);
    System.out.println("levelOrderTraversalPrintLevelWise");
    tree.reverseLevelOrderTraversal(root);
    System.out.println("reverseLevelOrderTraversal");
    System.out.println( tree.heightOfTree(root)+ " reverseLevelOrderTraversal");
    System.out.println( tree.sizeOfTree(root)+ " sizeOfTree");
    System.out.println( tree.maxInTree(root)+ " maxInTree");
    System.out.println( tree.minInTree(root)+ " minInTree");
    tree.leftView(root);
    System.out.println("leftView");
    tree.rightView(root);
    System.out.println("rightView");
    tree.topView(root);
    System.out.println("topView");
    tree.bottomView(root);
    System.out.println("bottomView");
    System.out.print(tree.diameter(root)+" ");
    System.out.println("diameter");
    TreeNode invertBinaryTreeNodes= tree.initializeTree();
    tree.invertBinaryTree(invertBinaryTreeNodes);
    tree.preOrderRecursion(invertBinaryTreeNodes);
    System.out.println("invertBinaryTree");
    tree.zigZagTreeTraversal(root);
    System.out.println("zigZagTreeTraversal");
    System.out.print(tree.isBalancedBinaryTree(root));
    System.out.println(" isBalancedBinaryTree");


    tree.diagonalTraversal(root);
    System.out.println(" diagonalTraversal");

    tree.boundaryTraversal(root);
    System.out.println(" boundaryTraversal");





  }
  
  
}
