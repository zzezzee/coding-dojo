import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void arrayToMap() {
        Solution solution = new Solution();

        int[] nums = {3, 1, 2, 3};

        Map<Integer, Integer> map = solution.arrayToMap(nums);

        assertEquals(1, map.get(1));
        assertEquals(1, map.get(2));
        assertEquals(2, map.get(3));
    }

    @Test
    void sort() {
        Solution solution = new Solution();

        int[] nums = {3, 1, 2, 3};

        Map<Integer, Integer> map = solution.arrayToMap(nums);

        List<Integer> sortedKey = Solution.sort(map);

        assertEquals(1, sortedKey.get(0));
        assertEquals(2, sortedKey.get(1));
        assertEquals(3, sortedKey.get(2));
    }

    @Test
    void select() {
        Solution solution = new Solution();

        int[] nums = {3, 1, 2, 3};

        Map<Integer, Integer> map = solution.arrayToMap(nums);

        List<Integer> sortedKey = Solution.sort(map);

        int result = solution.select(sortedKey, nums.length);

        assertEquals(2, result);
    }
}
