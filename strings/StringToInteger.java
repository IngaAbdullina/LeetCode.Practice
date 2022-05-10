package strings;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 *  1) Read in and ignore any leading whitespace.
 *  2) Check if the next character (if not already at the end of the string) is '-' or '+'.
 * Read this character in if it is either. This determines if the final result is negative or positive respectively.
 * Assume the result is positive if neither is present.
 *  3) Read in next the characters until the next non-digit character or the end of the input is reached.
 * The rest of the string is ignored.
 *  4) Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32).
 * If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 *  5) If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
 * then clamp the integer so that it remains in the range.
 * Specifically, integers less than -231 should be clamped to -231,
 * and integers greater than 231 - 1 should be clamped to 231 - 1.
 *  6) Return the integer as the final result.
 *
 * Note:
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 */
public class StringToInteger {
    public static void main(String[] args) {
        String string1 = "42";
        String string2 = "   -42";
        String string3 = "4193 with words";
        int i = myAtoi(string1);
        int j = myAtoi(string2);
        int k = myAtoi(string3);

        System.out.println(i + "\n" +
                j + "\n" +
                k + "\n");
    }

    private static int myAtoi(String str) {
        int sign = 1;
        int result = 0;
        int index = 0;
        int length = str.length();

        // чтение пробелов в начале строки
        while (index < length && str.charAt(index) == ' '){
            index++;
        }

        // чтение знака числа (положительное / отрицательное)
        if(index < length && str.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if(index < length && str.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        // цикл проходит по оставшимся символам и проверяет, что символы "не число"
        while (index < length && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0';

            // проверка числа на соответсвие диапазону
            if((result > Integer.MAX_VALUE / 10) ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                // если число слишком большое, возвращаем максимальное значение Integer
                // если число слишком маленькое, возвращаем минимальное значение Integer
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = 10 * result + digit;
            index++;
        }

        return sign * result;
    }
}













