package me.zanyrain.leetcode.arrays.t1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1 两数之和
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0;i< nums.length;i++){
            if (map.containsKey(target - nums[i])){
                Integer i1 = map.get(target - nums[i]);
                result[0] = i;
                result[1] = i1;
                return result;
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2,7,11,15};
        System.out.println(Arrays.toString(solution.twoSum(a,9)));
    }
}
