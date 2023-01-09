import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void gcd() {
        Solution solution = new Solution();

        int gcd = solution.gcd(6, 4);

        assertEquals(2, gcd);
    }

    @Test
    void lcmWithLength1() {
        Solution solution = new Solution();

        int[] arr = {1};

        int lcm = solution.lcm(arr);

        assertEquals(1, lcm);
    }

    @Test
    void lcm() {
        Solution solution = new Solution();

        int[] arr = {1, 2, 3};

        int lcm = solution.lcm(arr);

        assertEquals(6, lcm);
    }
}
