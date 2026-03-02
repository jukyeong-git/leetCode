package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Edit_DistanceTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("horse", "ros", 3),
                Arguments.of("intention", "execution", 5)
        );
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}: word1=''{0}'', word2=''{1}''")
    @MethodSource("input")
    void TestCases(String word1, String word2, int expected) {
        // 실행 (When)
        Edit_Distance solution = new Edit_Distance();
        int actual = solution.minDistance(word1, word2);

        // 검증 (Then)
        assertEquals(expected, actual, "Failed for input: " + word1 +", "+ word2);
    }
}