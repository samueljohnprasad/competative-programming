package _7Trees.tree_problems;

 public interface TreeInterface {
    //root is pre, left is middle, right is post
     public void preOrderRecursion(TreeNode root); // 1 2 4 5 3 
     public void inOrderRecursion(TreeNode root); // 4 2 5 1 3
     public void postOrderRecursion(TreeNode root); //4 5 2 3 1
     public void preOrderIterative(TreeNode root); // 1 2 4 5 3 
     public void inOrderIterative(TreeNode root); // 4 2 5 1 3
     public void postOrderIterative(TreeNode root); //4 5 2 3 1
     public void levelOrderTraversal(TreeNode root); //1 2 3 4 5
     public void levelOrderTraversalPrintLevelWise(TreeNode root); //1 2 3 4 5
     public void reverseLevelOrderTraversal(TreeNode root); //4 5 2 3 1
     public int heightOfTree(TreeNode root); //3
     public int sizeOfTree(TreeNode root); //5
     public int maxInTree(TreeNode root); //5
     public int minInTree(TreeNode root); //1
     public void leftView(TreeNode root); //1 2 4
     public void rightView(TreeNode root); //1 3 5
     public void topView(TreeNode root); //4 2 1 3
     public void bottomView(TreeNode root); //4 2 5 3
     public int diameter(TreeNode root);
     public void invertBinaryTree(TreeNode root);
     public void zigZagTreeTraversal(TreeNode root);
     public boolean isBalancedBinaryTree(TreeNode root);
     public void diagonalTraversal (TreeNode root);
     public void boundaryTraversal(TreeNode root);
    //   public void isFoldable(TreeNode root); //true
    //   public void isSubTree(TreeNode root1, TreeNode root2); //true
    //   public void isCousin(TreeNode root, TreeNode a, TreeNode b); //true
    //   public void printAllAncestors(TreeNode root, TreeNode node); //1 2 4
    //   public void printAllNodesAtKDistance(TreeNode root, int k); //2 5
    //   public void printAllNodesAtKDistanceFromLeaf(TreeNode root, int k); //2 5


 }
