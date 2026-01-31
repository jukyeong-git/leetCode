package Solution;

import Util.TreeNode;

public class Balanced_Binary_Tree {
    //110. Balanced Binary Tree - https://leetcode.com/problems/balanced-binary-tree/description/

    /*
     * Given a binary tree, determine if it is height-balanced.
     *
     * Example 1:
     *      Input: root = [3,9,20,null,null,15,7]
     *      Output: true
     *
     * Example 2:
     *      Input: root = [1,2,2,3,3,null,null,4,4]
     *      Output: false
     *
     * Example 3:
     *      Input: root = []
     *      Output: true
     *
     * Constraints:
     *      The number of nodes in the tree is in the range [0, 5000].
     *      -104 <= Node.val <= 104
     */
    public static boolean isBalanced(TreeNode root) {
        int count = 0;
        int result = searchTree(root, count);
        return result != Integer.MAX_VALUE;
    }

    public static int searchTree(TreeNode root, int count) {
        if(root == null) return count;

        count++;
        int left = searchTree(root.left, count);
        int right = searchTree(root.right, count);

        if(Math.abs(left-right)>1)
            return Integer.MAX_VALUE;
        else
            return Math.max(left, right);
    }
}
