import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int[][] exchange = new int[friends.length][friends.length];
        int[] point = new int[friends.length];
        Map<String, Integer> idx = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < friends.length; i++) idx.put(friends[i], i);

        for (String gift : gifts) {
            String[] split = gift.split(" ");

            point[idx.get(split[0])]++;
            point[idx.get(split[1])]--;
            exchange[idx.get(split[0])][idx.get(split[1])]++;
        }

        for (int i = 0; i < friends.length; i++) {
            int gift = 0;
            for (int j = 0; j < friends.length; j++) {
                if (friends[i].equals(friends[j])) continue;

                if (exchange[i][j] > exchange[j][i] || (exchange[i][j] == exchange[j][i] && point[i] > point[j])) {
                    gift++;
                }
            }
            answer = Math.max(answer, gift);
        }
        
        return answer;
    }
}