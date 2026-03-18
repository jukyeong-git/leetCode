package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Convert_Sorted_Array_to_Binary_Search_TreeTest {

    // ==========================================
    // 💡 1. Test Case Data Provider
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
                // Case 1: LeetCode Example 1
                Arguments.of(new int[]{-10, -3, 0, 5, 9}),

                // Case 2: LeetCode Example 2
                Arguments.of(new int[]{1, 3}),

                // Case 3: Single element edge case
                Arguments.of(new int[]{1}),

                // Case 4: Even number of elements
                Arguments.of(new int[]{1, 2, 3, 4})
        );
    }

    // ==========================================
    // 💡 2. Execute Test and Verify Properties
    // ==========================================
    @ParameterizedTest(name = "Case {index}: nums={0}")
    @MethodSource("input")
    public void testCases(int[] nums) {

        // Given
        Convert_Sorted_Array_to_Binary_Search_Tree solution = new Convert_Sorted_Array_to_Binary_Search_Tree();

        // When
        TreeNode root = solution.sortedArrayToBST(nums);

        // Then 1: Verify it is a valid Binary Search Tree (BST)
        assertTrue(isValidBST(root, null, null), "Test Failed: The constructed tree is not a valid BST.");

        // Then 2: Verify it is height-balanced
        assertTrue(isBalanced(root), "Test Failed: The constructed tree is not height-balanced.");

        // Then 3: Verify the tree contains the exact same elements in the correct order (Inorder traversal)
        List<Integer> inorderList = new ArrayList<>();
        inorderTraversal(root, inorderList);
        int[] actualElements = inorderList.stream().mapToInt(i -> i).toArray();

        assertArrayEquals(nums, actualElements, "Test Failed: The tree elements do not match the original array.");
    }

    // ==========================================
    // 💡 3. Helper Methods for Validation
    // ==========================================

    // Helper: Checks if the tree is a valid BST by enforcing min/max boundaries
    private boolean isValidBST(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }

    // Helper: Checks if the tree is height-balanced (difference in height <= 1)
    private boolean isBalanced(TreeNode node) {
        return checkHeight(node) != -1;
    }

    // Helper: Returns height if balanced, or -1 if unbalanced
    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; // Left subtree is unbalanced

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // Right subtree is unbalanced

        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // Current node is unbalanced

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Helper: Performs an inorder traversal (Left -> Root -> Right)
    // For a valid BST, this should output the elements in perfectly sorted order.
    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }
}