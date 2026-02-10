package Solution;

import java.util.*;

public class Permutations {

    private static List<List<Integer>> res;
    private static boolean[] visited;

    public static List<List<Integer>> permute(int[] nums) {

        res = new ArrayList<>();

        if(nums.length == 0) {
            return res;
        }

        visited = new boolean[nums.length];

        setList(nums, new ArrayList<>());

        return res;
    }

    private static void setList(int[] nums, List<Integer> subRes) {

        if(subRes.size() == nums.length) {
            res.add(new ArrayList<>(subRes));
            return;
        }

        for(int i = 0; i < nums.length; i++) {

            if(visited[i]) continue;

            subRes.add(nums[i]);

            visited[i] = true;

            setList(nums, subRes);
            subRes.remove(subRes.size() - 1);

            visited[i] = false;
        }
    }
}
