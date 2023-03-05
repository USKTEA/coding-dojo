import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void toPhoneNumber() {
        Solution solution = new Solution();

        List<PhoneNumber> phoneNumbers = solution.toPhoneNumber(new String[]{"119", "97674223", "1195524421"});

        assertEquals(List.of(
                new PhoneNumber("119"),
                new PhoneNumber("97674223"),
                new PhoneNumber("1195524421")
        ), phoneNumbers);
    }

    @Test
    void notHavePrefixNumber1() {
        Solution solution = new Solution();

        Boolean result = solution.verifyPrefixNotExists(List.of(
                new PhoneNumber("119"),
                new PhoneNumber("97674223"),
                new PhoneNumber("1195524421"))
        );

        assertFalse(result);
    }

    @Test
    void notHavePrefixNumber2() {
        Solution solution = new Solution();

        boolean result = solution.verifyPrefixNotExists(List.of(
                new PhoneNumber("12"),
                new PhoneNumber("123"),
                new PhoneNumber("1235"),
                new PhoneNumber("567"),
                new PhoneNumber("88"))
        );

        assertFalse(result);
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        boolean answer = solution.solution(new String[]{"11","12","111"});

        assertFalse(answer);
    }
}
