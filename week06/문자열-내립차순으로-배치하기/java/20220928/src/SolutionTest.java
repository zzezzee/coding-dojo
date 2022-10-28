import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lowerCaseString() {
        Solution solution = new Solution();

        assertEquals("abc", solution.lowerCaseString("abcD"));
    }

    @Test
    void lowerCaseSort() {
        Solution solution = new Solution();

        String lowerCase = solution.lowerCaseString("abcD");

        assertEquals("c".charAt(0), solution.lowerCaseSort(lowerCase)[0]);
        assertEquals("b".charAt(0), solution.lowerCaseSort(lowerCase)[1]);
        assertEquals("a".charAt(0), solution.lowerCaseSort(lowerCase)[2]);
    }

    @Test
    void upperCaseString() {
        Solution solution = new Solution();

        assertEquals("ABC", solution.upperCaseString("abcABC"));
    }

    @Test
    void upperCaseSort() {
        Solution solution = new Solution();

        String upperCase = solution.upperCaseString("abcABC");

        assertEquals("C".charAt(0), solution.upperCaseSort(upperCase)[0]);
        assertEquals("B".charAt(0), solution.upperCaseSort(upperCase)[1]);
        assertEquals("A".charAt(0), solution.upperCaseSort(upperCase)[2]);
    }

    @Test
    void plus() {
        Solution solution = new Solution();

        String stringToSort = "ABCabc";

        String lowerCase = solution.lowerCaseString(stringToSort);
        String upperCase = solution.upperCaseString(stringToSort);

        char[] sortedLowerCase = solution.lowerCaseSort(lowerCase);
        char[] sortedUpperCase = solution.upperCaseSort(upperCase);

        String lowerString = String.valueOf(sortedLowerCase);
        String upperString = String.valueOf(sortedUpperCase);

        assertEquals("cbaCBA", lowerString + upperString);
    }
}
