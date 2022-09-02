class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowLength = arr1.length;
        int columnLength = arr1[0].length;

        int[][] answer = new int[rowLength][columnLength];

        for(int i = 0; i < rowLength; i += 1){
            for (int j = 0; j < columnLength; j += 1) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}