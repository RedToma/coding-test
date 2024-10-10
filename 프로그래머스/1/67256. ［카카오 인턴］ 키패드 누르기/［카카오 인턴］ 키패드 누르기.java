class Solution {
    public String solution(int[] numbers, String hand) {
        int left = 10;
        int right = 12;
        StringBuilder sb = new StringBuilder();

        for (int number : numbers) {

            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                right = number;
            } else {
                if(number == 0) number = 11;

                int l_distance = Math.abs(left - number) / 3 + Math.abs(left - number) % 3;
                int r_distance = Math.abs(right - number) / 3 + Math.abs(right - number) % 3;

                if (l_distance > r_distance) {
                    sb.append("R");
                    right = number;
                } else if (l_distance < r_distance) {
                    sb.append("L");
                    left = number;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = number;
                    } else {
                        sb.append("L");
                        left = number;
                    }
                }
            }
        }
        
        return sb.toString();
    }
}