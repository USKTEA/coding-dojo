import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();

        int answer = solution.solution("FRANCE", "FRENCH");

        assertEquals(16384, answer);

        int answer1 = solution.solution("aa1+aa2", "AAAA12");

        assertEquals(43690, answer1);

        int answer2 = solution.solution("E=M*C^2", "e=m*c^2");

        assertEquals(65536, answer2);

        int answer3 = solution.solution("handshake", "shake hands");

        assertEquals(65536, answer3);

        int answer4 = solution.solution("ABDDD", "DDEFGHH");

        assertEquals(7281, answer4);
    }
}
