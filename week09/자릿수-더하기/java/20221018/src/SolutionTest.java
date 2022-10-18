import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void result() {
        Solution solution = new Solution();

        int result = solution.add(123);

        assertEquals(6, result);
    }
}
