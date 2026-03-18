package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Contains_DuplicateTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 4}, false)
        );
    }

    @ParameterizedTest(name="Case {index}: nums=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int[] nums, boolean expected) {

        Contains_Duplicate solution = new Contains_Duplicate();
        boolean actual = solution.containsDuplicate(nums);

        assertEquals(expected, actual, "Wrong Answer");
    }
}