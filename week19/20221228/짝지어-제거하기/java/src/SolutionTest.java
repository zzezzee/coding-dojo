import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        int answer1 = solution.solution("bbaa");
        int answer2 = solution.solution("abab");

        assertEquals(1, answer1);
        assertEquals(0, answer2);
    }
}
