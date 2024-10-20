import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                else if (stack.peek() == '(') stack.pop();
            }
        }

        if (!stack.isEmpty()) return false;

        return answer;
    }
}