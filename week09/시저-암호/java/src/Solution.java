import java.util.Arrays;

public class Solution {
    public String solution(String s, int n) {
        return merge(push(split(s), n));
    }

    public char[] split(String s) {
        String[] arr1 = s.split("");

        char[] arr = new char[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i].charAt(0);
        }

        return arr;
    }

    public char[] push(char[] charArr, int distance) {
        int[] pushedNumber = new int[charArr.length];

        for (int i = 0; i < charArr.length; i += 1) {
            if(charArr[i] >= 65 && charArr[i] <= 90){
                pushedNumber[i] = 65 + ((charArr[i] + distance - 65) % 26);
            }
            if(charArr[i] >= 97 && charArr[i] <= 122){
                pushedNumber[i] = 97 + ((charArr[i] + distance - 97) % 26);
            }
            if(charArr[i] == 32){
                pushedNumber[i] = charArr[i];
            }
        }

        char[] s = new char[pushedNumber.length];

        for (int i = 0; i < pushedNumber.length; i += 1) {
            s[i] += (char) pushedNumber[i];
        }

        return s;
    }

    public String merge(char[] s) {
        String result = new String(s);

        return result;
    }
}
