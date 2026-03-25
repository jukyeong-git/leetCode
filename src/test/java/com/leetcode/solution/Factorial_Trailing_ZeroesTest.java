package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Factorial_Trailing_ZeroesTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(3, 0),
                Arguments.of(5, 1),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest(name = "Case {index}: n=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int n, int expected) {

        Factorial_Trailing_Zeroes solution = new Factorial_Trailing_Zeroes();
        int actual = solution.trailingZeroes(n);

        assertEquals(expected, actual, "Wrong Answer");
    }
}