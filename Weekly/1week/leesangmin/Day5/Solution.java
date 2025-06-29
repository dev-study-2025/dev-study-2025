import java.util.*;

public class Solution {

    public int solution(int N) {
        int count = 0;
        for(int i = 0; i<=N; i++){
            for(int j = 0; j<=59; j++){

                for(int k = 0; k<=59; k++){
                    String t = String.valueOf(i)+String.valueOf(j)+String.valueOf(k);
                    if(t.contains("3")) count ++;
                }
            }
        }
        return count; 
    }

    public static void main(String[] args) {
       
        int N = 5;
        Solution s = new Solution();
        int answer = s.solution(N);

        // 출력 예시: 11475
        System.out.println(answer);
    }
}
