class Solution {
    public String solution(int n) {
        int repeat = n / 2;
        String wm = "수박";
        String s = "수";
        
        String answer = n % 2 == 0 ? wm.repeat(repeat) : wm.repeat(repeat) + s; 
        
        
        
        
        return answer;
    }
}