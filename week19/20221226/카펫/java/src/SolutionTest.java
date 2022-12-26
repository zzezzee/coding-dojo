import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        int[] result = solution.solution(10, 2);

        assertArrayEquals(new int[]{4, 3}, result);
    }
}
