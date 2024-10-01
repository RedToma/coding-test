import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        score = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        
        for(int i = 0; i < score.length; i++) {
                if(pq.size() == m) {
                    answer += pq.peek() * m;
                    pq.clear();
                    pq.add(score[i]);
                } else {
                    pq.add(score[i]);
                }
            }
        
        if(pq.size() == m) answer += pq.peek() * m;
        
        return answer;
    }
}