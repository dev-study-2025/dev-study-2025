import java.util.*;
import java.util.stream.*;

public class Solution {
    public int solution(int[][] cards) {
        Set<Integer> mins = new HashSet<>();
        for (int[] row : cards) {
            int min = Arrays.stream(row).min().orElse(Integer.MAX_VALUE);
            mins.add(min);
        }
    
        List<Integer> sorted = new ArrayList<>(mins);
        sorted.sort(Comparator.reverseOrder());
    
        if (sorted.size() < 2) {
            throw new IllegalArgumentException("두 번째로 큰 값이 존재하지 않습니다.");
        }
    
        return sorted.get(1);
    }

    public static void main(String[] args) {
        int[][] cards = {
            {3, 1, 2},
            {4, 1, 4},
            {2, 2, 2}
        };
        Solution s = new Solution();
        System.out.println(s.solution(cards));
    } 
}