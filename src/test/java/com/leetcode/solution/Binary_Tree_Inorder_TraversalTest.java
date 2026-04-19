package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Binary_Tree_Inorder_TraversalTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new TreeNode(new Integer[]{1, null, 2, 3}), List.of(1, 3, 2)),
                Arguments.of(new TreeNode(new Integer[]{1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9}), List.of(4, 2, 6, 5, 7, 1, 3, 9, 8))
        );
    }

    @ParameterizedTest(name="Case {index}: root=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(TreeNode root, List<Integer> expected) {

        Binary_Tree_Inorder_Traversal solution = new Binary_Tree_Inorder_Traversal();
        List<Integer> actual = solution.inorderTraversal(root);

        assertEquals(expected, actual, "Wrong Answer");
    }
}