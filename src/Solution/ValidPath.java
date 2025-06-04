package Solution;

import java.util.*;

public class ValidPath {
    //1971. Find if Path Exists in Graph - https://leetcode.com/problems/find-if-path-exists-in-graph/description/
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;

        Map<Integer, List<Integer>> gr = new HashMap<>();
        for(int i = 0; i < n; i++) {
            gr.put(i, new LinkedList<>());
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            gr.get(u).add(v);
            gr.get(v).add(u);
        }

        Stack<Integer> stk = new Stack<>();
        stk.push(source);

        Set<Integer> visited = new HashSet<>();
        visited.add(source);

        while(!stk.isEmpty()) {
            int curr = stk.pop();
            for(int nei : gr.get(curr)) {
                if(nei == destination) return true;
                if(visited.contains(nei)) continue;
                stk.push(nei);
                visited.add(nei);
            }
        }

        return false;
    }
}
