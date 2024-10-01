import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] result = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];
        int right = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int lotto : lottos) map.put(lotto, map.getOrDefault(lotto, 0) + 1);

        for (int winNum : win_nums) {
            if(map.containsKey(winNum)) {
                right++;
            }
        }

        if (map.containsKey(0)) {
            answer[0] = result[right + map.get(0)];
            answer[1] = result[right];
        } else {
            answer[0] = result[right];
            answer[1] = result[right];
        }
        
        return answer;
    }
}