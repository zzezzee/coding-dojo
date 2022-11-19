import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void split() {
        Solution solution = new Solution();

        char[] s = solution.split("AB");

        assertEquals('A', s[0]);
        assertEquals('B', s[1]);
    }

    @Test
    void splitWithSpace() {
        Solution solution = new Solution();

        char[] s = solution.split("A B");

        assertEquals('A', s[0]);
        assertEquals(' ', s[1]);
        assertEquals('B', s[2]);
    }

    @Test
    void push() {
        Solution solution = new Solution();

        char[] s1 = {'A', 'B'};
        char[] s2 = {'a', 'b'};

        char[] a1 = solution.push(s1, 1);
        char[] a2 = solution.push(s2, 1);

        assertEquals('B', a1[0]);
        assertEquals('C', a1[1]);

        assertEquals('b', a2[0]);
        assertEquals('c', a2[1]);
    }

    @Test
    void pushOutOfNumber() {
        Solution solution = new Solution();

        char[] s = {'y', 'z'};

        char[] s2 = solution.push(s, 1);

        assertEquals('z', s2[0]);
        assertEquals('a', s2[1]);
    }

    @Test
    void merge() {
        Solution solution = new Solution();

        char[] s = {'B', 'C'};

        String result = solution.merge(s);

        assertEquals("BC", result);
    }
}
