import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

//public class Solution {
//    public String[] split(String input) {
//        return input.trim().replaceAll(" +", "/").split("/");
//    }
//
//    public String[] convert(String[] str) {
////        AtomicInteger index = new AtomicInteger();
////
////        String[] result = Arrays.stream(s).map(i -> Arrays.stream(i.split(""))
////                .filter(j -> index.getAndIncrement() % 2 == 0
////                        ? j.toUpperCase()
////                        : j.toLowerCase()
////                ))
//        String answer = "";
//
//
//    }
//}

class Solution {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}
