package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Group_AnagramsTest {

    static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}, List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat"))),
            Arguments.of(new String[]{""}, List.of(List.of(""))),
            Arguments.of(new String[]{"a"}, List.of(List.of("a")))
        );
    }

    @ParameterizedTest(name="Case {index}: strs=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(String[] strs, List<List<String>> expected) {

        Group_Anagrams solution = new Group_Anagrams();
        List<List<String>> actual = solution.groupAnagrams(strs);

        assertEquals(expected, actual, "Wrong Answer");
    }
}