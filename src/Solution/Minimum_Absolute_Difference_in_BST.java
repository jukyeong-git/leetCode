package Solution;

import Util.TreeNode;

public class Minimum_Absolute_Difference_in_BST {
    //530. Minimum Absolute Difference in BST - https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

    /*
     * Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.
     * Example 1:
     *      Input: root = [4,2,6,1,3]
     *      Output: 1
     * Example 2:
     *      Input: root = [1,0,48,null,null,12,49]
     *      Output: 1
     * Constraints:
     *      The number of nodes in the tree is in the range [2, 104].
     *      0 <= Node.val <= 105
     */

    static int diff;
    static TreeNode prev;

    public static int getMinimumDifference(TreeNode root) {
        diff = Integer.MAX_VALUE;
        prev = null;

        inOrder(root);
        return diff;
    }

    public static void inOrder(TreeNode node) {
        if(node == null) return;

        inOrder(node.left);

        if(prev != null) {
            diff = Math.min(diff, Math.abs(node.val - prev.val));
        }
        prev = node;

        inOrder(node.right);
    }
}
