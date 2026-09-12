// Last updated: 9/12/2026, 4:27:42 PM
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
class Solution {
    private int domainCount=0;
    public int countDominantNodes(TreeNode root) {
        domainCount = 0;
        helper(root);
        return domainCount;
    }
    private int helper(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int leftMax = helper(node.left);
        int rightMax = helper(node.right);
        int cur = Math.max(node.val,Math.max(leftMax,rightMax));
        if(node.val==cur){
            domainCount++;
        }
        return cur;
    }
}