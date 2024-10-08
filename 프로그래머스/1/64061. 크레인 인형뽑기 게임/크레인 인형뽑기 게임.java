import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            for (int i = 0 ; i < board.length ; i++) {
                if (board[i][move - 1] != 0) {
                    if (!stack.empty()) {
                        if (stack.peek() == board[i][move - 1]) {
                            stack.pop();
                            answer += 2;
                            board[i][move - 1] = 0;
                            break;
                        } else {
                            stack.push(board[i][move - 1]);
                            board[i][move - 1] = 0;
                            break;
                        }
                    } else {
                        stack.push(board[i][move - 1]);
                        board[i][move - 1] = 0;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}