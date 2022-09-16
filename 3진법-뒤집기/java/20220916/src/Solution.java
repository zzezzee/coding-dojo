public class Solution {
    public int solution(int n) {
        String x = convert10to3(n);

        String y = reverse(x);

        int z = convert3to10(y);

        return z;
    }

    public String convert10to3(int n) {
        return Integer.toString(n, 3);
    }

    public String reverse(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        String reversedString = stringBuffer.reverse().toString();

        return reversedString;
    }

    public int convert3to10(String s) {
        return Integer.parseInt(s, 3);
    }
}
