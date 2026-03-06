package com.leetcode.solution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Bitwise_AND_of_Numbers_RangeTest {

    static Stream<Arguments> input() {
        return Stream.of (
            Arguments.of(5, 7,          4),
            Arguments.of(0, 0,          0),
            Arguments.of(1, 2147483647, 0)
        );
    }

    @ParameterizedTest(name = "Case {index}: left=''{0}'', right=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    void TestCases(int left, int right, int expected) {

        Bitwise_AND_of_Numbers_Range solution = new Bitwise_AND_of_Numbers_Range();
        int actual = solution.rangeBitwiseAnd(left, right);

        assertEquals(expected, actual, "Wrong Answer");
    }
}