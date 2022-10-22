public class Solution {
    public int[] split(int x) {
        String s = Integer.toString(x);

        String[] splitedWords = new String[s.length()];

        for (int i = 0; i < s.length(); i += 1) {
            splitedWords[i] = String.valueOf(s.charAt(i));
        }

        int[] splitedInt = new int[splitedWords.length];

        for(int i = 0; i < splitedWords.length; i += 1){
            splitedInt[i] = Integer.parseInt(splitedWords[i]);
        }

        return splitedInt;
    }

    public int sum(int[] splitedInt) {
        int sum = 0;
        for (int i = 0; i < splitedInt.length; i += 1) {
            sum += splitedInt[i];
        }

        return sum;
    }

    public boolean hashad(int n, int sum) {
        return n % sum == 0;
    }
}
