package strings;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";   // true | "amanaplanacanalpanama" is a palindrome.
        String s2 = "race a car";   // false | "raceacar" is not a palindrome.

        boolean b1 = isPalindrome(s1);
        boolean b2 = isPalindrome(s2);

        System.out.println("Is the first string a palindrome? " + b1);
        System.out.println("Is the second string a palindrome? " + b2);
    }

    private static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z]+","").toLowerCase();
        boolean flag = true;

        int mid = str.length();
        int j = 1;

        for (int i = 0; i < mid; i++) {
            if(str.charAt(i) == str.charAt(str.length() - j)) {
                flag = true;
                j++;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
