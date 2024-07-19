import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun asteroidCollision() {
        val result = solution.asteroidCollision(intArrayOf(5, 10, -5))


        assertArrayEquals(
            intArrayOf(5, 10), result
        )
    }

    @Test
    fun asteroidCollision_1() {
        val result = solution.asteroidCollision(intArrayOf(8, -8))

        assertArrayEquals(
            intArrayOf(), result
        )
    }

    @Test
    fun asteroidCollision_2() {
        val result = solution.asteroidCollision(intArrayOf(10, 2, -5))
        println(result.toList())
        assertArrayEquals(
            intArrayOf(10), result
        )
    }

    @Test
    fun asteroidCollision_3() {
        val result = solution.asteroidCollision(intArrayOf(-2, -1, 1, 2))

        assertArrayEquals(
            intArrayOf(-2, -1, 1, 2), result
        )
    }

    @Test
    fun asteroidCollision_4() {
        val result = solution.asteroidCollision(intArrayOf(-2, -2, 1, -2))

        println(result.toList())
        assertArrayEquals(
            intArrayOf(-2, -2, -2), result
        )
    }

    @Test
    fun asteroidCollision_5() {
        val result = solution.asteroidCollision(intArrayOf(-2, 2, 1, -2))

        println(result.toList())
        assertArrayEquals(
            intArrayOf(-2), result
        )
    }
}
