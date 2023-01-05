package algorithm05;

public class test01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5,3,2));
    }
}


class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j*j == i) count += 1;
                else if (i % j == 0) count += 2;
            }
            if (count > limit) answer += power;
            else answer += count;
        }
        return answer;
    }
}