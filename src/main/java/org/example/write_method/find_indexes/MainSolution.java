package org.example.write_method.find_indexes;

import java.util.Arrays;
import java.util.HashMap;

public class MainSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calc(new int[]{2, 11, 7, 15}, 9)));
    }

    public static int[] calc(int[] nums, int target) {
        HashMap<Integer, Integer> targetDifference = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (targetDifference.containsKey(nums[i])) {
                return new int[]{targetDifference.get(nums[i]), i};
            } else {
                int dif = target - nums[i];
                targetDifference.put(dif, i);
            }
        }

        return new int[]{};
    }
}
