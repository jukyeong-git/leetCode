package com.leetcode.solution;

import com.leetcode.common.util.Node;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Clone_GraphTest {

    // ==========================================
    // 💡 1. Test Case Data Provider
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
                // Case 1: Standard connected graph
                // Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
                Arguments.of(
                        new Node(new int[][]{{2, 4}, {1, 3}, {2, 4}, {1, 3}})
                ),

                // Case 2: Graph with only 1 node and no edges
                // Input: adjList = [[]]
                Arguments.of(
                        new Node(new int[][]{{}})
                ),

                // Case 3: Empty graph
                // Input: null
                Arguments.of(
                        (Node) null // Explicitly pass null for the empty graph test
                )
        );
    }

    // ==========================================
    // 💡 2. Execute Test and Verify
    // ==========================================
    @ParameterizedTest(name = "Case {index}: Graph Clone Test")
    @MethodSource("input")
    public void testCloneGraph(Node root) {

        // Given
        Clone_Graph solution = new Clone_Graph(); // Initialize your solution class

        // When
        Node clonedRoot = solution.cloneGraph(root);

        // Then
        if (root == null) {
            // Edge Case: If the original is null, the clone must also be null
            assertNull(clonedRoot, "The cloned graph should be null if the input is null.");
        } else {
            // 1. Structure Verification: Compare the graph structures using our custom toString()
            assertEquals(root.toString(), clonedRoot.toString(), "The structure of the cloned graph does not match the original.");

            // 2. Deep Copy Verification 1: Root nodes must have different memory addresses
            assertNotSame(root, clonedRoot, "Deep Copy Failed: The cloned root is the exact same object as the original root.");

            // 3. Deep Copy Verification 2: Check if neighbors are also newly created objects
            if (!root.neighbors.isEmpty()) {
                assertNotSame(root.neighbors.get(0), clonedRoot.neighbors.get(0),
                        "Deep Copy Failed: The neighbors are pointing to the original node references.");
            }
        }
    }
}