import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void decending() {
        Solution solution = new Solution();

        long result = solution.decending(118372);

        assertEquals(873211, result);
    }
}
