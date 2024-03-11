import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

private val DELETED = 51

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenArrayIsEmpty() {
        val inputArray = intArrayOf()
        val result = solution.removeElement(inputArray, 1)

        assertEquals(0, result)
        assertArrayEquals(intArrayOf(), inputArray)
    }

    @Test
    fun simpleCase() {
        val inputArray = intArrayOf(1)
        val result = solution.removeElement(inputArray, 1)

        assertEquals(1, result)
        assertArrayEquals(intArrayOf(DELETED), inputArray)
    }

    @Test
    fun notSimpleTest() {
        val inputArray = intArrayOf(3, 2, 2, 3)
        val result = solution.removeElement(inputArray, 3)

        assertEquals(2, result)
        assertArrayEquals(intArrayOf(2, 2, DELETED, DELETED), inputArray)
    }

    @Test
    fun notSimpleTest2() {
        val inputArray = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val result = solution.removeElement(inputArray, 2)

        assertEquals(5, result)
        assertArrayEquals(intArrayOf(0, 0, 1, 3, 4, DELETED, DELETED, DELETED), inputArray)
    }
}
