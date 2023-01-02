import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void validate() {
        String[] words =
                {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int wrongPosition = solution.validate(words);

        assertEquals(8, wrongPosition);
    }

    @Test
    void validateWithCorrectFollowUp() {
        String[] words =
                {
                        "hello", "observe", "effect", "take", "either",
                        "recognize", "encourage", "ensure", "establish",
                        "hang", "gather", "refer", "reference", "estimate", "executive"
                };

        int wrongPosition = solution.validate(words);

        assertEquals(0, wrongPosition);
    }

    @Test
    void findWrongPersonNumber() {
        int n = 3;
        int wrongPosition = 8;

        int wrongPersonNumber = solution.findWrongPersonNumber(n, wrongPosition);

        assertEquals(3, wrongPersonNumber);
    }

    @Test
    void findWrongCycle() {
        int n = 3;
        int wrongPosition = 8;

        int wrongCycle = solution.findWrongCycle(n, wrongPosition);

        assertEquals(3, wrongCycle);
    }

    @Test
    void solution() {
        int n1 = 3;
        String[] words1 =
                {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int n2 = 5;
        String[] words2 =
                {
                        "hello", "observe", "effect", "take", "either",
                        "recognize", "encourage", "ensure", "establish",
                        "hang", "gather", "refer", "reference", "estimate", "executive"
                };


        int[] answer1 = solution.solution(n1, words1);
        int[] answer2 = solution.solution(n2, words2);

        assertArrayEquals(new int[]{3, 3}, answer1);
        assertArrayEquals(new int[]{0, 0}, answer2);
    }
}
