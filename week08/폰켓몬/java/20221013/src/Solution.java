import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int solution(int[] nums) {
        return select(sort(arrayToMap(nums)), nums.length);
    }

    public Map<Integer, Integer> arrayToMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(nums)
                .forEach(number -> map.put(number, 0));

        Arrays.stream(nums)
                .forEach(number -> map.put(number, map.get(nums[number]) + 1));

        return map;
    }

    public static List<Integer> sort(Map<Integer, Integer> map) {
        List<Integer> keySetList = new ArrayList<>(map.keySet());

        Collections.sort(keySetList, (Comparator.comparing(map::get)));

        return keySetList;
    }

    public int select(List<Integer> sortedKey, int length) {
        if(sortedKey.size() > length/2){
            return length/2;
        }

        return sortedKey.size();
    }
}
