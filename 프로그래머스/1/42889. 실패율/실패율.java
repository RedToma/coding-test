import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] answers = new double[N];
        int len = stages.length;

        for (int i = 0; i < len; i++) {
            if (N+1 != stages[i]) answers[stages[i] - 1]++;
        }

        for (int i = 0; i < answers.length; i++) {
            int sub = (int) answers[i];
            if(len != 0){
                answers[i] = answers[i] / len;
            }
            len -= sub;
        }

        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < answers.length; i++) map.put(i+1, answers[i]);

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}