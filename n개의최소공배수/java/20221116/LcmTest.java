import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LcmTest {

    @Test
    void factoring() {
        Lcm lcm = new Lcm(new PrimeChecker(), new HashMap<>());

        HashMap<Integer, Integer> map = new HashMap<>();

        HashMap result = lcm.factoring(4, 2, map);

        HashMap<Integer, Integer> answer = new HashMap<>();
        answer.put(2, 2);

        assertEquals(answer, result);

        HashMap<Integer, Integer> map2 = new HashMap<>();

        HashMap result2 = lcm.factoring(10, 2, map2);

        HashMap<Integer, Integer> answer2 = new HashMap<>();
        answer2.put(2, 1);
        answer2.put(5, 1);

        assertEquals(answer2, result2);

        HashMap<Integer, Integer> map3 = new HashMap<>();

        HashMap result3 = lcm.factoring(18, 2, map3);

        HashMap<Integer, Integer> answer3 = new HashMap<>();
        answer3.put(2, 1);
        answer3.put(3, 2);

        assertEquals(answer3, result3);

        HashMap<Integer, Integer> map4 = new HashMap<>();

        HashMap result4 = lcm.factoring(50, 2, map4);

        HashMap<Integer, Integer> answer4 = new HashMap<>();
        answer4.put(2, 1);
        answer4.put(5, 2);

        assertEquals(answer4, result4);
    }

    @Test
    void sumDisjoint() {
        Map<Integer, Integer> result = new HashMap<>();

        Lcm lcm = new Lcm(new PrimeChecker(), result);

        HashMap<Integer, Integer> map1 = new HashMap<>();
        map1.put(2, 1);
        map1.put(5, 2);

        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(2, 1);
        map2.put(3, 2);

        HashMap<Integer, Integer> map3 = new HashMap<>();
        map2.put(2, 2);
        map2.put(3, 2);

        lcm.disjoint(map1);
        lcm.disjoint(map2);

        Map<Integer, Integer> contrast = new HashMap<>();
        contrast.put(2, 2);
        contrast.put(3, 2);
        contrast.put(5, 2);

        lcm.disjoint(map3);

        assertEquals(contrast, result);
    }

    @Test
    void calculate() {
        Lcm lcm = new Lcm(new PrimeChecker(), new HashMap<>());

        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 3);
        map.put(3, 2);

        int answer = lcm.calculate(map);

        assertEquals(72, answer);
    }
}
