import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        int k = 2;

        int[] answer = solution.solution(id_list, report, k);

        assertEquals(2, answer[0]);
        assertEquals(1, answer[1]);
        assertEquals(1, answer[2]);
        assertEquals(0, answer[3]);
    }
}
