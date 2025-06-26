import java.util.*;

public class Solution {
    public int solution(int n, int k) {
        int count = 0;
        int origin = n;
        int div = k;

        for(; origin/div<div ;count++){
            origin = origin / div;
            
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
