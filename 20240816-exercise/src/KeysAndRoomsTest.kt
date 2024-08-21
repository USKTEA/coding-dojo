import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class KeysAndRoomsTest {
    private val keysAndRooms = KeysAndRooms()

    @Test
    fun canVisitAllRooms() {
        val result = keysAndRooms.canVisitAllRooms(
            listOf(
                listOf(1),
                listOf(2),
                listOf(3),
                emptyList()
            )
        )

        assertTrue(result)
    }

    @Test
    fun canVisitAllRooms_2() {
        val result = keysAndRooms.canVisitAllRooms(
            listOf(
                listOf(1, 3, 2),
                listOf(2, 3),
                listOf(2, 3, 1),
                emptyList()
            )
        )

        assertTrue(result)
    }
}
