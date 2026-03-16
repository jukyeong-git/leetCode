package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Construct_Binary_Tree_from_Preorder_and_Inorder_TraversalTest {

    // ==========================================
    // 💡 1. Test Case Data Provider
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
                // Case 1: Standard tree
                // Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
                // Expected Output: [3,9,20,null,null,15,7]
                Arguments.of(
                        new int[]{3, 9, 20, 15, 7},
                        new int[]{9, 3, 15, 20, 7},
                        new TreeNode(new Integer[]{3, 9, 20, null, null, 15, 7})
                ),

                // Case 2: Tree with only 1 node
                // Input: inorder = [-1], postorder = [-1]
                // Expected Output: [-1]
                Arguments.of(
                        new int[]{-1},
                        new int[]{-1},
                        new TreeNode(new Integer[]{-1})
                )
        );
    }

    // ==========================================
    // 💡 2. Execute Test and Verify
    // ==========================================
    @ParameterizedTest(name = "Case {index}: Build Tree Test")
    @MethodSource("input")
    public void testCases(int[] inorder, int[] postorder, TreeNode expected) {

        // Given: Initialize the solution class
        Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal solution =
                new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();

        // When: Execute the algorithm to build the tree
        TreeNode actual = solution.buildTree(inorder, postorder);

        // Then: Compare the trees using our custom toString() for deep structure comparison
        // Note: If actual is null, handle it gracefully to avoid NullPointerException
        String expectedStr = expected == null ? "null" : expected.toString();
        String actualStr = actual == null ? "null" : actual.toString();

        assertEquals(expectedStr, actualStr, "Wrong Answer");
    }
}