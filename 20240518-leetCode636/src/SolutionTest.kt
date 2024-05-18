import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.exclusiveTime(
            2,
            listOf("0:start:0", "1:start:2", "1:end:5", "0:end:6")
        )

        assertArrayEquals(intArrayOf(3, 4), result)
    }

    @Test
    fun test_case_2() {
        val result = solution.exclusiveTime(
            1,
            listOf("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7")
        )

        assertArrayEquals(intArrayOf(8), result)
    }

    @Test
    fun parse() {
        val log = solution.parse("0:start:0")

        assertEquals(
            Log(
                functionId = 0,
                type = "start",
                timeStamp = 0
            ), log
        )
    }
}
