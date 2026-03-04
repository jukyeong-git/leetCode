package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Binary_Search_Tree_IteratorTest {

    static Stream<Arguments> input() {
        return Stream.of(
            // Arguments.of(Input tree, Expected full traversal list)
            Arguments.of(
                new TreeNode(new Integer[]{7, 3, 15, null, null, 9, 20}),
                List.of(3, 7, 9, 15, 20) // Expected result when extracting all elements
            )
        );
    }

    @ParameterizedTest(name = "Case {index}: root=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    void TestCases(TreeNode root, List<Integer> expected) {

        // Given
        Binary_Search_Tree_Iterator iterator = new Binary_Search_Tree_Iterator(root);
        List<Integer> actual = new ArrayList<>();

        // When: Extract all next() values into a list as long as hasNext() is true
        while (iterator.hasNext()) {
            actual.add(iterator.next());
        }

        // Then: Compare the final list with the expected result at once!
        assertEquals(expected, actual, "Wrong Answer");
    }
}