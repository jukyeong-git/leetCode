package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Find_All_Duplicates_in_an_ArraTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(2, 3)),
                Arguments.of(new int[]{1, 1, 2}, List.of(1)),
                Arguments.of(new int[]{1}, List.of())
        );
    }

    @ParameterizedTest(name = "Case {index}: nums=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(int[] nums, List<Integer> expected) {

        Find_All_Duplicates_in_an_Arra soltuion = new Find_All_Duplicates_in_an_Arra();
        List<Integer> actual = soltuion.findDuplicates(nums);

        assertEquals(expected, actual, "Wrong Answer");
    }
}