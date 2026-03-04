package com.leetcode.solution;

import com.leetcode.common.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Average_of_Levels_in_Binary_TreeTest {

    // ==========================================
    // 1. Test Case Data Provider
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(
                new TreeNode(new Integer[]{3, 9, 20, null, null, 15, 7}),
                List.of(3.0, 14.5, 11.0)
            ),
            Arguments.of(
                new TreeNode(new Integer[]{3, 9, 20, 15, 7}),
                List.of(3.0, 14.5, 11.0)
            )
        );
    }

    // ==========================================
    // 2. Execute Test and Verify
    // ==========================================
    // 💡 Update the name format to show all three parameters: {0}, {1}
    @ParameterizedTest(name = "Case {index}: root=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    void TestCases(TreeNode root, List<Double> expected) {

        // Setup solution instance
        Average_of_Levels_in_Binary_Tree solution = new Average_of_Levels_in_Binary_Tree();

        // Execute the method with two inputs
        List<Double> actual = solution.averageOfLevels(root);

        // Verify using the custom assertion method we created earlier
        assertEquals(expected, actual, "Wrong Answer");
    }
}