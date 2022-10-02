import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void stringSize() {
        Solution solution = new Solution();

        int stringSize = solution.inputStringSize("12345");

        assertEquals(5, stringSize);
    }

    @Test
    void oddSize() {
        Solution solution = new Solution();

        boolean isOdd1 = solution.odd("12345");
        boolean isOdd2 = solution.odd("1234");

        assertTrue(isOdd1);
        assertFalse(isOdd2);
    }

    @Test
    void middleWord() {
        Solution solution = new Solution();

        String middle1 = solution.middleWord("abc");
        String middle2 = solution.middleWord("abcd");

        assertEquals("b", middle1);
        assertEquals("bc", middle2);
    }
}
