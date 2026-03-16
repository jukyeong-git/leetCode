package com.leetcode.solution;

import com.leetcode.common.util.QuadTreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Construct_Quad_TreeTest {

    // ==========================================
    // 💡 1. Test Case Data Provider (Integer[][] 사용)
    // ==========================================
    static Stream<Arguments> input() {
        return Stream.of(
                // Case 1: LeetCode Example 1
                Arguments.of(
                        new int[][]{
                                {0, 1},
                                {1, 0}
                        },
                        // 💡 int[][] 대신 Integer[][]를 사용하여 null 허용
                        new Integer[][]{
                                {0, 1}, {1, 0}, {1, 1}, {1, 1}, {1, 0}
                        }
                ),

                // Case 2: LeetCode Example 2 (8x8 Grid)
                Arguments.of(
                        new int[][]{
                                {1, 1, 1, 1, 0, 0, 0, 0},
                                {1, 1, 1, 1, 0, 0, 0, 0},
                                {1, 1, 1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 0, 0, 0, 0},
                                {1, 1, 1, 1, 0, 0, 0, 0},
                                {1, 1, 1, 1, 0, 0, 0, 0},
                                {1, 1, 1, 1, 0, 0, 0, 0}
                        },
                        new Integer[][]{
                                {0, 1}, {1, 1}, {0, 1}, {1, 1}, {1, 0},
                                null, null, null, null, // 💡 리트코드 포맷의 null 패딩
                                {1, 0}, {1, 0}, {1, 1}, {1, 1}
                        }
                )
        );
    }

    // ==========================================
    // 💡 2. Execute Test and Verify
    // ==========================================
    @ParameterizedTest(name = "Case {index}: QuadTree Construction Test")
    @MethodSource("input")
    public void testCases(int[][] grid, Integer[][] expectedArr) {

        // Given
        Construct_Quad_Tree solution = new Construct_Quad_Tree();

        // When: 생성된 트리를 받아옵니다.
        QuadTreeNode actualNode = solution.construct(grid);

        // Then 1: 비교를 위해 actual 트리를 리트코드 배열 형태로 직렬화(변환)합니다.
        List<List<Integer>> actualList = serializeToLeetCodeFormat(actualNode);

        // Then 2: expectedArr(Integer[][])도 비교하기 쉽게 List<List<Integer>>로 변환합니다.
        List<List<Integer>> expectedList = new ArrayList<>();
        for (Integer[] arr : expectedArr) {
            expectedList.add(arr == null ? null : Arrays.asList(arr));
        }

        // Then 3: 자바의 List.equals()를 통해 깊은 배열 비교를 수행합니다!
        assertEquals(expectedList, actualList, "QuadTree의 구조가 예상된 배열 포맷과 일치하지 않습니다!");
    }

    // ==========================================
    // 💡 3. Helper: QuadTree를 리트코드 배열 포맷으로 완벽 변환하는 마법의 메서드
    // ==========================================
    private List<List<Integer>> serializeToLeetCodeFormat(QuadTreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<QuadTreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            QuadTreeNode curr = q.poll();
            if (curr == null) {
                res.add(null);
            } else {
                // [isLeaf (1=true, 0=false), val (1=true, 0=false)] 형태로 추가
                res.add(Arrays.asList(curr.isLeaf ? 1 : 0, curr.val ? 1 : 0));

                // 🚨 리트코드 포맷의 핵심: 잎(Leaf) 노드라도 자리를 맞추기 위해 4개의 null을 큐에 넣어야 함!
                if (!curr.isLeaf) {
                    q.add(curr.topLeft);
                    q.add(curr.topRight);
                    q.add(curr.bottomLeft);
                    q.add(curr.bottomRight);
                } else {
                    q.add(null); q.add(null); q.add(null); q.add(null);
                }
            }
        }

        // 배열 끝에 무의미하게 남은 꼬리 null 들을 모두 제거 (리트코드 방식)
        while (!res.isEmpty() && res.get(res.size() - 1) == null) {
            res.remove(res.size() - 1);
        }

        return res;
    }
}