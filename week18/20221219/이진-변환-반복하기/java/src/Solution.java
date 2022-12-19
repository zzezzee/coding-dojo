import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    private int zeroCount = 0;
    private int totalCycle = 0;

    public int[] solution(String s) {
        if(s.equals("1")){
            return new int[]{totalCycle, zeroCount};
        }
        totalCycle += 1;

        int length = s.length();

        int oneCount = 0;
        
        for (int i = 0; i < s.length(); i += 1) {
            if(s.charAt(i) == '1'){
                oneCount += 1;
            }
        }

        zeroCount += length - oneCount;

        String reducedString = Integer.toBinaryString(oneCount);

        return solution(reducedString);
    }
}
