import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void toSortedList() {
        Solution solution = new Solution();
        List<List<String>> list = solution.toSortedList("{{4,2,3},{3},{2,3,4,1},{2,3}}");

        assertEquals(List.of(
                List.of("3"),
                List.of("2", "3"),
                List.of("4", "2", "3"),
                List.of("2", "3", "4", "1")
        ), list) ;

        List<List<String>> list2 = solution.toSortedList("{{20,111},{111}}");



        assertEquals(Arrays.asList(
                List.of("111"), List.of("20", "111")
        ), list2);
    }

    @Test
    void toTuple() {
        Solution solution = new Solution();
        List<List<String>> list = List.of(
                List.of("3"),
                List.of("2", "3"),
                List.of("4", "2", "3"),
                List.of("2", "3", "4", "1")
        );

        int[] tuple = solution.toTuple(list);

        assertArrayEquals(new int[]{3, 2, 4, 1}, tuple);
    }
}
