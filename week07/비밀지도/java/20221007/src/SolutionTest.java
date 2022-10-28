import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void convert10to2() {
        Solution solution = new Solution();
        int[] arr = new int[]{9, 20, 28, 18, 11};

        String[] converted = solution.convert10to2(5, arr);

        assertEquals("01001", converted[0]);
        assertEquals("10100", converted[1]);
        assertEquals("11100", converted[2]);
        assertEquals("10010", converted[3]);
        assertEquals("01011", converted[4]);
    }

    @Test
    void overlapTwoMap() {
        Solution solution = new Solution();

        String[] arr1 = new String[]{"01001", "10100", "11100", "10010", "01011"};
        String[] arr2 = new String[]{"11110", "00001", "10101", "10001", "11100"};

        String[] overlapedArray = solution.overlap(arr1, arr2);

        assertEquals("#####", overlapedArray[0]);
        assertEquals("# # #", overlapedArray[1]);
        assertEquals("### #", overlapedArray[2]);
        assertEquals("#  ##", overlapedArray[3]);
        assertEquals("#####", overlapedArray[4]);
    }
}
