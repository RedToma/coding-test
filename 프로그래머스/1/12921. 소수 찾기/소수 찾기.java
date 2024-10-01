class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) answer += isPrime(i) ? 1 : 0;
        
        return answer;
    }
    
    public static boolean isPrime(int n) {
        int sqrt = (int) Math.sqrt(n);
        
        for(int i = 2; i <= sqrt; i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}