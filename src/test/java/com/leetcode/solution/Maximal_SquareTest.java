package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Maximal_SquareTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        Object[][] testCases = {
                {new char[][]{
                        {'1', '0', '1', '0', '0'},
                        {'1', '0', '1', '1', '1'},
                        {'1', '1', '1', '1', '1'},
                        {'1', '0', '0', '1', '0'}},   4},
                {new char[][]{
                        {'0', '1'},
                        {'1', '0'}},                  1}
        };

        return Arrays.stream(testCases).map(Arguments::of);
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}: nums=''{0}''")
    @MethodSource("input")
    void TestCases(char[][] matrix, int expected) {
        // 실행 (When)
        Maximal_Square solution = new Maximal_Square();
        int actual = solution.maximalSquare(matrix);

        // 검증 (Then)
        assertEquals(expected, actual, "Failed for input: " + matrix);
    }
}