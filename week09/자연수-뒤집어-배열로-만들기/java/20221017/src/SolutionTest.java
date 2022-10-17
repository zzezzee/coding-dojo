import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void longToString() {
        Solution solution = new Solution();

        long n = 12345;

        String s = solution.longToString(n);

        assertEquals("12345", s);
    }

    @Test
    void flip() {
        Solution solution = new Solution();

        String s = "12345";

        int[] result = solution.flip(s);

        assertEquals(5, result[0]);
    }
}
