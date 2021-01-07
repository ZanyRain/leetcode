package me.zanyrain.leetcode.arrays.t11;

/**
 * 11 盛最多水的容器
 *
 * 双指针解决法
 */
public class Solution {
    public int maxArea(int[] height) {
        int result = -1;
        int left = 0,right = height.length - 1,temp,width,high;
        while (left < right){
            width = right - left;
            if (height[left] < height[right]){
                high = height[left];
                left ++;
            }else {
                high = height[right];
                right --;
            }
            temp = width * high;
            if (temp > result){
                result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,8,6,2,5,4,8,3,7};
        int[] b = {1,1};
        int[] c = {4,3,2,1,4};
        int[] d = {1,2,1};
        System.out.println(solution.maxArea(a)); // 49
        System.out.println(solution.maxArea(b)); // 1
        System.out.println(solution.maxArea(c)); // 16
        System.out.println(solution.maxArea(d)); // 2
    }
}
