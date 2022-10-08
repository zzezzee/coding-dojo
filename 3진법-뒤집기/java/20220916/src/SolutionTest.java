import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void convert10to3() {
        Solution solution = new Solution();

        String x = solution.convert10to3(25);

        assertEquals("221", x);
    }

    @Test
    void filpOver() {
        Solution solution = new Solution();

        String x = solution.reverse("12345");

        assertEquals("54321", x);
    }

    @Test
    void convert3to10() {
        Solution solution = new Solution();

        int x = solution.convert3to10("100");

        assertEquals(9, x);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int x = solution.solution(45);

        assertEquals(7, x);
    }
}
