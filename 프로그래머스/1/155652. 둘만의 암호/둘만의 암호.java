import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < skip.length(); i++) set.add(skip.charAt(i));
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {

                if (c >= 'a' && c <= 'z') {
                    if (c == 'z') c = 'a';
                    else c = (char) (c + 1);
                }

                while (set.contains(c)) { 
                    if (c == 'z') c = 'a';
                    else c = (char) (c + 1);
                }
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}