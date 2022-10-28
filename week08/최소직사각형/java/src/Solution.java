public class Solution {
    public int solution(int[][] sizes) {
        return makeWallet(sort(sizes));
    }

    public int[][] sort(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int temp = 0;
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        return sizes;
    }

    public int makeWallet(int[][] sortedSize) {
        int length = 0;
        int height = 0;

        for (int i = 0; i < sortedSize.length; i++) {
            if(sortedSize[i][0] > length){
                length = sortedSize[i][0];
            }
            if(sortedSize[i][1] > height){
                height = sortedSize[i][1];
            }
        }

        return length * height;
    }
}
