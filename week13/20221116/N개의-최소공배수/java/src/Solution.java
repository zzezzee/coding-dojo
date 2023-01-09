import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr) {
        return lcm(arr);
    }

    public int lcm(int[] arr) {
        return IntStream.range(0, arr.length).reduce(arr[0], (acc, i) -> (
            acc = acc*arr[i]/gcd(acc, arr[i])
        ));
    }

    public int gcd(int x, int y) {
        int max = Math.max(x, y);
        int min = Math.min(x, y);

        while(max % min != 0){
            int r = max % min;
            max = min;
            min = r;
        }

        return min;
    }
}
