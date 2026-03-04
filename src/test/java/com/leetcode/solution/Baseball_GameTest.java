package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Baseball_GameTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(new String[]{"5", "2", "C", "D", "+"}, 30),
            Arguments.of(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}, 27),
            Arguments.of(new String[]{"1", "C"}, 0)
        );
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}: operations=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    void TestCases(String[] operations, int expected) {

        // 실행 (When)
        Baseball_Game solution = new Baseball_Game();
        int actual = solution.calPoints(operations);

        // 검증 (Then)
        assertEquals(expected, actual, "Wrong Answer");
    }
}