package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Combination_SumTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 6, 7}, 7, List.of(List.of(2, 2, 3), List.of(7))),
                Arguments.of(new int[]{2, 3, 5},    8, List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5))),
                Arguments.of(new int[]{2},          1, List.of())
        );
    }

    @ParameterizedTest(name="Case {index}: candidates=''{0}'', target=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(int[] candidates, int target, List<List<Integer>> expected) {

        Combination_Sum solution = new Combination_Sum();
        List<List<Integer>> actual = solution.combinationSum(candidates, target);

        assertEquals(expected, actual, "Wrong Answer");
    }
}