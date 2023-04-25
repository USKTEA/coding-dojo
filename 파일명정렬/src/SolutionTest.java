import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        String[] answer = solution.solution(new String[]{"img000012345", "img1.png","img2","IMG02"});

        assertArrayEquals(new String[]{"img1.png", "img2", "IMG02", "img000012345"}, answer);
    }

    @Test
    void toFiles() {
        Solution solution = new Solution();
        List<File> files = solution.toFiles(new String[]{"img12.png"});

        assertEquals(List.of(new File("img", "12", ".png")), files);
    }
}
