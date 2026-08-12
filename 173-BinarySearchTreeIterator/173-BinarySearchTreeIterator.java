// Last updated: 8/12/2026, 8:49:06 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
private Stack<TreeNode>stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        leftTraversal(root);
    }
    private void leftTraversal(TreeNode root){
       while(root!=null){
         stack.push(root);
         root = root.left;
       }

    }
    
    public int next() {
        TreeNode node = stack.pop();
        if(node.right!=null){
            leftTraversal(node.right);
        }
        return node.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */