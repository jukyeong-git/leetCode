package Solution;

import Util.TreeNode;

import java.util.*;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
    //103. Binary Tree Zigzag Level Order Traversal - https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

    /*
     * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
     *
     * Example 1:
     * - Input: root = [3,9,20,null,null,15,7]
     * - Output: [[3],[20,9],[15,7]]
     *
     * Example 2:
     * - Input: root = [1]
     * - Output: [[1]]
     *
     * Example 3:
     * - Input: root = []
     * - Output: []
     *
     * Constraints:
     * - The number of nodes in the tree is in the range [0, 2000].
     * - -100 <= Node.val <= 100
     */
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Deque<TreeNode> dq = new LinkedList<>();
        boolean direct = false;

        dq.offer(root);

        while(!dq.isEmpty()) {
            int n = dq.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                TreeNode node;

                if(direct) {
                    node = dq.pollLast();
                    if(node.right != null) dq.addFirst(node.right);
                    if(node.left != null) dq.addFirst(node.left);
                } else {
                    node = dq.pollFirst();
                    if(node.left != null) dq.addLast(node.left);
                    if(node.right != null) dq.addLast(node.right);
                }
                list.add(node.val);
            }
            res.add(list);
            direct = !direct;
        }

        return res;
    }
}
