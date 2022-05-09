package array;

import java.util.Arrays;

/**
 * Given an integer array nums, move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 0, 3, 12};
        System.out.print(Arrays.toString(array) + " => ");
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }

    private static void moveZeroes(int[] nums) {
        int current = 0;

        for(int num : nums){
            if(num != 0){
                nums[current++] = num;
            }
        }

        for (int i = current; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
