package array;

import java.util.Arrays;

/**
 * Given an integer array "nums" sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 *
 * You must have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3, 3};
        int k = removeDuplicates(nums);
        System.out.println(k+ "\n" + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;
        int k = 0;

        for(int i = 0; i < nums.length - 1; i++){
            int same = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    nums[j] = 0;
                } else if (nums[i] != nums[j]){
                    nums[++same] = nums[j];
                }
            }
        }

        for(int number : nums){
            if(number != 0){
                k++;
            }
        }
        return k;
    }
}




















