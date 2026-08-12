// Last updated: 8/12/2026, 11:33:27 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean hasPathSum(TreeNode root, int targetSum) {
18        if (root == null) return false;
19
20        if (root.left == null && root.right == null) {
21            return targetSum == root.val;
22        }
23
24        return hasPathSum(root.left, targetSum - root.val) ||
25               hasPathSum(root.right, targetSum - root.val);
26    }
27}