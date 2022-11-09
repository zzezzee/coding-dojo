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
        int collectCount = 0;

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]){
                    collectCount += 1;
                }
            }
        }

        return collectCount;
    }

    public int getZeroCount(int[] lottos) {
        int zeroCount = 0;

        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0){
                zeroCount+= 1;
            }
        }

        return zeroCount;
    }

    public int[] getRanking(int[] count) {
        int[] answer = new int[2];

        for (int i = 0; i < count.length; i++) {
            switch(count[i]){
                case 6 -> answer[i] = 1;
                case 5 -> answer[i] = 2;
                case 4 -> answer[i] = 3;
                case 3 -> answer[i] = 4;
                case 2 -> answer[i] = 5;
                default -> answer[i] = 6;
            }
        }

        return answer;
    }
}
