package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Coin_ChangeTest {

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 5}, 11, 3),
                Arguments.of(new int[]{2},       3, -1),
                Arguments.of(new int[]{1},       0,  0)
        );
    }

    @ParameterizedTest(name="Case {index}: coins=''{0}'', amount=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    public void testCases(int[] coins, int amount, int expected) {

        Coin_Change solution = new Coin_Change();
        int actual = solution.coinChange(coins, amount);

        assertEquals(expected, actual, "Wrong Answer");
    }
}