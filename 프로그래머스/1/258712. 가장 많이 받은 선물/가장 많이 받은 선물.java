import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int f_len = friends.length;
        Map<String, Integer> idx = new HashMap<>();
        int[] point = new int[f_len];
        int[][] exchange = new int[f_len][f_len];
        int answer = 0;

        for (int i = 0; i < f_len; i++) idx.put(friends[i], i);

        for (String gift : gifts) {
            String[] split = gift.split(" ");
            String from = split[0];
            String to = split[1];

            point[idx.get(from)]++;
            point[idx.get(to)]--;
            exchange[idx.get(from)][idx.get(to)]++;
        }

        for (int i = 0; i < f_len; i++) {
            int gift = 0;
            for (int j = 0; j < f_len; j++) {
                if (friends[i].equals(friends[j])) continue;

                if (exchange[i][j] > exchange[j][i] ||
                        (exchange[i][j] == exchange[j][i] && point[i] > point[j])) {
                    gift++;
                }
            }
            if (gift > answer) answer = gift;
        }
        
        return answer;
    }
}