import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommandTest {

    @Test
    void creation() {
        Command command = new Command(1, 1, 1);

        assertNotNull(command);
    }

    @Test
    void slice() {
        Command command = new Command(2, 5, 3);
        Numbers numbers = new Numbers(new int[]{1, 5, 2, 6, 3, 7, 4});
        Numbers slicedNumbers = command.slice(numbers);

        assertEquals(new Numbers(new int[]{5, 2, 6, 3}), slicedNumbers.getNumbers());
    }

    @Test
    void pick() {
        Command command1 = new Command(2, 5, 3);

        Numbers numbers1 = new Numbers(new int[]{5, 2, 6, 3});

        int pickedNumber1 = command1.pick(numbers1);

        assertEquals(5, pickedNumber1);

        Command command2 = new Command(4, 4, 1);

        Numbers numbers2 = new Numbers(new int[]{6});

        int pickedNumber2 = command2.pick(numbers2);

        assertEquals(6, pickedNumber2);
    }

    @Test
    void equality() {
        Command command1 = new Command(2, 5, 3);
        Command command2 = new Command(2, 5, 3);

        assertEquals(command1, command2);
    }
}
