import java.util.Arrays;
import java.util.List;

public class Solution {
    private final int[][] keyPad = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -2}
    };

    int[] leftPosition = {3, 0};
    int[] rightPosition = {3, 2};

    private final List<Integer> leftNumbers = Arrays.asList(1, 4, 7);
    private final List<Integer> middleNumbers = Arrays.asList(2, 5, 8, 0);
    private final List<Integer> rightNumbers = Arrays.asList(3, 6, 9);

    public String solution(int[] numbers, String hand) {
        hand = hand.equals("right") ? "R" : "L";

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (leftNumbers.contains(numbers[i])) {
                answer.append("L");
                saveLeftPosition(numbers[i]);
            }
            if (rightNumbers.contains(numbers[i])) {
                answer.append("R");
                saveRightPosition(numbers[i]);
            }
            if (middleNumbers.contains(numbers[i])) {
                String s = handDiscriminator(numbers[i], hand);
                answer.append(s);
            }
        }

        return answer.toString();
    }

    private String handDiscriminator(int number, String hand) {
        int[] numberPosition = {0, 0};

        for (int i = 0; i < keyPad.length; i++) {
            for (int j = 0; j < keyPad[0].length; j++) {
                if (number == keyPad[i][j]) {
                    numberPosition[0] = i;
                    numberPosition[1] = j;
                }
            }
        }

        double leftHandDistance =
                Math.abs(leftPosition[0]-numberPosition[0])
                + Math.abs(leftPosition[1]-numberPosition[1]);

        double rightHandDistance =
                Math.abs(rightPosition[0]-numberPosition[0])
                        + Math.abs(rightPosition[1]-numberPosition[1]);

        String s = "";

        if(leftHandDistance > rightHandDistance){
            s = "R";
            rightPosition[0] = numberPosition[0];
            rightPosition[1] = numberPosition[1];
        }
        if(leftHandDistance < rightHandDistance){
            s = "L";
            leftPosition[0] = numberPosition[0];
            leftPosition[1] = numberPosition[1];
        }
        if(rightHandDistance == leftHandDistance) {
            s = hand;
            if(hand.equals("R")){
                rightPosition[0] = numberPosition[0];
                rightPosition[1] = numberPosition[1];
            }
            if(hand.equals("L")){
                leftPosition[0] = numberPosition[0];
                leftPosition[1] = numberPosition[1];
            }
        }

        return s;
    }

    public int[] saveLeftPosition(int number) {
        for (int i = 0; i < keyPad.length; i++) {
            for (int j = 0; j < keyPad[0].length; j++) {
                if (number == keyPad[i][j]) {
                    leftPosition[0] = i;
                    leftPosition[1] = j;
                }
            }
        }

        return leftPosition;
    }

    public int[] saveRightPosition(int number) {
        for (int i = 0; i < keyPad.length; i++) {
            for (int j = 0; j < keyPad[0].length; j++) {
                if (number == keyPad[i][j]) {
                    rightPosition[0] = i;
                    rightPosition[1] = j;
                }
            }
        }

        return rightPosition;
    }
}
