import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void toUpperCase(){
        String[] input = {"3people", "", "unfollowed","me", ""};

        String ss = solution.toUppercase(input);
        System.out.println();

        assertEquals("3people Unfollowed Me", ss);
    }

    @Test
    void split() {
        String input = "3people  Unfollowed Me ";

        String[] words = solution.split(input);

        assertArrayEquals(new String[]{"3people", "", "unfollowed", "me"}, words);
    }
}
