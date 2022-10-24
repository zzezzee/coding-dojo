import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = solution.solution(arr, command);

        assertEquals(5, answer[0]);
        assertEquals(6, answer[1]);
        assertEquals(3, answer[2]);
    }
}
