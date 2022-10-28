import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void score() {
        Solution solution = new Solution();

        int score = solution.score("1S2D3T");

        assertEquals(32, score);
    }

    @Test
    void option1() {
        Solution solution = new Solution();

        int score = solution.score("1S2D*3T");

        assertEquals(37, score);

        int score1 = solution.score("1S*2T*3S");

        assertEquals(23, score1);
    }

    @Test
    void option2() {
        Solution solution = new Solution();

        int score = solution.score("1S#2D3T");

        assertEquals(30, score);

        int score1 = solution.score("1S2D3D#");

        assertEquals(-4, score1);
    }

    @Test
    void totalTest() {
        Solution solution = new Solution();

        int score = solution.score("1S#2D3T");

        assertEquals(30, score);

        int score1 = solution.score("1D2S#10S");

        assertEquals(9, score1);

        int score2 = solution.score("1D2S0T");

        assertEquals(3, score2);

        int score3 = solution.score("1S*2T*3S");

        assertEquals(23, score3);

        int score4 = solution.score("1D#2S*3S");

        assertEquals(5, score4);

        int score5 = solution.score("1T2D3D#");

        assertEquals(-4, score5);

        int score6 = solution.score("1D2S3T*");

        assertEquals(59, score6);
    }
}
