import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;
        int answer = -1;
        Arrays.sort(mats);

        for (int m = mats.length - 1; m >= 0; m--) {
            boolean place = false;

            for (int i = 0; i <= rows - mats[m]; i++) {
                for (int j = 0; j <= cols - mats[m]; j++) {
                    boolean flag = true;

                    for (int x = i; x < i + mats[m]; x++) {
                        for (int y = j; y < j + mats[m]; y++) {
                            if (!park[x][y].equals("-1")) {
                                flag = false;
                                break;
                            }
                        }
                        if (!flag) break;
                    }
                    if (flag) {
                        place = true;
                        break;
                    }
                }
                if (place) break;
            }
            if (place) {
                answer = mats[m];
                break;
            }
        }
        return answer;
    }
}