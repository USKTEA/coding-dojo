import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val matrix = arrayListOf(
            arrayListOf(1, 2),
            arrayListOf(3, 4),
        )

        solution.rotate(matrix)

        assertEquals(
            arrayListOf(
                arrayListOf(3, 1),
                arrayListOf(4, 2),
            ), matrix
        )
    }

    @Test
    fun test_case_2() {
        val matrix = arrayListOf(
            arrayListOf(1),
        )

        solution.rotate(matrix)

        assertEquals(
            arrayListOf(
                arrayListOf(1),
            ), matrix
        )
    }

    @Test
    fun test_case_3() {
        val matrix = arrayListOf(
            arrayListOf(1, 2, 3),
            arrayListOf(4, 5, 6),
            arrayListOf(7, 8, 9),
        )

        solution.rotate(matrix)

        assertEquals(
            arrayListOf(
                arrayListOf(7, 4, 1),
                arrayListOf(8, 5, 2),
                arrayListOf(9, 6, 3),
            ), matrix
        )
    }

    @Test
    fun test_case_4() {
        val matrix = arrayListOf(
            arrayListOf(31, 32, 228, 333),
            arrayListOf(79, 197, 241, 246),
            arrayListOf(77, 84, 126, 337),
            arrayListOf(110, 291, 356, 371),
        )

        solution.rotate(matrix)

        assertEquals(
            arrayListOf(
                arrayListOf(110, 77, 79, 31),
                arrayListOf(291, 84, 197, 32),
                arrayListOf(356, 126, 241, 228),
                arrayListOf(371, 337, 246, 333),
            ), matrix
        )
    }
}
