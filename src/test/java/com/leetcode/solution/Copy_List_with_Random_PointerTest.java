package com.leetcode.solution;

import com.leetcode.common.util.Node;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Copy_List_with_Random_PointerTest {

    // ==========================================
    // 💡 1. Test Case Data Provider (Pass Node objects directly!)
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
                // Case 1: LeetCode Example 1
                Arguments.of(
                        new Node(new Integer[][]{{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}}), // head
                        new Node(new Integer[][]{{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}})  // expectedHead
                ),

                // Case 2: LeetCode Example 2
                Arguments.of(
                        new Node(new Integer[][]{{1, 1}, {2, 1}}), // head
                        new Node(new Integer[][]{{1, 1}, {2, 1}})  // expectedHead
                ),

                // Case 3: LeetCode Example 3
                Arguments.of(
                        new Node(new Integer[][]{{3, null}, {3, 0}, {3, null}}), // head
                        new Node(new Integer[][]{{3, null}, {3, 0}, {3, null}})  // expectedHead
                ),

                // Case 4: Empty list edge case
                // Explicitly pass nulls to represent empty graphs/lists
                Arguments.of(null, null)
        );
    }

    // ==========================================
    // 💡 2. Execute Test and Verify
    // ==========================================
    @ParameterizedTest(name = "Case {index}: Deep Copy Random List Test")
    @MethodSource("input")
    public void testCases(Node head, Node expected) {

        // Given: Initialize the solution class
        Copy_List_with_Random_Pointer solution = new Copy_List_with_Random_Pointer();

        // Convert the directly provided expectedHead to a string for comparison
        String expectedStr = expected == null ? "[]" : expected.toString();

        // When: Execute the deep copy algorithm
        Node actual = solution.copyRandomList(head);

        // Then
        if (head == null) {
            // Edge Case: If original is null, clone must be null
            assertNull(actual, "Test Failed: Cloned head should be null for an empty list.");
        } else {
            // 1. Structure & Value Verification:
            // Compare the strings directly
            assertEquals(expectedStr, actual.toString(),
                    "Test Failed: The structure or values of the cloned list do not match the expected output.");

            // 2. Deep Copy Verification:
            // Iterate through the lists and ensure EVERY node is a brand new object in memory
            Node currOrig = head;
            Node currClone = actual;

            while (currOrig != null) {
                // Ensure the nodes themselves have different memory addresses
                assertNotSame(currOrig, currClone,
                        "Deep Copy Failed: Node with value " + currOrig.val + " is referencing the original node object.");

                currOrig = currOrig.next;
                currClone = currClone.next;
            }
        }
    }
}