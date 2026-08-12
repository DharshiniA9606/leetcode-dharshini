// Last updated: 8/12/2026, 8:49:38 PM
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return helper(nums, 0, nums.length - 1);
19    }
20
21    private TreeNode helper(int[] nums, int left, int right) {
22        if (left > right) return null;
23        int mid = (left + right) / 2;
24        TreeNode root = new TreeNode(nums[mid]);
25        root.left = helper(nums, left, mid - 1);
26        root.right = helper(nums, mid + 1, right);
27        return root;
28    }
29}