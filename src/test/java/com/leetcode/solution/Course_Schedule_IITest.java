package com.leetcode.solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Course_Schedule_IITest {
    // ==========================================
    // 💡 1. Test Case Data Provider (Passing the 'expected' array directly)
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
                // Case 1: LeetCode Example 1
                Arguments.of(
                        2,
                        new int[][]{{1, 0}},
                        new int[]{0, 1} // expected array
                ),

                // Case 2: LeetCode Example 2 (Multiple valid answers exist, we just provide one as a reference)
                Arguments.of(
                        4,
                        new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}},
                        new int[]{0, 2, 1, 3} // expected array
                ),

                // Case 3: LeetCode Example 3 (No prerequisites)
                Arguments.of(
                        1,
                        new int[][]{},
                        new int[]{0} // expected array
                ),

                // Case 4: Impossible case (Cycle detected) -> Expected is an empty array
                Arguments.of(
                        2,
                        new int[][]{{1, 0}, {0, 1}},
                        new int[]{} // expected array (Empty)
                ),

                // Case 5: Complex Cycle hidden in a larger graph -> Expected is an empty array
                Arguments.of(
                        4,
                        new int[][]{{1, 0}, {2, 1}, {3, 2}, {1, 3}},
                        new int[]{} // expected array (Empty)
                )
        );
    }

    // ==========================================
    // 💡 2. Execute Test and Verify
    // ==========================================
    @ParameterizedTest(name = "Case {index}: numCourses=''{0}'', prerequisites=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    void testCases(int numCourses, int[][] prerequisites, int[] expected) {

        // Given
        Course_Schedule_II solution = new Course_Schedule_II();

        // When
        int[] actual = solution.findOrder(numCourses, prerequisites);

        // Then 1: The length of the actual array MUST match the expected array.
        // This naturally handles the impossible cases (expected length 0 == actual length 0)
        assertEquals(expected.length, actual.length,
                "Test Failed: The length of the returned array does not match the expected length.");

        // Then 2: If it's a valid case (length > 0), verify the rules!
        // We use our helper method because 'actual' might be a valid topological sort
        // that looks different from 'expected' (e.g., [0,1,2,3] vs [0,2,1,3]).
        if (expected.length > 0) {
            assertTrue(isValidOrder(numCourses, prerequisites, actual),
                    "Test Failed: The array size is correct, but the course order violates the prerequisites!");
        }
    }

    // ==========================================
    // 💡 3. Helper: The Ultimate Rule Validator for Multiple Valid Answers
    // ==========================================
    private boolean isValidOrder(int numCourses, int[][] prerequisites, int[] actualOrder) {

        // Map each course to its position (index) in the returned array
        int[] pos = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            pos[actualOrder[i]] = i;
        }

        // Verify every single prerequisite rule
        for (int[] pre : prerequisites) {
            int targetCourse = pre[0]; // a
            int preReqCourse = pre[1]; // b

            // The prerequisite must appear BEFORE the target course in the array
            if (pos[preReqCourse] > pos[targetCourse]) {
                System.err.println("Rule Violation: Course " + preReqCourse +
                        " must be taken BEFORE course " + targetCourse);
                return false;
            }
        }

        return true;
    }
}