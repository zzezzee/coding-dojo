import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sameWord() {
        Solution solution = new Solution();

        String[] string1 = new String[]{"sun", "bed", "car"};
        int n = 1;

        boolean result1 = solution.sameWord(string1, n);

        assertEquals(false, result1);

        String[] string2 = new String[]{"abce", "abcd", "cdx"};
        n = 2;

        boolean result2 = solution.sameWord(string2, n);

        assertEquals(true, result2);
    }

    @Test
    void switchDifferentWord() {
        Solution solution = new Solution();

        String[] strings = new String[]{"sun", "bed", "car"};
        int n = 1;

        String[] answer = solution.switchDifferentWord(strings, n);

        assertEquals("car", answer[0]);
        assertEquals("bed", answer[1]);
        assertEquals("sun", answer[2]);
    }

    @Test
    void switchSameWord() {
        Solution solution = new Solution();

        String[] string2 = new String[]{"abce", "abcd", "cdx"};
        int n = 2;

        String[] answer = solution.switchSameWord(string2, n);

        assertEquals("abcd", answer[0]);
        assertEquals("abce", answer[1]);
        assertEquals("cdx", answer[2]);
    }

    @Test
    void process() {

    }
}
