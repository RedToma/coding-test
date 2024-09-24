class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int total_len = Integer.parseInt(video_len.split(":")[0]) * 60
                + Integer.parseInt(video_len.split(":")[1]);
        int pos_second  = Integer.parseInt(pos.split(":")[0]) * 60
                + Integer.parseInt(pos.split(":")[1]);
        int start_second  = Integer.parseInt(op_start.split(":")[0]) * 60
                + Integer.parseInt(op_start.split(":")[1]);
        int end_second  = Integer.parseInt(op_end.split(":")[0]) * 60
                + Integer.parseInt(op_end.split(":")[1]);

        if (pos_second >= start_second && pos_second <= end_second) pos_second = end_second;

        for (String command : commands) {
            if (command.equals("next")) {
                pos_second += 10;
                if (total_len - pos_second < 0) {
                    pos_second = total_len;
                }
            } else {
                pos_second -= 10;
                if (pos_second < 0) pos_second = 0;
            }

            if (pos_second >= start_second && pos_second <= end_second) pos_second = end_second;
        }

        answer = String.format("%02d:%02d", pos_second / 60, pos_second % 60);
        
        return answer;
    }
}