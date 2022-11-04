import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        return count(pop(board, moves));
    }

    public List<Integer> pop(int[][] board, int[] moves) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    numbers.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        return numbers;
    }

    public int count(List<Integer> basket) {
        int count = 0;

        for (int k = 0; k < basket.size(); k++) {
            if (k != (basket.size() - 1)) {
                if (basket.get(k) == basket.get(k + 1)) {
                    basket.remove(k);
                    basket.remove(k);
                    count += 2;
                    k = -1;
                }
            }
        }

        return count;
    }
}

