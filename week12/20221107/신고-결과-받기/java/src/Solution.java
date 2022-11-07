import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> report_set = new HashSet<>(Arrays.asList(report));
        System.out.println(report_set);
        HashMap<String, Integer> reported = new HashMap<>();

        for (String user_id: id_list) {
            reported.put(user_id, 0);
        }

        for (String i: report_set) {
            reported.put(i.split(" ")[1], reported.get(i.split(" ")[1]) + 1);
        }

        for (String i: report_set) {
            if (reported.get(i.split(" ")[1]) >= k) {
                answer[Arrays.asList(id_list).indexOf(i.split(" ")[0])] += 1;
            }
        }

        return answer;
    }
}
