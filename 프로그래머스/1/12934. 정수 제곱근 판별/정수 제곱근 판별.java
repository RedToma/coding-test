class Solution {
    public long solution(long n) {
        long answer = 0;
        int sqrt = (int) Math.sqrt(n);
        long result = (long) Math.pow(sqrt, 2);
        
        answer = result == n ? (long) Math.pow(sqrt+1, 2) : -1;
        
        return answer;
    }
}