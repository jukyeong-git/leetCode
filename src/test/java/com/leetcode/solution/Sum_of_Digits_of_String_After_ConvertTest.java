package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Sum_of_Digits_of_String_After_ConvertTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("iiii", 1, 36),
                Arguments.of("leetcode", 2, 6)
        );
    }

    @ParameterizedTest(name="Case {index}: s=''{0}'', k''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(String s, int k, int expected) {

        Sum_of_Digits_of_String_After_Convert solution = new Sum_of_Digits_of_String_After_Convert();
        int actual = solution.getLucky(s, k);

        assertEquals(expected, actual, "Wrong Answer");
    }
}