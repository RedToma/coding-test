class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int cnt = 0;
        
        for(boolean sign : signs) {
            if(!sign) {
                answer += absolutes[cnt] * -1;
                cnt++;
                continue;
            }
            
            answer += absolutes[cnt];
            
            cnt++;
        }
        
        return answer;
    }
}