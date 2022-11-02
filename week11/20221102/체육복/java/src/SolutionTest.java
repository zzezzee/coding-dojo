import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void getBorrowStudentNumber() {
        Solution solution = new Solution();

        int[] lost = {2, 4};
        int[] reserve = {3};

        int number = solution.solution(5, lost, reserve);

        assertEquals(4, number);
    }

    @Test
    void getBorrowStudentNumberd() {
        Solution solution = new Solution();

        int[] lost = {1, 2, 4};
        int[] reserve = {2, 3, 4, 5};

        int number = solution.solution(5, lost, reserve);

        assertEquals(4, number);
    }
}
