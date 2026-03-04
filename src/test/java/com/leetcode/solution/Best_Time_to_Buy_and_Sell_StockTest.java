package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Best_Time_to_Buy_and_Sell_StockTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
            Arguments.of(new int[]{7, 6, 4, 3, 1},    0)
        );
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}: operations=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    void TestCases(int[] prices, int expected) {

        // 실행 (When)
        Best_Time_to_Buy_and_Sell_Stock solution = new Best_Time_to_Buy_and_Sell_Stock();
        int actual = solution.maxProfit(prices);

        // 검증 (Then)
        assertEquals(expected, actual, "Wrong Answer");
    }
}