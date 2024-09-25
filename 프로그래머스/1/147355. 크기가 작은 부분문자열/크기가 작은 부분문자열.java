class Solution {
    public int solution(String t, String p) {
        Long com = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            Long n = Long.parseLong(t.substring(i, p.length() + i));
            if (n <= com) answer++;
        }
        
        return answer;
    }
}