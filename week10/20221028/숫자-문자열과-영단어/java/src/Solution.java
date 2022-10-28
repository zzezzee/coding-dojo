import java.util.Arrays;

public class Solution {
    public final String[] numbers = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    public String[] index = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };

    public int solution(String s) {
        String answer = Arrays.stream(index)
                .reduce(s, (acc, index) -> acc.replace(numbers[Integer.parseInt(index)], index));

        return Integer.parseInt(answer);
    }
}

