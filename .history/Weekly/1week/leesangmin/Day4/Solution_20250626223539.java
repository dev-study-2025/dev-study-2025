import java.util.*;

public class Solution {
    // 상하좌우 문제 풀이 함수
    public int[] solution(int n, String[] plans) {
        int x = 1, y = 1;
        for (String plan : plans) {
            int nx = x;
            int ny = y;

            switch (plan) {
                case "L":
                    ny -= 1;
                    break;
                case "R":
                    ny += 1;
                    break;
                case "U":
                    nx -= 1;
                    break;
                case "D":
                    nx += 1;
                    break;
            }
            if (nx >= 1 && nx <= n && ny >= 1 && ny <= n) {
                x = nx;
                y = ny;
            }
        }
        return new int[]{x, y};
    }
    

    public static void main(String[] args) {
        int n = 5;
        String[] plans = {"R", "R", "R", "U", "D", "D"};

        Solution s = new Solution();
        int[] answer = s.solution(n, plans);
        System.out.println(answer[0] + " " + answer[1]); // 3 4
    }
}
