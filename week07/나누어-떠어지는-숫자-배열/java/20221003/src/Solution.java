import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] array = count(arr, divisor);

        return array;
    }

    public int[] count(int[] array, int divisor) {
        List<Integer> dividedNumbers = new ArrayList<>();

        for (int i = 0; i < array.length; i += 1) {
            if (array[i] % divisor == 0) {
                dividedNumbers.add(array[i]);
            }
        }

        if (dividedNumbers.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(dividedNumbers);

        int[] dividedNumbersArray = new int[dividedNumbers.size()];

        for (int i = 0; i < dividedNumbers.size(); i += 1) {
            dividedNumbersArray[i] = dividedNumbers.get(i);
        }

        return dividedNumbersArray;
    }
}
