import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        return findMaxAndMin(split(s));
    }

    public String[] split(String s) {
        String[] arr = s.split(" ");

        return arr;
    }

    public String findMaxAndMin(String[] arr) {
        int[] intArr = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int min = intArr[0];
        int max = intArr[intArr.length - 1];

        String answer = min + " " + max;

        return answer;
    }
}
