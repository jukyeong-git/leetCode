package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Interleaving_StringTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("aabcc", "dbbca", "aadbbcbcac", true),
                Arguments.of("aabcc", "dbbca", "aadbbbaccc", false),
                Arguments.of("", "", "", true)
        );
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}: s1=''{0}'', s2=''{1}'', s3=''{2}''")
    @MethodSource("input")
    void TestCases(String s1, String s2, String s3, boolean expected) {
        // 실행 (When)
        Interleaving_String solution = new Interleaving_String();
        boolean actual = solution.isInterleave(s1, s2, s3);

        // 검증 (Then)
        assertEquals(expected, actual, "Failed for input: " + s1 + ", "+ s2 +", "+ s3);
    }
}