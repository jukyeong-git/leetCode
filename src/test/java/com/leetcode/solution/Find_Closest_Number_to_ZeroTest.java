package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Find_Closest_Number_to_ZeroTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{-4, -2, 1, 4, 8}, 1),
                Arguments.of(new int[]{2, -1, 1}, 1)
        );
    }

    @ParameterizedTest(name = "Case {index}: nums=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int[] nums, int expected) {

        Find_Closest_Number_to_Zero solution = new Find_Closest_Number_to_Zero();
        int actual = solution.findClosestNumber(nums);

        assertEquals(expected, actual, "Wrong Answer");
    }
}