package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Binary_SearchTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9,  4),
            Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1)
        );
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}: nums=''{0}'', target=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    void TestCases(int[] nums, int target, int expected) {

        // 실행 (When)
        Binary_Search solution = new Binary_Search();
        int actual = solution.search(nums, target);

        // 검증 (Then)
        assertEquals(expected, actual, "Wrong Answer");
    }
}