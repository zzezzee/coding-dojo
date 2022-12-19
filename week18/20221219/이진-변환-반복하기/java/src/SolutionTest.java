import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private int zeroCount = 0;
    private int totalCycle = 0;

    @Test
    void solution() {
        Solution solution = new Solution();

        int[] answer = solution.solution("110010101001");

        assertArrayEquals(new int[]{3, 8}, answer);
    }
}
