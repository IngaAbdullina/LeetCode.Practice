package strings;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.

 * Return 0 when needle is an empty string.
 */
public class ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ee";

        int result = strStr(haystack, needle);
        System.out.println(result);
    }

    private static int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            int beginIndex = i;
            int endIndex = beginIndex + needle.length();

            if(beginIndex == haystack.length() - 1){
                return -1;
            } else {
                String sub = haystack.substring(beginIndex, endIndex);
                if(needle.equals(sub)) {
                    return beginIndex;
                }
            }
        }
        return -1;
    }
}
