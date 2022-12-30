import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void spliter() {
        Solution solution = new Solution();

        String str1 = "FRAN";

        List<String> multiset1 = solution.spliter(str1);

        assertEquals("fr", multiset1.get(0));
        assertEquals("ra", multiset1.get(1));
        assertEquals("an", multiset1.get(2));

        String str2 = "aa1+aa2";

        List<String> multiset2 = solution.spliter(str2);

        assertEquals("aa", multiset2.get(0));
        assertEquals("aa", multiset2.get(1));
    }

    @Test
    void intersection() {
        Solution solution = new Solution();

        String str1 = "FRANCE";
        String str2 = "french";

        List<String> multiset1 = solution.spliter(str1);
        List<String> multiset2 = solution.spliter(str2);

        int size = solution.intersection(multiset1, multiset2);

        assertEquals(2, size);
    }

    @Test
    void sumOfSet() {
        Solution solution = new Solution();

        int intersectionSize = 3;
        int multisetSize1 = 5;
        int multisetSize2 = 5;

        int sumOfSetSize = solution.sumOfSets(intersectionSize, multisetSize1, multisetSize2);

        assertEquals(7, sumOfSetSize);
    }

    @Test
    void jaccard() {
        Solution solution = new Solution();

        int intersectionSize = 6;
        int sumOfSetsSize = 6;

        int answer = solution.jaccard(intersectionSize, sumOfSetsSize);

        assertEquals(65536, answer);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int answer1 = solution.solution("E=M*C^2", "e=m*c^2");
        int answer2 = solution.solution("aa1+aa2", "AAAA12");

        assertEquals(65536, answer1);
        assertEquals(43690, answer2);
    }
}
