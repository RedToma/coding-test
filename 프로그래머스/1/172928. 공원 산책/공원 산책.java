class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int H = park.length;
        int W = park[0].length();
        int before_H = 0;
        int before_W = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] split = routes[i].split(" ");
            String route = split[0];
            int distance = Integer.parseInt(split[1]);
            before_H = answer[0];
            before_W = answer[1];

            for (int j = 0; j < distance; j++) {
                if (route.equals("N")) {
                    if (0 <= answer[0] - 1 && (park[answer[0] - 1].charAt(answer[1]) != 'X')) {
                        answer[0]--;
                    } else {
                        answer[0] = before_H;
                        break;
                    }
                } else if (route.equals("S")) {
                    if (H > answer[0] + 1 && (park[answer[0]+1].charAt(answer[1]) != 'X')) {
                        answer[0]++;
                    } else {
                        answer[0] = before_H;
                        break;
                    }
                } else if (route.equals("W")) {
                    if (0 <= answer[1] - 1 && (park[answer[0]].charAt(answer[1]-1) != 'X')) {
                        answer[1]--;
                    } else {
                        answer[1] = before_W;
                        break;
                    }
                } else if (route.equals("E")) {
                    if (W > answer[1] + 1 && (park[answer[0]].charAt(answer[1]+1) != 'X')) {
                        answer[1]++;
                    } else {
                        answer[1] = before_W;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}