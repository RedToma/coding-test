import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> reportMember = new HashMap<>();
        Map<String, Integer> idx = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            reportMember.put(id_list[i], new HashSet<>());
            idx.put(id_list[i], i);
        }

        for (String s : report) {
            String[] split = s.split(" ");
            String user = split[0];
            String reported = split[1];

            reportMember.get(reported).add(user);
        }

        for (String s : reportMember.keySet()) {
            Set<String> send = reportMember.get(s);
            if (send.size() >= k) {
                for (String user : send) {
                    answer[idx.get(user)]++;
                }
            }
        }
        
        return answer;
    }
}