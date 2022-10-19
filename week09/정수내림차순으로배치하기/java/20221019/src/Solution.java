import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public long decending(long n) {
        String[] s = Long.toString(n).split("");

        Arrays.sort(s, Collections.reverseOrder());

        String s2 = Arrays.stream(s).reduce("", (acc, i) -> acc + i);

        return Long.parseLong(s2);
    }
}
