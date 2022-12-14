import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void toChars() {
        Solution solution = new Solution();
        String[] strings = solution.toStrings("3people Unfollowed Me");

        assertArrayEquals(
                new String[]{"3", "p", "e","o","p","l","e"," ","U","n","f","o","l","l","o","w","e","d"," ","M","e"},
                strings);
    }

    @Test
    void toJadenCase() {
        Solution solution = new Solution();

        String jadens1 = solution.toJaden(new String[]{"3", "p", "e","o", " ", "p","l","e"});

        assertEquals("3peo Ple", jadens1);

        String jadens2 = solution.toJaden(new String[]{"3", "p", "e","o","p","l","e"," ","U","n","f","o","l","l","o","w","e","d"," ","M","e"});

        assertEquals("3people Unfollowed Me", jadens2);
    }

    @Test
    void solution() {
        Solution solutions = new Solution();
        String answer1 = solutions.solution("for the last week");

        assertEquals("For The Last Week", answer1);
    }
}
