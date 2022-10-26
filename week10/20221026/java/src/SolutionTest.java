import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void compareAnswer() {
        Solution solution = new Solution();

        int[] answers = {1, 2, 3, 4, 5, 1, 1};

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] result = solution.compareAnswer(answers, arr1, arr2, arr3);

        assertEquals(6, result[0]);
        assertEquals(1, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    void rank() {
        Solution solution = new Solution();

        int[] collectNumber = {5, 1, 2};

        int[] result = solution.rank(collectNumber);

        assertEquals(1, result[0]);
    }
}

