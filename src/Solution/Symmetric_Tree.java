package Solution;

import Util.TreeNode;

public class Symmetric_Tree {
    //101. Symmetric Tree - https://leetcode.com/problems/symmetric-tree/description/
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
