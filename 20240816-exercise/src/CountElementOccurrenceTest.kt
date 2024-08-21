import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountElementOccurrenceTest {
    private val solution = CountElementOccurrence()

    @Test
    fun findCount() {
        val result = solution.findCount(listOf(5, 7, 7, 8, 8, 10), 7)

        assertEquals(2, result)
    }
}
