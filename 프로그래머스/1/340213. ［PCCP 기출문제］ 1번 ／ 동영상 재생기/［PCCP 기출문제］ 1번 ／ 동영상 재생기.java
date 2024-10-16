class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int second_pos = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));
        int second_start = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        int second_end = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));
        int second_len = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5));
        String answer = "";
        
        for (String command : commands) {

            if (second_start <= second_pos && second_end >= second_pos) second_pos = second_end;

            if (command.equals("prev")) {
                second_pos -= 10;

                if (second_pos < 0) {
                    second_pos = 0;
                }
            } else {
                second_pos += 10;

                if (second_pos > second_len) {
                    second_pos = second_len;
                }
            }
        }

        if (second_start <= second_pos && second_end >= second_pos) second_pos = second_end;

        if (second_pos == 0) return "00:00";

        int minute = second_pos / 60;
        int second = second_pos % 60;

        if (minute < 10) answer += "0" + minute;
        else answer += minute;

        if (second < 10) answer += ":0" + second;
        else answer += ":" + second;
        
        
        return answer;
    }
}