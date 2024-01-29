import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution1() {
        Solution solution = new Solution();
        int result = solution.solution("aabbaccc");

        assertEquals(7, result);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int result = solution.solution("ababcdcdababcdcd");

        assertEquals(9, result);
    }

    @Test
    void solution3() {
        Solution solution = new Solution();
        int result = solution.solution("abcabcdede");

        assertEquals(8, result);
    }

    @Test
    void solution4() {
        Solution solution = new Solution();
        int result = solution.solution("abcabcabcabcdededededede");

        assertEquals(14, result);
    }

    @Test
    void solution5() {
        Solution solution = new Solution();
        int result = solution.solution("a");

        assertEquals(1, result);
    }

    @Test
    void sliceBy1() {
        Solution solution = new Solution();

        List<String> sliced = solution.slice("aabbaccc", 1);

        assertEquals(List.of("a", "a", "b", "b", "a", "c", "c", "c"), sliced);
    }

    @Test
    void sliceBy2() {
        Solution solution = new Solution();
        List<String> sliced = solution.slice("aabbaccc", 2);

        assertEquals(List.of("aa", "bb", "ac", "cc"), sliced);
        ;
    }

    @Test
    void sliceBy3() {
        Solution solution = new Solution();
        List<String> sliced = solution.slice("aabbaccc", 3);

        assertEquals(List.of("aab", "bac", "cc"), sliced);
    }

    @Test
    void zip() {
        Solution solution = new Solution();
        String zipped = solution.zip(List.of("a", "a", "b", "b", "a", "c", "c", "c"));

        assertEquals("2a2ba3c", zipped);
    }
}
