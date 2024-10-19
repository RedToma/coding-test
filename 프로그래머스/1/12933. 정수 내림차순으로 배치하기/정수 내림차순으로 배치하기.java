import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] s = String.valueOf(n).split("");
        Arrays.sort(s);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length; i++) sb.append(s[i]);
        
        long answer = Long.parseLong(sb.reverse().toString());
        
        return answer;
    }
}