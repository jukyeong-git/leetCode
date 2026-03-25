package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Evaluate_Reverse_Polish_NotationTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new String[]{"2", "1", "+", "3", "*"}, 9),
                Arguments.of(new String[]{"4", "13", "5", "/", "+"}, 6),
                Arguments.of(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}, 22)
        );
    }

    @ParameterizedTest(name ="Case {index}: tokens=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(String[] tokens, int expected) {

        Evaluate_Reverse_Polish_Notation solution = new Evaluate_Reverse_Polish_Notation();
        int actual = solution.evalRPN(tokens);

        assertEquals(expected, actual, "Wrong Answer");
    }
}