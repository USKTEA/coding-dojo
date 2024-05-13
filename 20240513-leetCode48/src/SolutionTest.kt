import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )
        solution.rotate(matrix)

        val rotated = arrayOf(
            intArrayOf(7, 4, 1),
            intArrayOf(8, 5, 2),
            intArrayOf(9, 6, 3)
        )

        assertArrayEquals(rotated, matrix)
    }

    @Test
    fun test_case_2() {
        val matrix = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )
        solution.rotate(matrix)

        val rotated = arrayOf(
            intArrayOf(3, 1),
            intArrayOf(4, 2)
        )

        assertArrayEquals(rotated, matrix)
    }

    @Test
    fun switch_once() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )

        solution.switch(0, 2, matrix)

        val switched = arrayOf(
            intArrayOf(1, 2, 9),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 3)
        )

        assertArrayEquals(switched, matrix)
    }

    @Test
    fun switch_twice() {
        var matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )

        solution.switch(0, 2, matrix)

        assertArrayEquals(arrayOf(
            intArrayOf(1, 2, 9),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 3)
        ), matrix)

        solution.switch(0, 1, matrix)

        assertArrayEquals(arrayOf(
            intArrayOf(1, 6, 9),
            intArrayOf(4, 5, 2),
            intArrayOf(7, 8, 3)
        ), matrix)

        solution.switch(0, 0, matrix)

        assertArrayEquals(arrayOf(
            intArrayOf(9, 6, 1),
            intArrayOf(4, 5, 2),
            intArrayOf(7, 8, 3)
        ), matrix)

        solution.switch(1, 1, matrix)

        assertArrayEquals(arrayOf(
            intArrayOf(9, 6, 1),
            intArrayOf(4, 5, 2),
            intArrayOf(7, 8, 3)
        ), matrix)

        solution.switch(1, 0, matrix)

        assertArrayEquals(arrayOf(
            intArrayOf(9, 4, 1),
            intArrayOf(6, 5, 2),
            intArrayOf(7, 8, 3)
        ), matrix)

        solution.switch(2, 1, matrix)

        assertArrayEquals(arrayOf(
            intArrayOf(9, 4, 1),
            intArrayOf(8, 5, 2),
            intArrayOf(7, 6, 3)
        ), matrix)

        solution.switch(2, 0, matrix)

        assertArrayEquals(arrayOf(
            intArrayOf(7, 4, 1),
            intArrayOf(8, 5, 2),
            intArrayOf(9, 6, 3)
        ), matrix)
    }
}
