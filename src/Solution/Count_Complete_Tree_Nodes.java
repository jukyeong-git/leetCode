package Solution;

import Util.TreeNode;

public class Count_Complete_Tree_Nodes {
    //222. Count Complete Tree Nodes - https://leetcode.com/problems/count-complete-tree-nodes/description/
    public static int countNodes(TreeNode root) {
        if(root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
