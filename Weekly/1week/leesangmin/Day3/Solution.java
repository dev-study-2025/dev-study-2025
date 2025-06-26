import java.util.*;

public class Solution {
    public int solution(int n, int k) {
        int count = 0;
       
        for (; n > 1; count++) {
            if (n % k == 0) {
                n /= k;
            } else {
                n -= 1;
            }
        }
        return count ; 
    }

    public static void main(String[] args) {
        int n = 25;
        int k = 5;


        Solution s = new Solution();
        int answer = s.solution(n, k);
        System.out.println(answer);
    }
}
