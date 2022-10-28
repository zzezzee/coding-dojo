import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void convert() {
        Solution solution = new Solution();

        int result = solution.solution("one4seven");

        assertEquals(147, result);
    }
}
