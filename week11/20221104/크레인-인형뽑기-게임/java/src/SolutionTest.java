import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {

    @Test
    void pop() {
        Solution solution = new Solution();
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        List<Integer> numbers = solution.pop(board, moves);

        assertEquals(4, numbers.get(0));
        assertEquals(3, numbers.get(1));
        assertEquals(1, numbers.get(2));
        assertEquals(1, numbers.get(3));
        assertEquals(3, numbers.get(4));
        assertEquals(2, numbers.get(5));
        assertEquals(4, numbers.get(6));
    }

    @Test
    void popAtSameColumn() {
        Solution solution = new Solution();

        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };


        int[] moves = {1, 1, 1};

        List<Integer> numbers = solution.pop(board, moves);

        assertEquals(2, numbers.size());
        assertEquals(4, numbers.get(0));
        assertEquals(3, numbers.get(1));
    }

    @Test
    void countDisappearDoll1() {
        Solution solution = new Solution();

        List<Integer> basket = new ArrayList<>() {{
            add(4);
            add(3);
            add(1);
            add(1);
            add(3);
            add(2);
            add(4);
        }};

        int answer = solution.count(basket);

        assertEquals(4, answer);
    }
}
