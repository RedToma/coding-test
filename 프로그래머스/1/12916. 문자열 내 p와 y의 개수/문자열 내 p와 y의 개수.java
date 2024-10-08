class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'p':
                    p++;
                    break;
                case 'P':
                    p++;
                    break;
                case 'y':
                    y++;
                    break;
                case 'Y':
                    y++;
                    break;
            }
        }
        
        if (y != p)
            answer = false;
        
        return answer;
    }
}