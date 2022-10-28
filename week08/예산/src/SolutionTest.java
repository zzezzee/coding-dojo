import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sort() {
        Solution solution = new Solution();

        int[] d = {1, 3, 2, 5, 4};

        int[] sortedArray = solution.sort(d);

        assertEquals(1, sortedArray[0]);
        assertEquals(2, sortedArray[1]);
        assertEquals(3, sortedArray[2]);
        assertEquals(4, sortedArray[3]);
        assertEquals(5, sortedArray[4]);
    }

    @Test
    void support() {
        Solution solution = new Solution();

        int[] d = {1, 3, 2, 5, 4};

        int[] sortedArray = solution.sort(d);

        int support = solution.support(sortedArray, 9);

        assertEquals(3, support);
    }
}
