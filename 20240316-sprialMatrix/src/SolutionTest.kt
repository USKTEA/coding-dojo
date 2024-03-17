import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun simpleMatrix() {
        val matrix = listOf(arrayListOf(1, 2))
        val result = solution.spiralOrder(matrix)

        assertEquals(arrayListOf(1, 2), result)
    }

    @Test
    fun littleSimpleMatrix() {
        val matrix = listOf(arrayListOf(1, 2), arrayListOf(3, 4))
        val result = solution.spiralOrder(matrix)

        assertEquals(arrayListOf(1, 2, 4, 3), result)
    }

    @Test
    fun withComplexMatrix1() {
        val matrix = listOf(arrayListOf(1, 2, 3), arrayListOf(4, 5, 6), arrayListOf(7, 8, 9))
        val result = solution.spiralOrder(matrix)

        assertEquals(arrayListOf(1, 2, 3, 6, 9, 8, 7, 4, 5), result)
    }

    @Test
    fun withComplexMatrix2() {
        val matrix = listOf(arrayListOf(1, 2, 3, 4), arrayListOf(5, 6, 7, 8), arrayListOf(9, 10, 11, 12))
        val result = solution.spiralOrder(matrix)

        assertEquals(arrayListOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), result)
    }

    @Test
    fun stepWithSimpleMatrix1() {
        val result = arrayListOf<Int>()
        val passed = mutableListOf<Position>()
        val matrix = listOf(arrayListOf(1))
        val position = Position(x = 0, y = 0)
        val direction = Direction(x = 1, y = 0)
        val current = 0

        val passedAfterStep = solution.step(matrix, position, direction, passed, result, current)

        assertEquals(arrayListOf(1), passedAfterStep)
    }

    @Test
    fun stepWithSimpleMatrix2() {
        val result = arrayListOf<Int>()
        val passed = mutableListOf<Position>()
        val matrix = listOf(arrayListOf(1, 2))
        val position = Position(x = 0, y = 0)
        val direction = Direction(x = 1, y = 0)
        val current = 0

        val passedAfterStep = solution.step(matrix, position, direction, passed, result, current)

        assertEquals(arrayListOf(1, 2), passedAfterStep)
    }

    @Test
    fun directionChangedStep() {
        val result = arrayListOf<Int>()
        val passed = mutableListOf<Position>()
        val matrix = listOf(arrayListOf(1, 2), arrayListOf(3, 4))
        val position = Position(x = 0, y = 0)
        val direction = Direction(x = 1, y = 0)
        val current = 0

        val passedAfterStep = solution.step(matrix, position, direction, passed, result, current)

        assertEquals(arrayListOf(1, 2, 4, 3), passedAfterStep)
    }

    @Test
    fun isBlocked() {
        val matrix = listOf(arrayListOf(1, 2), arrayListOf(3, 4))
        val emptyPassed = mutableListOf<Position>()

        assertFalse(solution.isBlocked(matrix = matrix, passed = emptyPassed, x = 1, y = 0))
        assertTrue(solution.isBlocked(matrix = matrix, passed = emptyPassed, x = 2, y = 0))
        assertFalse(solution.isBlocked(matrix = matrix, passed = emptyPassed, x = 1, y = 1))
        assertTrue(solution.isBlocked(matrix = matrix, passed = emptyPassed, x = 1, y = 2))

        val passed = mutableListOf(Position(0, 0))

        assertTrue(solution.isBlocked(matrix = matrix, passed = passed, x = 0, y = 0))
    }
}
