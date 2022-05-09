package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] firstArray = {2, 7, 11, 15};  // target = 9 | answer [0,1]
        int[] secondArray = {3,2,4};        // target = 6 | answer [1,2]

        int[] firstAnswer = twoSum(firstArray, 9);
        int[] secondAnswer = twoSum(secondArray, 6);

        System.out.println(Arrays.toString(firstAnswer));
        System.out.println(Arrays.toString(secondAnswer));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if(map.containsKey(value)){
                return new int[] { map.get(value), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}





















