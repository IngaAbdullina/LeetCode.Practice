package array;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = {7, 6, 4, 7, 4, 8, 3, 2, 9};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean isTrue = containsDuplicate(array);
        boolean isFalse = containsDuplicate(array2);

        System.out.println("The first array contains Duplicate: " + isTrue);
        System.out.println("The second array contains Duplicate: " + isFalse);
    }

    private static boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
