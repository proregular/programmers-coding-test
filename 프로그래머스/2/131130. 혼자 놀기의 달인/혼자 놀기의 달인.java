import java.util.*;

class Solution {
    public int solution(int[] cards) {
        boolean[] visited = new boolean[cards.length];
        List<Integer> cycleSizes = new ArrayList<>();

        for (int i = 0; i < cards.length; i++) {
            if (!visited[i]) {
                int count = 0;
                int current = i;

                while (!visited[current]) {
                    visited[current] = true;
                    current = cards[current] - 1; // 카드 번호는 1부터니까 인덱스 맞춰줌
                    count++;
                }

                cycleSizes.add(count);
            }
        }

        if (cycleSizes.size() < 2) {
            return 0;
        }

        // 내림차순 정렬 후 가장 큰 두 값 곱하기
        Collections.sort(cycleSizes, Collections.reverseOrder());
        return cycleSizes.get(0) * cycleSizes.get(1);
    }
}