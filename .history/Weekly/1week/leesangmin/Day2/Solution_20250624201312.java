import java.util.*;
import java.util.stream.*;

public class Solution {
    public int solution(int[][] cards) {
        List<List<Integer>> cardList = Arrays.stream(cards)
            .map(row -> Arrays.stream(row)
                .boxed()
                .collect(Collectors.toList()))
            .collect(Collectors.toList());

        List<Integer> mins = cardList.stream()
            .map(row -> row.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE))
            .collect(Collectors.toList());

        return mins.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList()).get(1);
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