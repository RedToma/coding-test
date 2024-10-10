import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i = 0; i < survey.length; i++) {

            if (choices[i] < 4) {
                char c = survey[i].charAt(0);

                if (choices[i] == 1) map.put(c, map.getOrDefault(c, 0) + 3);
                else if (choices[i] == 2) map.put(c, map.getOrDefault(c, 0) + 2);
                else if (choices[i] == 3) map.put(c, map.getOrDefault(c, 0) + 1);

            } else if (choices[i] > 4) {
                char c = survey[i].charAt(1);

                if (choices[i] == 5) map.put(c, map.getOrDefault(c, 0) + 1);
                else if (choices[i] == 6) map.put(c, map.getOrDefault(c, 0) + 2);
                else if (choices[i] == 7) map.put(c, map.getOrDefault(c, 0) + 3);

            }
        }

        StringBuilder sb = new StringBuilder();

        if (map.get('R') > map.get('T')) sb.append("R");
        else if (map.get('R') < map.get('T')) sb.append("T");
        else sb.append("R");


        if (map.get('C') > map.get('F')) sb.append("C");
        else if (map.get('C') < map.get('F')) sb.append("F");
        else sb.append("C");


        if (map.get('J') > map.get('M')) sb.append("J");
        else if (map.get('J') < map.get('M')) sb.append("M");
        else sb.append("J");


        if (map.get('A') > map.get('N')) sb.append("A");
        else if (map.get('A') < map.get('N')) sb.append("N");
        else sb.append("A");
        
        return sb.toString();
    }
}