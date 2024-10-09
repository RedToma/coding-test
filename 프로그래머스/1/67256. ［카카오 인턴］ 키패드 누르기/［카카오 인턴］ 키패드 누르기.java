class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int left = 10;
        int right = 12;

        for (int i : numbers) {

            if (i == 1 || i == 4 || i == 7) {
                sb.append("L");
                left = i;
            } else if (i == 3 || i == 6 || i == 9) {
                sb.append("R");
                right = i;
            } else {
                if (i == 0) i = 11;

                int leftDistance = Math.abs(i - left) / 3 + Math.abs(i - left) % 3;
                int rightDistance = Math.abs(i - right) / 3 + Math.abs(i - right) % 3;

                if (leftDistance < rightDistance) {
                    sb.append("L");
                    left = i;
                } else if (leftDistance > rightDistance) {
                    sb.append("R");
                    right = i;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = i;
                    } else {
                        sb.append("R");
                        right = i;
                    }
                }
            }

        }
        
        return sb.toString();
    }
}