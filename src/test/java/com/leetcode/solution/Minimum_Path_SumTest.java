package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Minimum_Path_SumTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        Object[][] testCases = {
                {new int[][]{{1, 3, 1}, {1, 5, 1},{4, 2, 1}},  7},
                {new int[][]{{1, 2, 3}, {4, 5, 6}},           12},
        };

        return Arrays.stream(testCases).map(Arguments::of);
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}: grid=''{0}''")
    @MethodSource("input")
    void TestCases(int[][] grid, int expected) {
        // 실행 (When)
        int actual = Minimum_Path_Sum.minPathSum(grid);

        // 검증 (Then)
        assertEquals(expected, actual, "Failed for input: " + grid);
    }
}