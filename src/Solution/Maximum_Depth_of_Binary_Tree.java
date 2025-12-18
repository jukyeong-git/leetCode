package Solution;

import Util.TreeNode;

public class Maximum_Depth_of_Binary_Tree {
    //104. Maximum Depth of Binary Tree - https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int count = 0;
        return getMaxDepth(root, count);
    }

    public static int getMaxDepth(TreeNode node, int count) {
        if(node == null) return count;
        count++;
        return Math.max(getMaxDepth(node.left, count), getMaxDepth(node.right, count));
    }
}
