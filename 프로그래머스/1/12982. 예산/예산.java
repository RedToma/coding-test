import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int all = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++) {
            if(all + d[i] <= budget) {
                all += d[i];
                answer++;
            }
        }
        
        return answer;
    }
}