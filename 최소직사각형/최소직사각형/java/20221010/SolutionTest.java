import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// 면적의 합은 명함 길이 변의 곱
// 최소 면적은 최소 길이와 최소 길이의 합
// 단 명함은 xy 축을 돌릴 수 있음
// 30 60 60 80
// 30 40 50 70
// 답은 80 x 50 = 4000

// 명함xy 중 가장 긴 변을 구하고
// 모든 명함에서 긴 변을 제외한 나머지 변에 대해 최대를 구해서 곱하면 된다

class SolutionTest {

    @Test
    void longestLength() {
        Solution solution = new Solution();
        int [][] sizes = new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int longestLength = solution.longestLength(sizes);

        assertEquals(80, longestLength);
    }

    @Test
    void lastLongLength() {
        Solution solution = new Solution();
        int [][] sizes = new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int longestLength = solution.longestLength(sizes);

        int lastLongLength = solution.lastLongLength(sizes);

        assertEquals(50, lastLongLength);
    }

    @Test
    void area() {
        Solution solution = new Solution();
        int [][] sizes = new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int longest = solution.longestLength(sizes);
        int lastLongest = solution.lastLongLength(sizes);
        int area = solution.calculateArea(longest, lastLongest);

        assertEquals(4000, area);
    }
}
