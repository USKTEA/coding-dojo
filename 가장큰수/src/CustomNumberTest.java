import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomNumberTest {
    @Test
    void whenDigitsIsOne() {
        CustomNumber one = new CustomNumber(1);
        CustomNumber two = new CustomNumber(2);

        List<CustomNumber> numbers = new ArrayList<>();
        numbers.add(one);
        numbers.add(two);

        Collections.sort(numbers);

        assertEquals(numbers.get(0), two);
        assertEquals(numbers.get(1), one);
    }

    @Test
    void whenDigitsNotEquals() {
        CustomNumber eleven = new CustomNumber(11);
        CustomNumber two = new CustomNumber(2);

        List<CustomNumber> numbers = new ArrayList<>();
        numbers.add(eleven);
        numbers.add(two);

        Collections.sort(numbers);

        assertEquals(numbers.get(0), two);
        assertEquals(numbers.get(1), eleven);
    }

    @Test
    void whenDigitsIsMoreThanOne() {
        CustomNumber thirtyThree = new CustomNumber(33);
        CustomNumber thirtyFour = new CustomNumber(34);

        List<CustomNumber> numbers = new ArrayList<>();
        numbers.add(thirtyThree);
        numbers.add(thirtyFour);

        Collections.sort(numbers);

        assertEquals(numbers.get(0), thirtyFour);
        assertEquals(numbers.get(1), thirtyThree);
    }
}
