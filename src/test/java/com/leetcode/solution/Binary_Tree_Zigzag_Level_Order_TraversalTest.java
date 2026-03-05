package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Binary_Tree_Zigzag_Level_Order_TraversalTest {

    // ==========================================
    // 1. Test Case Data Provider
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(
                        new TreeNode(new Integer[]{3, 9, 20, null, null, 15, 7}),
                        List.of(List.of(3), List.of(20, 9), List.of(15, 7))
                ),
                Arguments.of(
                        new TreeNode(new Integer[]{1}),
                        List.of(List.of(1))
                ),
                Arguments.of(
                        null,
                        List.of()
                )
        );
    }

    // ==========================================
    // 2. Execute Test and Verify
    // ==========================================
    // 💡 Update the name format to show all three parameters: {0}, {1}
    @ParameterizedTest(name = "Case {index}: root=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    void TestCases(TreeNode root, List<List<Integer>> expected) {

        // Setup solution instance
        Binary_Tree_Zigzag_Level_Order_Traversal solution = new Binary_Tree_Zigzag_Level_Order_Traversal();

        // Execute the method with two inputs
        List<List<Integer>> actual = solution.zigzagLevelOrder(root);

        // Verify using the custom assertion method we created earlier
        assertEquals(expected, actual, "Wrong Answer");
    }
}