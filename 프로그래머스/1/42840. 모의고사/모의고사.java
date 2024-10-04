import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] result = new int[answers.length];
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) result[0]++;
            if (answers[i] == two[i % two.length]) result[1]++;
            if (answers[i] == three[i % three.length]) result[2]++;
        }

        int max = Math.max(result[0], Math.max(result[1], result[2]));

        ArrayList<Integer> list = new ArrayList<>();

        if (max == result[0]) list.add(1);
        if (max == result[1]) list.add(2);
        if (max == result[2]) list.add(3);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}