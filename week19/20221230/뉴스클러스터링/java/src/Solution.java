import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String str1, String str2) {

        List<String> multiset1 = spliter(str1);
        List<String> multiset2 = spliter(str2);

        if(multiset1.size() == 0 && multiset2.size() == 0){
            return 65536;
        }

        int intersectionSize = intersection(multiset1, multiset2);

        int sumOfSetsSize = sumOfSets(intersectionSize, multiset1.size(), multiset2.size());

        return jaccard(intersectionSize, sumOfSetsSize);
    }

    public List<String> spliter(String str1) {
        List<String> multiset = new ArrayList<>();

        str1 = str1.toLowerCase();

        for (int i = 0; i < str1.length() - 1; i += 1) {
            char c1 = str1.substring(i, i + 2).charAt(0);
            char c2 = str1.substring(i, i + 2).charAt(1);

            if (c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z') {
                multiset.add(str1.substring(i, i + 2));
            }
        }

        return multiset;
    }

    public int intersection(List<String> multiset1, List<String> multiset2) {
        int count = 0;
        List<String> temp = new ArrayList<>(multiset2);

        for (String s : multiset1) {
            if (temp.contains(s)) {
                count += 1;
                temp.remove(s);
            }
        }

        return count;
    }

    public int sumOfSets(int intersectionSize, int size1, int size2) {
        return size1 + size2 - intersectionSize;
    }

    public int jaccard(int intersectionSize, int sumOfSetSize) {
        return (int)((double)intersectionSize/sumOfSetSize*65536);
    }
}
