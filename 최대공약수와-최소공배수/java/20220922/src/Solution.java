public class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        int gcf = gcf(min, max);
        int lcm = lcm(gcf, max, min);

        return new int[]{gcf, lcm};
    }

    private int gcf(int min, int max) {
        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }

        return max;
    }

    private int lcm(int gcf, int max, int min) {
        return max*min/gcf;
    }
}
