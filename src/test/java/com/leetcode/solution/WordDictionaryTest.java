package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {

    // ==========================================
    // 💡 1. Test Case Data Provider
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
                // Case 1: LeetCode Example 1
                Arguments.of(
                        new String[]{"WordDictionary", "addWord", "addWord", "addWord", "search", "search", "search", "search"}, // Commands
                        new String[]{null, "bad", "dad", "mad", "pad", "bad", ".ad", "b.."},                                     // Words (Arguments)
                        new Boolean[]{null, null, null, null, false, true, true, true}                                           // Expected outputs
                ),

                // Case 2: Edge Cases (Single letters, length mismatches)
                Arguments.of(
                        new String[]{"WordDictionary", "addWord", "search", "search", "search"},
                        new String[]{null, "a", "a", ".", "aa"},
                        new Boolean[]{null, null, true, true, false}
                ),

                // Case 3: Complex Wildcards
                Arguments.of(
                        new String[]{"WordDictionary", "addWord", "addWord", "search", "search", "search", "search"},
                        new String[]{null, "hello", "world", "h.ll.", ".orl.", ".....", "w...a"},
                        new Boolean[]{null, null, null, true, true, true, false}
                )
        );
    }

    // ==========================================
    // 💡 2. Execute Test and Verify
    // ==========================================
    @ParameterizedTest(name = "Case {index}: Testing sequence of WordDictionary operations")
    @MethodSource("input")
    public void testCases(String[] commands, String[] words, Boolean[] expected) {

        WordDictionary dict = null;

        // Iterate through the sequence of commands
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            String word = words[i];
            Boolean exp = expected[i];

            if (command.equals("WordDictionary")) {
                // Initialize the dictionary
                dict = new WordDictionary();
                assertEquals(exp, null, "Initialization should not return a value.");

            } else if (command.equals("addWord")) {
                // Add word to the dictionary
                dict.addWord(word);
                assertEquals(exp, null, "addWord should not return a value.");

            } else if (command.equals("search")) {
                // Search word and compare with expected boolean result
                boolean actual = dict.search(word);
                assertEquals(exp, actual,
                        "Test Failed at step " + i + " | Command: search(\"" + word + "\")");
            }
        }
    }
}