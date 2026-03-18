package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Contains_Duplicate_IITest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1},       3, true),
                Arguments.of(new int[]{1, 0, 1, 1},       1, true),
                Arguments.of(new int[]{1, 2, 3, 1, 2, 3}, 2, false)
        );
    }

    @ParameterizedTest(name="Case {index}: nums=''{0}'', k=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(int[] nums, int k, boolean expected) {

        Contains_Duplicate_II solution = new Contains_Duplicate_II();
        boolean actual = solution.containsNearbyDuplicate(nums, k);

        assertEquals(expected, actual, "Wrong Answer");
    }
}