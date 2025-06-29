import java.util.*;

public class Solution {

    public int solution(int N) {
        int count = 0;
        while(N > 0){
            if(N % 500 == 0){
                count++;  
                N = N -500;
                continue;
            } 
            else if(N % 100 == 0) {
                count++;
                N = N -100;
                continue;
            } else if (N % 50 == 0){
                count++;
                N = N -50;
                continue;
            } else{
                count++;
                N = N -10;
                continue;
            }
        }
        
        return count; 
    }

    public static void main(String[] args) {
       
        int N = 1260;
        Solution s = new Solution();
        int answer = s.solution(N);

        // 출력 예시: 11475
        System.out.println(answer);
    }
}
