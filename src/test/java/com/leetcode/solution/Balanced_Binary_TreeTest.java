package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Balanced_Binary_TreeTest {

    // ==========================================
    // 1. Test Case Data Provider
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(
                new TreeNode(new Integer[]{3, 9, 20, null, null, 15, 7}),
                true
            ),
            Arguments.of(
                new TreeNode(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4}),
                false
            ),
            Arguments.of(
                new TreeNode(new Integer[]{}),
                true
            )
        );
    }

    // ==========================================
    // 2. Execute Test and Verify
    // ==========================================
    // 💡 Update the name format to show all three parameters: {0}, {1}
    @ParameterizedTest(name = "Case {index}: root=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    void TestCases(TreeNode root, boolean expected) {

        // Setup solution instance
        Balanced_Binary_Tree solution = new Balanced_Binary_Tree();

        // Execute the method with two inputs
        boolean actual = solution.isBalanced(root);

        // Verify using the custom assertion method we created earlier
        assertEquals(expected, actual, "Wrong Answer");
    }
}