import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, " ", true);

        while (st.hasMoreTokens()) {
            String s1 = st.nextToken();

            if (s1.equals(" ")) {
                sb.append(" ");
            } else {
                sb.append(s1.substring(0, 1).toUpperCase() + s1.substring(1));
            }
        }
        
        return sb.toString();
    }
}