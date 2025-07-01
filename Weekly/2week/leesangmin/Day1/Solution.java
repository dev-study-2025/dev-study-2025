import java.util.*;

public class Solution {

    public int solution(String s) {
        int x = Integer.parseInt(s.split("")[0]) - 96;  //아스키코드로 바꿔서 1부터 8로로
        int y = Integer.parseInt(s.split("")[1]);

        int[][] steps = {{2,1}, {2,-1}, {-2,1}, {-2,-1}, {1,2}, {1,-2}, {-1,2}, {-1,-2}};   
        int count = 0;
        for(int[] step : steps){
            int nx = x + step[0];
            int ny = y + step[1];
            if(nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       String s = "a1";
       Solution sol = new Solution();
       int answer = sol.solution(s);
       System.out.println(answer);
    }
}
