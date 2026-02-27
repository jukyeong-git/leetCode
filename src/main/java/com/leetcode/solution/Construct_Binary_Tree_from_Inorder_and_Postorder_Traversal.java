package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    //106. Construct Binary Tree from Inorder and Postorder Traversal - https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/

    /*
     * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.
     *
     * Example 1:
     *      Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
     *      Output: [3,9,20,null,null,15,7]
     *
     * Example 2:
     *      Input: inorder = [-1], postorder = [-1]
     *      Output: [-1]
     *
     * Constraints:
     *      1 <= inorder.length <= 3000
     *      postorder.length == inorder.length
     *      -3000 <= inorder[i], postorder[i] <= 3000
     *
     * inorder and postorder consist of unique values.
     * Each value of postorder also appears in inorder.
     * inorder is guaranteed to be the inorder traversal of the tree.
     * postorder is guaranteed to be the postorder traversal of the tree.
     */
    private static int postorderIdx;
    private static Map<Integer, Integer> mapping;

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        postorderIdx = postorder.length - 1;
        mapping = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            mapping.put(inorder[i], i);
        }

        return build(postorder, 0, postorder.length - 1);
    }

    private static TreeNode build(int[] postorder, int start, int end) {
        if(start > end) return null;

        int rootVal = postorder[postorderIdx--];
        TreeNode root = new TreeNode(rootVal);
        int mid = mapping.get(rootVal);

        root.right = build(postorder,mid + 1, end);
        root.left = build(postorder, start, mid - 1);

        return root;
    }
}
