package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Missing_NumberTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 1, }, 2),
                Arguments.of(new int[]{0, 1}, 2),
                Arguments.of(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8)
        );
    }

    @ParameterizedTest(name="Case {index}: nums=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int[] nums, int expected) {

        Missing_Number solution = new Missing_Number();
        int actual = solution.missingNumber(nums);

        assertEquals(expected, actual, "Wrong Answer");
    }
}