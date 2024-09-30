class Solution {
    static boolean[] visited;
    static int answer;
    
    public int solution(int[] nums) {
        visited = new boolean[nums.length];
        answer = 0;
        
        dfs(nums, 0, 0, 0);

        return answer;
    }
    
    public static void dfs(int[] nums, int start, int sum, int depth) {
        
        if(depth == 3) {
            if(isPrime(sum)) answer++;
            
            return;
        }
        
        for(int i = start; i < nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(nums, i, sum+nums[i], depth+1);
                visited[i] = false;
            }
        }
    }
    
    public static boolean isPrime(int sum) {
        int sqrt = (int) Math.sqrt(sum);
        
        for(int i = 2; i <= sqrt; i++) {
            if(sum % i == 0) return false;
        }
        
        return true;
    }
}