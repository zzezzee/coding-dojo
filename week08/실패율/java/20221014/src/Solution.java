import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Integer> failPerPlePerStage = failPeoplePerStage(N, stages);

        Map<Integer, Double> failRate = calculateFailRate(N, stages.length, failPerPlePerStage);

        return sort(failRate);
    }

    public Map<Integer, Integer> failPeoplePerStage(int n, int[] stages) {
        Map<Integer, Integer> failPeoplePerStage = new HashMap<>();

        for (int i = 1; i <= n; i += 1) {
            int count = 0;
            for (int j = 0; j < stages.length; j += 1) {
                if (stages[j] == i) {
                    count += 1;
                }
            }

            failPeoplePerStage.put(i, count);
        }
        System.out.println(failPeoplePerStage);

        return failPeoplePerStage;
    }

    public Map<Integer, Double> calculateFailRate(int n, int length, Map<Integer, Integer> failPeoplePerStage) {
        Map<Integer, Double> failRatePerStage = new HashMap<>();

        int accumulator = 0;
        double failRate = 0;

        for (int i = 1; i <= n; i += 1) {
            if (length == accumulator) {
                failRatePerStage.put(i, 0.0);
                break;
            }

            failRate = failPeoplePerStage.get(i) / (double) (length - accumulator);
            accumulator += failPeoplePerStage.get(i);
            failRatePerStage.put(i, failRate);
        }

        System.out.println(failRatePerStage);

        return failRatePerStage;
    }

    public int[] sort(Map<Integer, Double> failRatePerStage) {
        int[] result = new int[failRatePerStage.size()];
        int initialSize = failRatePerStage.size();

        for (int i = 0; i < initialSize; i += 1) {
            int index = 0;
            double max = -1;

            for (Integer key : failRatePerStage.keySet()) {
                if (max < failRatePerStage.get(key)) {
                    max = failRatePerStage.get(key);
                    index = key;
                }
            }

            result[i] = index;
            failRatePerStage.remove(index);
        }

        return result;
    }
}
