package strings;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean b = isAnagram(s, t);
        System.out.println(b);
    }

    private static boolean isAnagram(String s, String t) {
        boolean flag = true;

        if(s.length() != t.length()) {
            flag = false;
        } else {
            char[] array1 = s.toLowerCase().toCharArray();
            char[] array2 = t.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);

            flag = Arrays.equals(array1, array2);
        }
        return flag;
    }
}
