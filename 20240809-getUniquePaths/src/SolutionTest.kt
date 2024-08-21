import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun uniquePaths() {
        val result = solution.uniquePaths(2, 2)

        assertEquals(2, result)
    }

    @Test
    fun uniquePaths_2() {
        val result = solution.uniquePaths(3, 3)

        assertEquals(6, result)
    }

    @Test
    fun uniquePaths_3() {
        val result = solution.uniquePaths(4, 4)

        assertEquals(20, result)
    }

    @Test
    fun uniquePaths_4() {
        val result = solution.uniquePaths(100, 1)

        assertEquals(1, result)
    }

    @Test
    fun toMatrix() {
        val matrix = solution.toMatrix(2, 2)

        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(1, 1),
            ), matrix
        )
    }

    @Test
    fun end() {
        val end = solution.end(2, 2)

        assertEquals(
            Pair(1, 1),
            end
        )
    }

    @Test
    fun factorial() {
        val result = solution.factorial.elementAt(3)
        println(result)
    }
}
