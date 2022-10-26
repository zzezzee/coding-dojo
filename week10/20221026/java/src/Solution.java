import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] collectNumber = compareAnswer(answers, arr1, arr2, arr3);

        return rank(collectNumber);
    }

    public int[] compareAnswer(int[] answers, int[] arr1, int[] arr2, int[] arr3) {
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i += 1) {
            if(answers[i] == arr1[i % 5]){
                count[0] += 1;
            }
            if(answers[i] == arr2[i % 8]){
                count[1] += 1;
            }
            if(answers[i] == arr3[i % 10]){
                count[2] += 1;
            }
        }

        return count;
    }

    public int[] rank(int[] collectNumber) {
        int max = Arrays.stream(collectNumber).max().getAsInt();

        return IntStream.range(0, collectNumber.length)
                .filter(i -> collectNumber[i] == max)
                .map(i -> i + 1)
                .toArray();
    }
}
