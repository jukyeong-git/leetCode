package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Climbing_StairsTest {

    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(2, 2),
            Arguments.of(3, 3)
        );
    }

    @ParameterizedTest(name = "Case {index}: n=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int n, int expected) {

        Climbing_Stairs solution = new Climbing_Stairs();
        int actual = solution.climbStairs(n);

        assertEquals(expected, actual, "Wrong Answer");
    }
}