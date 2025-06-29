import java.util.*;

public class Solution {

    public int countTimeWithThree(int N) {
        int count = 0;
        for(int i = 0; i<N; i++){
            if(String.valueOf(i).contains("3")) count++;
            for(int j = 0; j<=59; j++){
                if(String.valueOf(j).contains("3")) count++;

                for(int k = 0; k<=59; k++){
                    if(String.valueOf(k).contains("3")) count++;

                }
            }
        }
        return count; // 일단 0 반환 (구현 후 수정)
    }

    public static void main(String[] args) {
       
        int N = 5;
        Solution s = new Solution();
        int answer = s.countTimeWithThree(N);

        // 출력 예시: 11475
        System.out.println(answer);
    }
}
