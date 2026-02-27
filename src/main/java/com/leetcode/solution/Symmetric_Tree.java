package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;

public class Symmetric_Tree {
    //101. Symmetric Tree - https://leetcode.com/problems/symmetric-tree/description/

    /*
     * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
     *
     * Example 1:
     *      Input: root = [1,2,2,3,4,4,3]
     *      Output: true
     *
     * Example 2:
     *      Input: root = [1,2,2,null,3,null,3]
     *      Output: false
     *
     * Constraints:
     *      The number of nodes in the tree is in the range [1, 1000].
     *      -100 <= Node.val <= 100
     *
     * Follow up:
     *      Could you solve it both recursively and iteratively?
     */
    public static boolean isSymmetric(TreeNode root) {
        if(root.left == null || root.right == null)
            return root.left == root.right;

        if(root.left.val == root.right.val) {
            setSwap(root.left);
            return getCheck(root.left, root.right);
        } else {
            return false;
        }
    }

    public static void setSwap(TreeNode node) {
        if(node == null) return;

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        setSwap(node.left);
        setSwap(node.right);
    }

    public static boolean getCheck(TreeNode left, TreeNode right) {
        if(left == null || right == null)
            return left == right;

        if(left.val == right.val) {
            return getCheck(left.left, right.left) && getCheck(left.right, right.right);
        }

        return false;
    }
}
