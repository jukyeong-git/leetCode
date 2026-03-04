package com.leetcode.common.util;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // ==========================================
    // 💡 Add this Constructor!
    // Takes an Integer[] array (level-order) and builds the tree
    // ==========================================
    public TreeNode(Integer[] arr) {

        if(arr == null || arr.length == 0 || arr[0] == null) return;

        // 1. Initialize the root node
        this.val = arr[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);

        int i = 1;
        // 2. Build the tree level by level using a Queue
        while(!queue.isEmpty() && i < arr.length) {

            TreeNode current = queue.poll();

            // Assign left child
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            // Assign right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
    }

    // ==========================================
    // 💡 Add this toString() method!
    // Converts the tree back into a LeetCode-style level-order array string
    // ==========================================
    @Override
    public String toString() {

        List<String> resultList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);

        // 1. Perform BFS (Level-Order Traversal)
        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            if (current != null) {
                resultList.add(String.valueOf(current.val));
                queue.add(current.left);
                queue.add(current.right);
            } else {
                resultList.add("null");
            }
        }

        // 2. Remove trailing "null"s to make it clean (like LeetCode format)
        while (!resultList.isEmpty() && resultList.get(resultList.size() - 1).equals("null")) {
            resultList.remove(resultList.size() - 1);
        }

        // 3. Join the list into a nicely formatted string: [1, null, 2, 3]
        return "[" + String.join(", ", resultList) + "]";
    }
}
