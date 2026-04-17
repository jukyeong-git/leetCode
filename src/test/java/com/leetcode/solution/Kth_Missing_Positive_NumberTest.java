package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Kth_Missing_Positive_NumberTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 4, 7, 11}, 5, 9),
                Arguments.of(new int[]{1, 2, 3, 4}, 2, 6)
        );
    }

    @ParameterizedTest(name="Case {index}: arr=''{0}'', k=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(int[] arr, int k, int expected) {

        Kth_Missing_Positive_Number solution = new Kth_Missing_Positive_Number();
        int actual = solution.findKthPositive(arr, k);

        assertEquals(expected, actual, "Wrong Answer");
    }
}