package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Longest_Palindromic_SubstringTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        Object[][] testCases = {
                {"babad",  "aba"},
                {"cbbd",    "bb"}
        };

        return Arrays.stream(testCases).map(Arguments::of);
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}")
    @MethodSource("input")
    void TestCases(String s, String expected) {
        // 실행 (When)
        Longest_Palindromic_Substring solution = new Longest_Palindromic_Substring();
        String actual = solution.longestPalindrome(s);

        // 검증 (Then)
        assertEquals(expected, actual, "Failed for input: " + s);
    }
}