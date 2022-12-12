import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void split() {
        String s = "1 2 3 4";

        String[] arr = solution.split(s);

        assertEquals("1", arr[0]);
        assertEquals("2", arr[1]);
        assertEquals("3", arr[2]);
    }

    @Test
    void findMaxAndMin() {
        String[] arr = {"4", "3", "2", "1"};

        String answer = solution.findMaxAndMin(arr);

        assertEquals("1 4", answer);
    }
}
