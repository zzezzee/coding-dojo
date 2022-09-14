import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void simpleTest() {
        Solution solution = new Solution();

        assertEquals(3, solution.calculate(10));
        assertEquals(11, solution.calculate(12));
    }
}
