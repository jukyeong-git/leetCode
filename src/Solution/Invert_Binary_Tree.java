package Solution;

import Util.TreeNode;

public class Invert_Binary_Tree {
    //226. Invert Binary Tree - https://leetcode.com/problems/invert-binary-tree/description/
    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode swap = null;
        swap = root.left;
        root.left = root.right;
        root.right = swap;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
