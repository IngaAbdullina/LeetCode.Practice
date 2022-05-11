package strings;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String comPref = longestCommonPrefix(strings);
        System.out.println(comPref);
    }

    public static String longestCommonPrefix(String[] strings) {
        if(strings.length == 0) return "";
        String prefix = strings[0];

        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
