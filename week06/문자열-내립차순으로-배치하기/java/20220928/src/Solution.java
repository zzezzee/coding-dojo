public class Solution {
    public String solution(String s) {
        String lowerCase = lowerCaseString(s);
        char[] lowerSorted = lowerCaseSort(lowerCase);
        String lowerString = String.valueOf(lowerSorted);

        String upperCase = upperCaseString(s);
        char[] upperSorted = upperCaseSort(upperCase);
        String upperString = String.valueOf(upperSorted);

        return lowerString + upperString;
    }

    public String lowerCaseString(String s) {
        String lowercase = "";

        for (int i = 0; i < s.length(); i += 1) {
            if(Character.isLowerCase(s.charAt(i))){
                lowercase += s.charAt(i);
            }
        }

        return lowercase;
    }

    public char[] lowerCaseSort(String lowercase) {
        char[] myChars = lowercase.toCharArray();

        for (int i = 0; i < lowercase.length(); i += 1) {
            for (int j = i + 1; j < lowercase.length(); j += 1) {
                char max = myChars[i];
                char comparingChar = myChars[j];

                if (max < comparingChar) {
                    char temp = max;
                    myChars[i] = myChars[j];
                    myChars[j] = temp;
                }
            }
        }

        return myChars;
    }

    public String upperCaseString(String s) {
        String upperCase = "";

        for (int i = 0; i < s.length(); i += 1) {
            if(Character.isUpperCase(s.charAt(i))){
                upperCase += s.charAt(i);
            }
        }

        return upperCase;
    }

    public char[] upperCaseSort(String upperCase) {
        char[] myChars = upperCase.toCharArray();

        for (int i = 0; i < upperCase.length(); i += 1) {
            for (int j = i + 1; j < upperCase.length(); j += 1) {
                char max = myChars[i];
                char comparingChar = myChars[j];

                if (max < comparingChar) {
                    char temp = max;
                    myChars[i] = myChars[j];
                    myChars[j] = temp;
                }
            }
        }

        return myChars;
    }
}
