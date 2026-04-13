package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Find_K_Pairs_with_Smallest_SumsTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3, List.of(List.of(1, 2), List.of(1, 4), List.of(1, 6))),
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2, List.of(List.of(1, 1), List.of(1, 1)))
        );
    }

    @ParameterizedTest(name = "Case {index}: nums1=''{0}'', nums2=''{1}'', k=''{2}'' -> expected=''{3}''")
    @MethodSource("input")
    public void testCases(int[] nums1, int[] nums2, int k, List<List<Integer>> expected) {

        Find_K_Pairs_with_Smallest_Sums solution = new Find_K_Pairs_with_Smallest_Sums();
        List<List<Integer>> actual = solution.kSmallestPairs(nums1, nums2, k);

        assertEquals(expected, actual, "Wrong Answer");
    }
}