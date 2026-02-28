package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Longest_Increasing_SubsequenceTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        Object[][] testCases = {
                {new int[]{10, 9, 2, 5, 3, 7, 101, 18},        4},
                {new int[]{0, 1, 0, 3, 2, 3},                  4},
                {new int[]{7, 7, 7, 7, 7, 7, 7},               1},
                {new int[]{3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12}, 6}
        };

        return Arrays.stream(testCases).map(Arguments::of);
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}: nums=''{0}''")
    @MethodSource("input")
    void TestCases(int[] nums, int expected) {
        // 실행 (When)
        int actual = Longest_Increasing_Subsequence.lengthOfLIS(nums);

        // 검증 (Then)
        assertEquals(expected, actual, "Failed for input: " + nums);
    }
}