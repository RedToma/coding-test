import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int zero = 0;

        char[] charArray = Y.toCharArray();
        Arrays.sort(charArray);

        for (int i = 0; i < X.length(); i++) {
            map.put(X.charAt(i), map.getOrDefault(X.charAt(i), 0) + 1);
        }

        for (int i = 0; i < charArray.length; i++) {
            if(map.containsKey(charArray[i])) {
                if (charArray[i] == '0') zero++;
                if (map.get(charArray[i]) == 1) {
                    map.remove(charArray[i]);
                    sb.append(charArray[i]);
                } else {
                    map.put(charArray[i], map.get(charArray[i]) - 1);
                    sb.append(charArray[i]);
                }
            }
        }
        
        if(sb.toString().equals("")) return "-1";
        else if(sb.toString().length() == zero) return "0";

        
        return sb.reverse().toString();
    }
}