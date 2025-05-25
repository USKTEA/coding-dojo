import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun nearestHotel() {
        val hotelMap = arrayListOf(
            arrayListOf(0, 0),
            arrayListOf(1, 0),
        )

        val positions = arrayListOf(
            arrayListOf(1, 1),
            arrayListOf(2, 1),
            arrayListOf(1, 2),
        )

        val result = solution.nearestHotel(hotelMap, positions)

        assertEquals(arrayListOf(1, 0, 2), result)
    }

    @Test
    fun nearestHotel_2() {
        val hotelMap = arrayListOf(
            arrayListOf(1, 0, 0, 1),
        )

        val positions = arrayListOf(
            arrayListOf(1, 2),
            arrayListOf(1, 3),
        )

        val result = solution.nearestHotel(hotelMap, positions)

        assertEquals(arrayListOf(1, 1), result)
    }

    @Test
    fun simpleCase() {
        val hotelMap = arrayListOf(
            arrayListOf(0, 0),
            arrayListOf(1, 0),
        )

        val positions = arrayListOf(
            arrayListOf(1, 1),
        )

        val result = solution.nearestHotel(hotelMap, positions)

        assertEquals(arrayListOf(1), result)
    }
}
