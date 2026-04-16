package com.leetcode.solution;

import com.leetcode.common.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Convert_Binary_Number_in_a_Linked_List_to_IntegerTest {


    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new ListNode(new int[]{1, 0, 1}), 5),
                Arguments.of(new ListNode(new int[]{0}), 0)
        );
    }

    @ParameterizedTest(name="Case {index}: head=''{0}'' -> expected=''{1}''")
    @MethodSource("input")
    public void testCases(ListNode head, int expected) {

        Convert_Binary_Number_in_a_Linked_List_to_Integer solution = new Convert_Binary_Number_in_a_Linked_List_to_Integer();
        int actual = solution.getDecimalValue(head);

        assertEquals(expected, actual, "Wrong Answer");
    }

}