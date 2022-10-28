import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void bigLengthSort() {
        Solution solution = new Solution();

        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sortedSize = solution.sort(sizes);

        assertEquals(10, sortedSize[0][0]);
        assertEquals(7, sortedSize[0][1]);
        assertEquals(12, sortedSize[1][0]);
        assertEquals(3, sortedSize[1][1]);
        assertEquals(15, sortedSize[2][0]);
        assertEquals(8, sortedSize[2][1]);
    }

    @Test
    void makeWallet() {
        Solution solution = new Solution();

        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sortedSize = solution.sort(sizes);

        int walletSize = solution.makeWallet(sortedSize);

        assertEquals(120, walletSize);
    }
}
