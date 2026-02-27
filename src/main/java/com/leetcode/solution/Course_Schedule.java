package com.leetcode.solution;

import java.util.ArrayList;

public class Course_Schedule {
    //207. Course Schedule - https://leetcode.com/problems/course-schedule/description/

    /*
     * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
     * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
     * - For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
     * Return true if you can finish all courses. Otherwise, return false.
     *
     * Example 1:
     *      Input: numCourses = 2, prerequisites = [[1,0]]
     *      Output: true
     * Explanation: There are a total of 2 courses to take.
     *      To take course 1 you should have finished course 0. So it is possible.
     *
     * Example 2:
     *      Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
     *      Output: false
     * Explanation: There are a total of 2 courses to take.
     *      To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1.
     *      So it is impossible.
     *
     * Constraints:
     *      1 <= numCourses <= 2000
     *      0 <= prerequisites.length <= 5000
     *      prerequisites[i].length == 2
     *      0 <= ai, bi < numCourses
     *      All the pairs prerequisites[i] are unique.
     */
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj = new ArrayList[numCourses];

        for(int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int[] pre : prerequisites) {
            adj[pre[0]].add(pre[1]);
        }

        int[] visited = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            if(!dfs(i, visited, adj))
                return false;
        }

        return true;
    }

    private static boolean dfs(int node, int[] visited, ArrayList<Integer>[] adj) {
        if(visited[node] == 1) return false;
        if(visited[node] == 2) return true;

        visited[node] = 1;

        for(int n : adj[node]) {
            if (!dfs(n, visited, adj)) {
                return false;
            }
        }

        visited[node] = 2;

        return true;
    }
}
