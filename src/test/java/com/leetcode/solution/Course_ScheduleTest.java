package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Course_ScheduleTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1, 0}}, true),
                Arguments.of(2, new int[][]{{1, 0}, {0, 1}}, false)
        );
    }

    @ParameterizedTest(name = "Case {index}: numCourses=''{0}'', prerequisites=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(int numCourses, int[][] prerequisites, boolean expected) {

        Course_Schedule solution = new Course_Schedule();
        boolean actual = solution.canFinish(numCourses, prerequisites);

        assertEquals(expected, actual, "Wrong Answer");
    }
}