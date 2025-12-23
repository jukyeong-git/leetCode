package Solution;

import Util.TreeNode;

import javax.xml.stream.events.StartDocument;

public class Path_Sum {
    //112. Path Sum - https://leetcode.com/problems/path-sum/description/
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        int totalSum = 0;
        return DFS(root, totalSum, targetSum);
    }

    public static boolean DFS(TreeNode node, int totalSum, int targetSum) {
        if(node == null)
            return false;

        totalSum += node.val;

        if(totalSum == targetSum && node.left == null && node.right == null)
            return true;

        if(node.left != null) {
            if(DFS(node.left, totalSum, targetSum)) {
                return true;
            }
        }

        if(node.right != null) {
            if(DFS(node.right, totalSum, targetSum)) {
                return true;
            }
        }

        return false;
    }
}
