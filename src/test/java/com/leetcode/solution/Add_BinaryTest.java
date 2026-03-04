package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Add_BinaryTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of("11",   "1",    "100"),
            Arguments.of("1010", "1011", "10101")
        );
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}: a=''{0}'', b=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    void TestCases(String a, String b, String expected) {
        // 실행 (When)
        Add_Binary solution = new Add_Binary();
        String actual = solution.addBinary(a, b);

        // 검증 (Then)
        assertEquals(expected, actual, "Wrong Answer");
    }
}