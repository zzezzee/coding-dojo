import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        return IntStream.range(2, n)
                .filter(i -> n % i == 1).findFirst().getAsInt();
    }
}
