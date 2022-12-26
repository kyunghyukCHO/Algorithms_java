package algorithm01;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class cutString {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.solution("a"));
        // aaba
        // aaabcdaa
        // a
        // banana
        // abracadabra
    }
}

class Solution {
    public int solution(String s) {

        ArrayList<Character> list = new ArrayList<>();
        IntStream.range(0, s.length()).forEach(i -> {
            char currentCharacter = s.charAt(i);
            list.add(currentCharacter);
        });
        int answer = 0;
        int same = 1;
        int diff = 0;
        char startChar = list.get(0);

        // For 문을 0부터 계산할껄... ㅉㅉ.... 경혁아 아이고.... 병신아 ㅜㅜ..
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == startChar) {
                same += 1;
            } else {
                diff += 1;
            }
            if (same == diff) {
                answer += 1;
                same = 0;
                diff = 0;
                if (i < list.size() - 1) {
                    startChar = list.get(i + 1);
                }
            }
            if (i == (list.size() - 1) && same != diff) {
                answer += 1;
            }
        }

        if (list.size()==1) {
            answer = 1;
        }

        return answer;
    }
}