import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int collectCount = getCollectCount(lottos, win_nums);

        int zeroCount = getZeroCount(lottos);

        int highestCount = collectCount + zeroCount;
        int lowestCount = collectCount;

        int[] count = {highestCount, lowestCount};

        int[] answer = getRanking(count);

        return answer;
    }

    public int getCollectCount(int[] lottos, int[] win_nums) {
        List<Integer> win_nums_list = Arrays
                .stream(win_nums)
                .boxed()
                .collect(Collectors.toList());

        return IntStream.range(0, lottos.length).filter(i -> win_nums_list.contains(lottos[i])).toArray().length;
    }

    public int getZeroCount(int[] lottos) {
        return Arrays.stream(lottos).filter(number -> number == 0).toArray().length;
    }

    public int[] getRanking(int[] count) {
        return Arrays.stream(count).map(i -> {
            switch (i) {
                case 6 -> {
                    return 1;
                }
                case 5 -> {
                    return 2;
                }
                case 4 -> {
                    return 3;
                }
                case 3 -> {
                    return 4;
                }
                case 2 -> {
                    return 5;
                }
                default -> {
                    return 6;
                }
            }
        }).toArray();
    }
}
