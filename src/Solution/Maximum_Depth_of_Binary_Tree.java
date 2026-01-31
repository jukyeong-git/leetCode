package Solution;

import Util.TreeNode;

public class Maximum_Depth_of_Binary_Tree {
    //104. Maximum Depth of Binary Tree - https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

    /*
     * Given the root of a binary tree, return its maximum depth.
     * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     *
     * Example 1:
     *      Input: root = [3,9,20,null,null,15,7]
     *      Output: 3
     *
     * Example 2:
     *      Input: root = [1,null,2]
     *      Output: 2
     *
     * Constraints:
     *      The number of nodes in the tree is in the range [0, 104].
     *      -100 <= Node.val <= 100
     */
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int count = 0;
        return getMaxDepth(root, count);
    }

    private static int getMaxDepth(TreeNode node, int count) {
        if(node == null) return count;
        count++;
        return Math.max(getMaxDepth(node.left, count), getMaxDepth(node.right, count));
    }
}
