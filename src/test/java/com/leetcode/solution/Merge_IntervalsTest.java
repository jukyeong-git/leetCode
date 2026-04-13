package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Merge_IntervalsTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}},
                        new int[][]{{1, 6}, {8, 10}, {15, 18}}),
                Arguments.of(
                        new int[][]{{1, 4}, {4, 5}},
                        new int[][]{{1, 5}}),
                Arguments.of(
                        new int[][]{{4, 7}, {1, 4}},
                        new int[][]{{1, 7}})
        );
    }

    @ParameterizedTest(name = "Case {index}: intervals=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int[][] intervals, int[][] expected) {

        Merge_Intervals solution = new Merge_Intervals();
        int[][] actual = solution.merge(intervals);

        assertTrue(Arrays.deepEquals(expected, actual), "Wrong Answer");
    }
}