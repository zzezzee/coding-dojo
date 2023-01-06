import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void dictionary() {
        List<String> dictionary = solution.makeDictionary();

        assertEquals(26, dictionary.size());
        assertEquals("Z", dictionary.get(25));
    }

    @Test
    void compression() {
        List<String> dictionary = solution.makeDictionary();
        List<Integer> output = new ArrayList<>();



        String msg = "KAKAO";

        System.out.println(msg.substring(5).length());

        int[] answer = solution.compression(dictionary, msg, output);

        assertEquals("KA", dictionary.get(26));

        assertArrayEquals(new int[]{11, 1, 27, 15}, answer);
    }
}
