import java.util.*;

public class Solution {
    public int solution(int n, int k) {
        int count = 0;
        int origin = n;
        int div = k;

        for(int i = 0; origin/div>2; i++){
            origin = origin / div;
            count++;
        }
        return origin + 1 + count ; 
    }

    public static void main(String[] args) {
        int n = 27;
        int k = 5;


        Solution s = new Solution();
        int answer = s.solution(n, k);
        System.out.println(answer);
    }
}
