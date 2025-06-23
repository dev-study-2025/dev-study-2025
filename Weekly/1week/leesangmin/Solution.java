import java.util.*;
import java.util.stream.*;

public class Solution {
    public int solution(int[] nums, int m, int k) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());    
        int first = list.get(0);  
        int second = list.get(1);

        int count = (m / (k + 1)) * k + (m % (k + 1));
        return count * first + (m - count) * second;

    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 4, 6};
        int m = 8, k = 3;
        Solution s = new Solution();
        int result = s.solution(nums, m, k);
        System.out.println(result); 
    } 
}