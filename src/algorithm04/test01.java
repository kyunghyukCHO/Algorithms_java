package algorithm04;

import java.util.*;

public class test01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}


class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] reversedScore = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(reversedScore, Comparator.reverseOrder());
        if (m > score.length) {
            answer = 0;
        } else {
            answer += reversedScore[m - 1] * m;
            int orders = (reversedScore.length-m)/m;
            int start = m;
            for (int i = 0; i < orders; i++) {
                answer += reversedScore[start+m-1] * m;
                start += m;
            }
        }
        return answer;
    }
}