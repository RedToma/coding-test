class Solution {
    public int solution(String[] babbling) {
        String[] s = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String baby : babbling) {
            String word = baby;

            for (String string : s) {
                if (word.contains(string + string)) continue;

                word = word.replace(string, " ");
            }
            
            word = word.replace(" ", "");
            if (word.isEmpty()) answer++;
        }
        
        return answer;
    }
}