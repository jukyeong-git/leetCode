package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Find_if_Path_Exists_in_GraphTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2, true),
                Arguments.of(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5, false)
        );
    }

    @ParameterizedTest(name = "Case {index}: n=''{0}'', edges=''{1}'', source=''{2}'', destination=''{3}'' -> expected=''{4}''")
    @MethodSource("input")
    public void testCases(int n, int[][] edges, int source, int destination, boolean expected) {

        Find_if_Path_Exists_in_Graph solution = new Find_if_Path_Exists_in_Graph();
        boolean actual = solution.validPath(n, edges, source, destination);

        assertEquals(expected, actual, "Wrong Answer");
    }
}