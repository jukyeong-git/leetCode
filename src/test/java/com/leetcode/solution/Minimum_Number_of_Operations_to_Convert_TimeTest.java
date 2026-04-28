package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Minimum_Number_of_Operations_to_Convert_TimeTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("02:30", "04:35", 3),
                Arguments.of("11:00", "11:01", 1)
        );
    }

    @ParameterizedTest(name="Case {index}: current=''{0}'', correct=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(String current, String correct, int expected) {

        Minimum_Number_of_Operations_to_Convert_Time solution = new Minimum_Number_of_Operations_to_Convert_Time();
        int actual = solution.convertTime(current, correct);

        assertEquals(expected, actual, "Wrong Answer");
    }
}