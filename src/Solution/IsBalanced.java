package Solution;

import Util.TreeNode;

public class IsBalanced {
    //110. Balanced Binary Tree - https://leetcode.com/problems/balanced-binary-tree/description/
    public boolean isBalanced(TreeNode root) {
        int count = 0;
        int result = searchTree(root, count);
        return result != Integer.MAX_VALUE;
    }

    public int searchTree(TreeNode root, int count) {
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
