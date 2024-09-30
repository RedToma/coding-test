class Solution {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int sum = 0;
        for(int i = 0; i < a - 1; i++) sum += month[i];
        
        sum += b;

        return days[(sum+4)%7];
    }
}