class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] list = new int[number+1];
        
        for(int i = 1; i <= number; i++) {
            int sqrt = (int)Math.sqrt(i);
            for(int j = 1; j <= sqrt; j++) {
                if(i % j == 0) {
                    list[i]++;
                    if(i / j != j) {
                        list[i]++;
                    }
                }
            }
        }
        
        for(int i = 1; i < list.length; i++) {
            if(list[i] > limit) {
                answer += power;
                continue;
            }
            answer += list[i];
        }
        
        return answer;
    }
}