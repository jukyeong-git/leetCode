package Solution;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Right_Side_View {
    //199. Binary Tree Right Side View - https://leetcode.com/problems/binary-tree-right-side-view/description/

    /*
     * Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
     *
     * Example 1:
     * - Input: root = [1,2,3,null,5,null,4]
     * - Output: [1,3,4]
     *
     * Example 2:
     * - Input: root = [1,2,3,4,null,null,null,5]
     * - Output: [1,3,4,5]
     *
     * Example 3:
     * - Input: root = [1,null,3]
     * - Output: [1,3]
     *
     * Example 4:
     * - Input: root = []
     * - Output: []
     *
     * Constraints:
     * - The number of nodes in the tree is in the range [0, 100].
     * - -100 <= Node.val <= 100
     */
   public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightView(root, res, 0);
        return res;
    }

    private static void rightView(TreeNode node, List<Integer> res, int depth) {
       if(node == null) return;

       if(depth == res.size()) {
           res.add(node.val);
       }

       rightView(node.right, res, depth + 1);
       rightView(node.left, res, depth + 1);
    }
}

