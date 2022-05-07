package array;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Given array: " + Arrays.toString(array));

        rotate(array, 4);
        System.out.println("Output array: " + Arrays.toString(array));
    }

    public static void rotate(int[] nums, int k) {
        if(k <= 0 || k > nums.length || nums.length == 0) return;

        for (int i = 0; i < k; i++){
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 2; j >= 0; j--){
                nums[j + 1] = nums[j];
            }
            nums[0] = temp;
        }
    }
}
