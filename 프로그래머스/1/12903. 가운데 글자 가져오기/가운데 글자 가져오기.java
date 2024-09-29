class Solution {
    public String solution(String s) {
        String answer = "";
        int location = 0;
        
        if(s.length() % 2 == 0) {
            location = s.length() / 2;
            answer = s.substring(location - 1, location + 1);
        } else {
            location = s.length() / 2;
            answer = s.substring(location, location + 1);
        }
        return answer;
    }
}