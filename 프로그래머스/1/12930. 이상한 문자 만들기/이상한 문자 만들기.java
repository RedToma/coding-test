class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split("");
        int cnt = 0;
        
        for(int i = 0; i < list.length; i++) {
            if(list[i].equals(" ")) {
                answer += " ";
                cnt = 0;
                continue;
            }
            
            if(cnt % 2 == 0) {
                answer += list[i].toUpperCase();
                cnt++;
            }else {
                answer += list[i].toLowerCase();
                cnt++;
            } 
        }
        return answer;
    }
}