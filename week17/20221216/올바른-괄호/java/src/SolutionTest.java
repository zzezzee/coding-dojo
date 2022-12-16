import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void count() {
        Solution solution = new Solution();

        String s1 = "()()()()()";
        String s2 = "()()()()())";
        String s3 = "()()()()())(";

        assertTrue(solution.count(s1));
        assertFalse(solution.count(s2));
        assertFalse(solution.count(s3));
    }
}
