import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void split() {
        Solution solution = new Solution();

        int[] x = solution.split(123);

        assertEquals(1, x[0]);
        assertEquals(2, x[1]);
        assertEquals(3, x[2]);
    }

    @Test
    void sum() {
        Solution solution = new Solution();

        int sum = solution.sum(new int[]{1, 2, 3});

        assertEquals(6, sum);
    }

    @Test
    void correct() {
        Solution solution = new Solution();


        boolean isHarshad = solution.hashad(18, 9);

        assertEquals(true, isHarshad);
    }
}
