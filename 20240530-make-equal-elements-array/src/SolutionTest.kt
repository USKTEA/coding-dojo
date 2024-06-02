import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.solve(arrayListOf(2, 3, 1), 1)

        assertEquals(1, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.solve(arrayListOf(2, 3, 1), 2)

        assertEquals(0, result)
    }

    @Test
    fun test_case_3() {
        val result = solution.solve(arrayListOf(1, 3, 5), 2)

        assertEquals(1, result)
    }

    @Test
    fun test_case_4() {
        val result = solution.solve(arrayListOf(1, 3, 5), 1)

        assertEquals(0, result)
    }

    @Test
    fun get_middle_1() {
        val middle = solution.getMiddleNumber(listOf(1, 2, 3))

        assertEquals(2, middle)
    }

    @Test
    fun get_middle_2() {
        val middle = solution.getMiddleNumber(listOf(1, 2, 3, 4))

        assertEquals(2, middle)
    }

    @Test
    fun get_middle_3() {
        val middle = solution.getMiddleNumber(listOf(1))

        assertEquals(1, middle)
    }
}
