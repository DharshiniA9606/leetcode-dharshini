// Last updated: 8/12/2026, 11:09:13 AM
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
17
18    public boolean isBalanced(TreeNode root) {
19        return heightDiff(root) != -1;
20    }
21
22    public int heightDiff(TreeNode root) {
23        if (root == null) {
24            return 0;
25        }
26
27        int hleft = heightDiff(root.left);
28        if (hleft == -1)
29            return -1;
30        int hright = heightDiff(root.right);
31        if (hright == -1)
32            return -1;
33
34        if (Math.abs(hleft - hright) > 1) {
35            return -1;
36        }
37        return 1 + Math.max(hleft, hright);
38    }
39}