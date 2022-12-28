import java.util.Arrays;
import java.util.Stack;

public class Solution {
    Stack<String> stack = new Stack<>();

    public int solution(String s) {
        Arrays.stream(s.split(""))
                .forEach(this::remove);

        return stack.isEmpty() ? 1 : 0;
    }

    public void remove(String element) {
        if (!stack.isEmpty() && stack.peek().equals(element)) {
            stack.pop();
            return;
        }
        if(stack.isEmpty() || !stack.peek().equals(element)) {
            stack.push(element);
        }
    }
}
