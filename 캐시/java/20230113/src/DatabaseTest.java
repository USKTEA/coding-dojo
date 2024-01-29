import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void search() {
        Database database = new Database(3);

        int time1 = database.search(new String[]{"Jeju"}, 0, 0, 0);

        assertEquals(5, time1);

        Database database1 = new Database(3);

        int time2 = database1.search(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork",
                "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}, 0, 0, 0);

        assertEquals(50, time2);
    }
}
