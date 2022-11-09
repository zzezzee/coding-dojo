import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void collectNumber() {
        Solution solution = new Solution();

        int[] lottos = {0, 3, 2, 1};
        int[] win_nums = {4, 3, 2, 1};

        int collectCount = solution.getCollectCount(lottos, win_nums);

        assertEquals(3, collectCount);
    }

    @Test
    void zeroCount() {
        Solution solution = new Solution();

        int[] lottos = {0, 3, 2, 1};

        int zeroCount = solution.getZeroCount(lottos);

        assertEquals(1, zeroCount);
    }

    @Test
    void rank() {
        Solution solution = new Solution();

        int[] count = {6, 1};

        int[] answer = solution.getRanking(count);

        assertEquals(1, answer[0]);
        assertEquals(6, answer[1]);
    }
}
