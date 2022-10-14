import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void failPeoplePerStage() {
        Solution solution = new Solution();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int N2 = 5;
        int[] stages2 = {4, 4, 4, 4};

        Map<Integer, Integer> failPeoplePerStage = solution.failPeoplePerStage(N, stages);
        Map<Integer, Integer> failPeoplePerStage2 = solution.failPeoplePerStage(N2, stages2);

        assertEquals(1, failPeoplePerStage.get(1));
        assertEquals(3, failPeoplePerStage.get(2));
        assertEquals(2, failPeoplePerStage.get(3));
        assertEquals(1, failPeoplePerStage.get(4));
        assertEquals(0, failPeoplePerStage.get(5));

        assertEquals(0, failPeoplePerStage2.get(1));
        assertEquals(0, failPeoplePerStage2.get(2));
        assertEquals(0, failPeoplePerStage2.get(3));
        assertEquals(4, failPeoplePerStage2.get(4));
    }

    @Test
    void calculateFailRate() {
        Solution solution = new Solution();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int N2 = 7;
        int[] stages2 = {4, 4, 4, 4};

        Map<Integer, Integer> failPeoplePerStage = solution.failPeoplePerStage(N, stages);
        Map<Integer, Integer> failPeoplePerStage2 = solution.failPeoplePerStage(N2, stages2);

        Map<Integer, Double> failRatePerStage = solution.calculateFailRate(N, stages.length, failPeoplePerStage);
        Map<Integer, Double> failRatePerStage2 = solution.calculateFailRate(N2, stages2.length, failPeoplePerStage2);

        assertEquals((double) 1 / 8, failRatePerStage.get(1));
        assertEquals((double) 3 / 7, failRatePerStage.get(2));
        assertEquals((double) 2 / 4, failRatePerStage.get(3));
        assertEquals((double) 1 / 2, failRatePerStage.get(4));
        assertEquals((double) 0 / 1, failRatePerStage.get(5));

        assertEquals((double) 0 / 4, failRatePerStage2.get(1));
        assertEquals((double) 0 / 4, failRatePerStage2.get(2));
        assertEquals((double) 0 / 4, failRatePerStage2.get(3));
        assertEquals((double) 4 / 4, failRatePerStage2.get(4));
        assertEquals(0.0, failRatePerStage2.get(5));
    }

    @Test
    void sort() {
        Solution solution = new Solution();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        Map<Integer, Integer> failPeoplePerStage = solution.failPeoplePerStage(N, stages);

        Map<Integer, Double> failRatePerStage = solution.calculateFailRate(N, stages.length, failPeoplePerStage);

        int[] result = solution.sort(failRatePerStage);

        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
        assertEquals(2, result[2]);
        assertEquals(1, result[3]);
        assertEquals(5, result[4]);
    }
}
