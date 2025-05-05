package Solution;

import Util.TreeNode;

public class MaxDepth {
    //104. Maximum Depth of Binary Tree - https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int count = 0;
        return search(root, count);
    }

    public int search(TreeNode root, int count) {
        if(root == null) return count;
        count++;
        return Math.max(search(root.left, count), search(root.right, count));
    }
}
