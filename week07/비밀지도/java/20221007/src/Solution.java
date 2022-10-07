public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] secretMap1 = convert10to2(n, arr1);
        String[] secretMap2 = convert10to2(n, arr2);

        String[] answer = overlap(secretMap1, secretMap2);

        return answer;
    }


    public String[] convert10to2(int n, int[] arr) {
        String[] convertedArray = new String[n];

        for (int i = 0; i < n; i += 1) {
            convertedArray[i] = Integer.toBinaryString(arr[i]);
        }

        for (int i = 0; i < n; i += 1) {
            while(convertedArray[i].length()<n){
                convertedArray[i] = "0" + convertedArray[i];
            }
        }

        return convertedArray;
    }

    public String[] overlap(String[] arr1, String[] arr2) {
        String[] answer = new String[arr1.length];
        String line = "";

        for (int i = 0; i < arr1.length; i += 1) {
            for (int j = 0; j < arr1.length; j += 1) {
                if(arr1[i].charAt(j) == "1".charAt(0) || arr2[i].charAt(j) == "1".charAt(0)){
                    line += "#";
                    continue;
                }

                line += " ";
            }

            answer[i] = line;
            line = "";
        }

        return answer;
    }
}
