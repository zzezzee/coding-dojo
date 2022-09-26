public class Solution {
    public long solution(long n) {
        double x = (double) n;

        double root = Math.sqrt(x);

        long y = (long) root;

        if(root - y == 0){
            return (long) Math.pow((y + 1), 2);
        }

        return -1;
    }
}
