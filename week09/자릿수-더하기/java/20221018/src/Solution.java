import java.util.Arrays;

public class Solution {
    public int solution(int n) {
        return add(n);
    }

    public int add(int n) {
        return Arrays.stream(Integer.toString(n).split(""))
                .mapToInt(Integer::parseInt).sum();
    }
}
