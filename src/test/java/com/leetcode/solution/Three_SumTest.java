package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Three_SumTest {

    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
            Arguments.of(new int[]{0, 1, 1}, List.of()),
            Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0)))
        );
    }

    @ParameterizedTest(name="Case {index}: nums=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int[] nums, List<List<Integer>> expected) {

        Three_Sum solution = new Three_Sum();
        List<List<Integer>> actual = solution.threeSum(nums);

        assertEquals(expected, actual, "Wrong Answer");
    }
}