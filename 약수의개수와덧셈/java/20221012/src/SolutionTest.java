import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 배열 생성
// 배열 요소의 소수 갯수 구함
// 짝수면 더하고 홀수면 빼서
// 값 반환
class SolutionTest {

    @Test
    void makeArray() {
        Solution solution = new Solution();
        List<Integer> numbers = solution.makeArray(13, 17);

        assertEquals(List.of(13, 14, 15, 16, 17), numbers);
    }

    @Test
    void sum() {
        Solution solution = new Solution();
        int sum = solution.sum(List.of(13, 14, 15, 16, 17));

        assertEquals(43, sum);
    }

    @Test
    void countOdd() {
        Solution solution = new Solution();

        int counts = solution.countOdd(13);
        int counts1 = solution.countOdd(15);
        int counts2 = solution.countOdd(24);

        assertEquals(2, counts);
        assertEquals(4, counts1);
        assertEquals(8, counts2);
    }
}
