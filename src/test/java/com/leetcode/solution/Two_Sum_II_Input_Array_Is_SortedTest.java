package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Two_Sum_II_Input_Array_Is_SortedTest {

    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
            Arguments.of(new int[]{2, 3, 4}, 6, new int[]{1, 3}),
            Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2})
        );
    }

    @ParameterizedTest(name="Case {index}: numbers=''{0}'', target=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(int[] numbers, int target, int[] expected) {

        Two_Sum_II_Input_Array_Is_Sorted solution = new Two_Sum_II_Input_Array_Is_Sorted();
        int[] actual = solution.twoSum(numbers, target);

        assertArrayEquals(expected, actual, "Wrong Answer");
    }
}