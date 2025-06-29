public class 개선된Solution {
    public int solution(int N) {
        int count = 0;
        int coins[] = {500, 100, 50, 10};
        for(int coin: coins) {
            count = count + N / coin;
            N = N%coin;
        }
        
        return count; 
    }

    public static void main(String[] args) {
       
        int N = 1260;
        개선된Solution s = new 개선된Solution();
        int answer = s.solution(N);

        // 출력 예시: 11475
        System.out.println(answer);
    }
}
