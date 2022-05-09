package strings;

/**
 * Write a function that reverses a string.
 * The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] array = {'h', 'e', 'l', 'l', 'o'};
        System.out.print(array);
        System.out.print(" => ");

        reverseString(array);
        System.out.println(array);
    }

    public static void reverseString(char[] s) {
        char temp;
        int length = s.length;
        int j = 1;
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            temp = s[i];
            s[i] = s[length - j];
            s[length - j] = temp;
            j++;
        }
    }
}
