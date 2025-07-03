import java.util.*;

public class Solution {
    public int solution(int[][] tray) {
        int count = 0;
        for (int i = 0; i < tray.length; i++) {
            for (int j = 0; j < tray[0].length; j++) {
                if (dfs(tray, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }


    public boolean dfs(int[][] tray, int x, int y) {
        if (x < 0 || x >= tray.length || y < 0 || y >= tray[0].length) {
            return false;
        }

        if (tray[x][y] == 0) {
            tray[x][y] = 1; //들르면 방문한거         
            dfs(tray, x - 1, y);
            dfs(tray, x + 1, y);
            dfs(tray, x, y - 1);
            dfs(tray, x, y + 1);

            return true;
        }

        return false; 
    }

    public static void main(String[] args) {
        int[][] tray = {
            {0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0}
        };

        Solution s = new Solution();
        System.out.println(s.solution(tray));  // 출력: 3
    }
}
