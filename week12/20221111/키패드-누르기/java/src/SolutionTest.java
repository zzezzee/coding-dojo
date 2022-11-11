import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sideButtonTest() {
        Solution solution = new Solution();

        int[] numbers = {1, 4, 7, 3, 6, 9};
        String hand = "right";

        String result = solution.solution(numbers, hand);

        assertEquals("LLLRRR", result);
    }

    @Test
    void saveLeftPosition() {
        Solution solution = new Solution();

        int[] position = solution.saveLeftPosition(4);

        assertEquals(1, position[0]);
        assertEquals(0, position[1]);
    }
}
