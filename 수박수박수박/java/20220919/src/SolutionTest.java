import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// 길이에 따른 문자열 출력
//
class SolutionTest {
    @Test
    void waterMelon() {
        Solution solution = new Solution();

        String result1 =solution.waterMelon(1);

        assertEquals("수", result1);

        String result2 =solution.waterMelon(2);

        assertEquals("수박", result2);

        String result3 =solution.waterMelon(3);

        assertEquals("수박수", result3);
    }
}
