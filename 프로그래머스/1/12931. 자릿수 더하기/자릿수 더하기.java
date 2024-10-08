import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = trans(n);
        
        return answer;
    }
    
    public static int trans(int n) {
        String trans = String.valueOf(n);
        int sum = 0;
        
        for(int i = 0; i < trans.length(); i++) {
            sum += Integer.parseInt(String.valueOf(trans.charAt(i)));
        }
        
        return sum;
    }
}