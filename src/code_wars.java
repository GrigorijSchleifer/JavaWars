import java.util.ArrayList;
import java.util.Arrays;

public class code_wars {
    public void cnvrt_bool_str(boolean b) {
        /**
         *
         */
        System.out.println(String.valueOf(b));
    }

    public int[] number_to_reversed_arr(long n) {
        /**
         * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
         * https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java
         */

        // no need to convert long to string and then create an array with a length of n
        int[] digits = new int[Long.toString(n).length()];
        // System.out.println(Arrays.toString(digits));

        // Use two variables (i for string index, j for array index)
        for (int stri = digits.length - 1, arri = 0; stri >= 0; stri--, arri++) {
            digits[arri] = Long.toString(n).charAt(stri) - 48;
        }
        return digits;
    }


    public static int[] reverse_number(long n) {
        String numAsString = Long.toString(n);
        int[] digits = new int[numAsString.length()];

        for (int stringIndex = numAsString.length() - 1, arrayIndex = 0; stringIndex >= 0; stringIndex--, arrayIndex++) {
            digits[arrayIndex] = Character.getNumericValue(numAsString.charAt(stringIndex));
        }
        return digits;
    }
}

