package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(4, 2, List.of(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3), List.of(2, 4), List.of(3, 4))),
                Arguments.of(1, 1, List.of(List.of(1)))
        );
    }

    @ParameterizedTest(name="Case {index}: n=''{0}'', k=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(int n, int k, List<List<Integer>> expected) {

        Combinations solution = new Combinations();
        List<List<Integer>> actual = solution.combine(n, k);

        assertEquals(expected, actual, "Wrong Answer");
    }

}