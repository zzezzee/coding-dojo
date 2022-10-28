import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public int solution(int[] d, int budget) {
        return support(sort(d), budget);
    }

    public int[] sort(int[] d) {
        Arrays.sort(d);

        return d;
    }

    public int support(int[] sortedArray, int budget) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < sortedArray.length; i += 1) {
            if(sum + sortedArray[i] <= budget){
                sum += sortedArray[i];
                count += 1;
            }
        }

        return count;
    }
}
