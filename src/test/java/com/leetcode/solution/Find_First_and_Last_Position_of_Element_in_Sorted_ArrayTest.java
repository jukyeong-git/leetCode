package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Find_First_and_Last_Position_of_Element_in_Sorted_ArrayTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4}),
                Arguments.of(new int[]{5, 7, 7, 8, 8, 10}, 6, new int[]{-1, -1}),
                Arguments.of(new int[]{}, 0, new int[]{-1, -1})
        );
    }

    @ParameterizedTest(name = "Case {index}: nums=''{0}'', target=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(int[] nums, int target, int[] expected) {

        Find_First_and_Last_Position_of_Element_in_Sorted_Array solution = new Find_First_and_Last_Position_of_Element_in_Sorted_Array();
        int[] actual = solution.searchRange(nums, target);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual), "Wrong Answer");
    }
}