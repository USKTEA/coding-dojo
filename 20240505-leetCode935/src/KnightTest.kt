import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class KnightTest {
    @Test
    fun move_1() {
        val knight = Knight(
            currentNumber = 1, numbers = mutableListOf("1")
        )

        knight.move(1)
        assertEquals(mutableListOf("1"), knight.numbers)
    }

    @Test
    fun move_2() {
        val knight = Knight(
            currentNumber = 1, numbers = mutableListOf("1")
        )

        knight.move(2)
        assertEquals(mutableListOf("16", "18"), knight.numbers)
    }
}
