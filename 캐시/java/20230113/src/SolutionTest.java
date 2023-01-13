import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Solution() {
        Solution solution = new Solution();

        int time1 = solution.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA",
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});

        assertEquals(50, time1);

        int time2 = solution.solution(3, new String[]{"Jeju", "Pangyo", "Seoul",
                "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});

        assertEquals(21, time2);

        int time3 = solution.solution(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork",
                "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});

        assertEquals(60, time3);

        int time4 = solution.solution(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"});

        assertEquals(25, time4);
    }
}
