package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Container_With_Most_WaterTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1)
        );
    }

    @ParameterizedTest(name="Case {index}: height=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int[] height, int expected) {

        Container_With_Most_Water solution = new Container_With_Most_Water();
        int actual = solution.maxArea(height);

        assertEquals(expected, actual, "Wrong Answer");
    }
}