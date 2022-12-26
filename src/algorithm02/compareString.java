package algorithm02;

public class compareString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("4", "7"));
    }
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        Long pInt = Long.parseLong(p);

        for(int i = 0; i <= tLength-pLength; i ++) {
            String str = t.substring(i,i+pLength);
            Long strInt = Long.parseLong(str);
            if (strInt<=pInt) {
                answer +=1 ;
            }
        }
        return answer;
    }
}