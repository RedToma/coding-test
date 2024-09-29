import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] list = new String[s.length()];
        
        for(int i = 0; i < s.length(); i++) list[i] = String.valueOf(s.charAt(i));
        
        Arrays.sort(list, Collections.reverseOrder());
        
        return answer = String.join("", list);
    }
}