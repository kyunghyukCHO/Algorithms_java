package algorithm03;

import java.util.PriorityQueue;

public class test01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] ans = solution.solution(k, score);
    }
}

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int minScore = score[0];
        answer[0] = minScore;
        pq.add(answer[0]);
        for (int i = 1; i < score.length; i++) {
            if (i <= k-1) {
                pq.add(score[i]);
                if (score[i] < minScore) {
                    minScore = score[i];
                    answer[i] = minScore;
                }
                else {
                    answer[i] = minScore;
                }
            }
            else {
                int trash = pq.poll();
                pq.add(score[i]);
                if (score[i] < trash) {
                    answer[i] = trash;
                    pq.add(trash);
                    pq.poll();
                }
                else {
                    answer[i] = pq.poll();
                    pq.add(answer[i]);
                }
            }
        }
        return answer;
    }
}