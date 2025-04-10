import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score); // 오름차순 정렬
        int n = score.length;
        int result = 0;

        // 뒤에서부터 m개씩 묶어서 계산
        for (int i = n - m; i >= 0; i -= m) {
            int minScore = score[i];  // 한 박스에서 가장 낮은 점수
            result += minScore * m;
        }

        return result;
    }
}