import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void compare() {
        Solution solution = new Solution();

        String[] participant = {"leo",  "eden"};
        String[] completion = {"eden"};

        String answer = solution.compare(participant, completion);

        assertEquals("leo", answer);
    }
}
