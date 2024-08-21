import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RotatedArrayTest {
    private val rotatedArray = RotatedArray()

    @Test
    fun findMin() {
        val min = rotatedArray.findMin(
            listOf(
                4, 5, 6, 7, 1, 2
            )
        )

        assertEquals(1, min)
    }

    @Test
    fun findMin_2() {
        val min = rotatedArray.findMin(
            listOf(
                3, 1, 2
            )
        )

        assertEquals(1, min)
    }
}
