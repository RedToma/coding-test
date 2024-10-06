class Solution {
    public int solution(String dartResult) {
        String num = "";
        int prev = 0;
        int curr = 0;
        int answer = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (c >= '0' && c <= '9') {
                answer += curr;
                prev = curr;
                curr = 0;
                num += c;
            } else {
                if (c == 'S' || c == 'D' || c == 'T') {
                    curr = Integer.parseInt(num);
                    num = "";

                    if (c == 'S') curr = (int) Math.pow(curr, 1);
                    else if (c == 'D') curr = (int) Math.pow(curr, 2);
                    else if (c == 'T') curr = (int) Math.pow(curr, 3);
                } else {
                    if (c == '*') {
                        answer += prev * 2;
                        answer -= prev;
                        curr *= 2;
                    } else {
                        curr *= -1;
                    }
                }
            }
        }

        answer += curr;

        return answer;
    }
}