import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TupleBuilderTest {

    @Test
    void build() {
        List<List<String>> list = List.of(
                List.of("3"),
                List.of("2", "3"),
                List.of("4", "2", "3"),
                List.of("2", "3", "4", "1")
        );

        int[] tuple = TupleBuilder.build(list);

        assertArrayEquals(new int[] {3, 2, 4, 1}, tuple);
    }
}
