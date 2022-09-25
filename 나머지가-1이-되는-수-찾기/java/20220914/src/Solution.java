public class Solution {
    public int calculate(int n) {
        for (int i = 2; i < n; i += 1) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}
