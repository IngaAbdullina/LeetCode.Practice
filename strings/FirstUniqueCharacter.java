package strings;

import java.util.HashMap;

/**
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 */
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String first = "leetcode";
        String second = "loveleetcode";
        String third = "aabb";

        int firstInt = firstUniqChar(first);
        int secondInt = firstUniqChar(second);
        int thirdInt = firstUniqChar(third);

        System.out.println("First unique character index: " + firstInt);
        System.out.println("Second unique character index: " + secondInt);
        System.out.println("Third unique character index: " + thirdInt);
    }

    private static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }


        for (int i = 0; i < length; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
