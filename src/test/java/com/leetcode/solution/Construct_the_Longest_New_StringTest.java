package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Construct_the_Longest_New_StringTest {

    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(2, 5, 1, 12),
            Arguments.of(3, 2, 2, 14)
        );
    }

    @ParameterizedTest(name="Case {index}: x=''{0}'', y=''{1}'', z=''{2}'' -> expected=''{3}''")
    @MethodSource("input")
    public void testCases(int x, int y, int z, int expected) {

        Construct_the_Longest_New_String solution = new Construct_the_Longest_New_String();
        int actual = solution.longestString(x, y, z);

        assertEquals(expected, actual,"Wrong Answer");
    }
}