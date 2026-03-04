package com.leetcode.solution;

import com.leetcode.common.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Add_Two_NumbersTest {

    // ==========================================
    // 1. Test Case Data Provider
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
            // Arguments.of(ListNode l1, ListNode l2, ListNode expected)

            // Example 1: 342 + 465 = 807
            // l1 = [2, 4, 3], l2 = [5, 6, 4] -> expected = [7, 0, 8]
            Arguments.of(
                new ListNode(new int[]{2, 4, 3}),
                new ListNode(new int[]{5, 6, 4}),
                new ListNode(new int[]{7, 0, 8})
            ),

            // Example 2: 0 + 0 = 0
            Arguments.of(
                new ListNode(new int[]{0}),
                new ListNode(new int[]{0}),
                new ListNode(new int[]{0})
            ),

            // Example 3: 9999999 + 9999 = 10009998
            // Notice lengths can be different!
            Arguments.of(
                new ListNode(new int[]{9, 9, 9, 9, 9, 9, 9}),
                new ListNode(new int[]{9, 9, 9, 9}),
                new ListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1})
            )
        );
    }

    // ==========================================
    // 2. Execute Test and Verify
    // ==========================================
    // 💡 Update the name format to show all three parameters: {0}, {1}, {2}
    @ParameterizedTest(name = "Case {index}: l1=''{0}'', l2=''{1}'' -> expected=''{2}''")
    @MethodSource("input")
    void TestCases(ListNode l1, ListNode l2, ListNode expected) {

        // Setup solution instance
        Add_Two_Numbers solution = new Add_Two_Numbers();

        // Execute the method with two inputs
        ListNode actual = solution.addTwoNumbers(l1, l2);

        // Verify using the custom assertion method we created earlier
        assertListNodeEquals(expected, actual);
    }

    // ==========================================
    // 3. Custom Assertion Helper for ListNode
    // ==========================================
    static void assertListNodeEquals(ListNode expected, ListNode actual) {

        while (expected != null && actual != null) {
            // Compare the actual values inside the nodes
            assertEquals(expected.val, actual.val, "Node values do not match!");
            expected = expected.next;
            actual = actual.next;
        }

        // Ensure both lists have the exact same length
        // If one is longer, the other will be null first, triggering a failure here.
        assertNull(expected, "The actual list is shorter than the expected list.");
        assertNull(actual, "The actual list is longer than the expected list.");
    }
}