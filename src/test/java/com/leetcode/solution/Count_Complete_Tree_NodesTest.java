package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Count_Complete_Tree_NodesTest {

    // ==========================================
    // 💡 1. Test Case Data Provider (Pass TreeNode and expected count)
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new TreeNode(new Integer[]{1, 2, 3, 4, 5, 6}), 6),
                Arguments.of(null, 0),
                Arguments.of(new TreeNode(new Integer[]{1}), 1),
                Arguments.of(new TreeNode(new Integer[]{1, 2, 3, 4, 5, 6, 7}), 7)
        );
    }

    // ==========================================
    // 💡 2. Execute Test and Verify
    // ==========================================
    @ParameterizedTest(name = "Case {index}: root=''{0}'' -> Expected=''{1}''")
    @MethodSource("input")
    void testCases(TreeNode root, int expected) {

        // Given: Initialize the solution class
        Count_Complete_Tree_Nodes solution = new Count_Complete_Tree_Nodes();

        // When: Execute the algorithm to get the actual count
        int actual = solution.countNodes(root);

        // Then: Compare the expected result with the actual result
        assertEquals(expected, actual, "Test Failed: The counted number of nodes does not match the expected value.");
    }
}