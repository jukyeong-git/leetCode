package Solution;

import Util.TreeNode;

import java.util.*;

public class Average_of_Levels_in_Binary_Tree {
    //637. Average of Levels in Binary Tree - https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
    public static List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {

            int n = queue.size();
            TreeNode node = null;
            double sum = 0;

            for(int i = 0; i < n; i ++) {
                node = queue.poll();
                sum += node.val;

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            res.add(sum/n);
        }

        return res;
    }
}
