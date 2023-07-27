import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val answer = solution.solution("banana")

        assertArrayEquals(intArrayOf(-1, -1, -1, 2, 2, 2), answer)
    }

    @Test
    fun `when record not have`() {
        val record = Record()
        val result = record.have('b')

        assertEquals(false, result)
    }

    @Test
    fun `when record have`() {
        val record = Record(
            lookup = mutableMapOf('b' to 0)
        )

        val result = record.have('b')

        assertEquals(true, result)
    }

    @Test
    fun lookup() {
        val record = Record(
            lookup = mutableMapOf('b' to 0),
            differences = mutableListOf(-1)
        )

        val result = record.lookUp('b')

        assertEquals(0, result)
    }
}
