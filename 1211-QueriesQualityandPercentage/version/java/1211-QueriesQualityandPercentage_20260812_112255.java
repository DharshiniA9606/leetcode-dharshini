// Last updated: 8/12/2026, 11:22:55 AM
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
16
17
18class Solution {
19    public void dfs(TreeNode root, String path, List<String> ans) {
20        if(root == null) return;
21
22        if(path.length() == 0) {
23            path = "" + root.val;
24        } else {
25            path = path + "->" + root.val;
26        }
27
28        if(root.left == null && root.right == null) {
29            ans.add(path);
30            return;
31        }
32
33        dfs(root.left, path, ans);
34        dfs(root.right, path, ans);
35    }
36
37    public List<String> binaryTreePaths(TreeNode root) {
38        List<String> ans = new ArrayList<>();
39        dfs(root, "", ans);
40        return ans;
41    }
42} 