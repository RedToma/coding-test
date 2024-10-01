class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int answer = 1;
        
        for(int i : section) {
            if(start+m-1 < i) {
                start = i;
                answer++;
            }
        }
        
        
        return answer;
    }
}