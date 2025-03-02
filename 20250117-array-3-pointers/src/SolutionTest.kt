import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun minimize() {
        val result = solution.minimize(arrayListOf(1, 4, 10), arrayListOf(2, 15, 20), arrayListOf(10, 12))

        assertEquals(5, result)
    }

    @Test
    fun minimize_simple() {
        val result = solution.minimize(arrayListOf(1), arrayListOf(2), arrayListOf(3))

        assertEquals(2, result)
    }

    @Test
    fun minimize_simple_2() {
        val result = solution.minimize(arrayListOf(1, 2), arrayListOf(2), arrayListOf(3))

        assertEquals(1, result)
    }

    @Test
    fun minimize_same_size() {
        val result = solution.minimize(arrayListOf(1, 1), arrayListOf(2, 2), arrayListOf(3, 3))

        assertEquals(2, result)
    }

    @Test
    fun minimize_same_size_with_different_value() {
        val result = solution.minimize(arrayListOf(1, 2), arrayListOf(3), arrayListOf(4))

        assertEquals(2, result)
    }

    @Test
    fun minimize_same_size_with_different_values() {
        val result = solution.minimize(arrayListOf(1, 2), arrayListOf(2, 4), arrayListOf(4, 5))

        assertEquals(2, result)
    }

    @Test
    fun minimize_2() {
        val result = solution.minimize_2(arrayListOf(1, 2), arrayListOf(2, 4), arrayListOf(4, 5))

        assertEquals(3, result)
    }
}
