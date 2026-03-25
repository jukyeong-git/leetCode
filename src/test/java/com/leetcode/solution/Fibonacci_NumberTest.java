package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Fibonacci_NumberTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3)
        );
    }

    @ParameterizedTest(name = "Case {index}: n=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int n, int expected) {

        Fibonacci_Number solution = new Fibonacci_Number();
        int actual = solution.fib(n);

        assertEquals(expected, actual, "Wrong Answer");
    }
}