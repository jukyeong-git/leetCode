package Solution;

import Util.TreeNode;

public class Same_Tree {
    //100. Same Tree - https://leetcode.com/problems/same-tree/description/
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return getCheck(p, q);
    }

    public static boolean getCheck(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;

        if(p.val == q.val) {
            return getCheck(p.left, q.left) &&  getCheck(p.right, q.right);
        }

        return false;
    }
}
