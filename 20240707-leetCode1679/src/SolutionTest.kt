import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxOperations() {
        val result = solution.maxOperations(intArrayOf(1, 1), 2)

        assertEquals(1, result)
    }

    @Test
    fun maxOperations_2() {
        val result = solution.maxOperations(intArrayOf(3, 5, 1, 5), 2)

        assertEquals(0, result)
    }

    @Test
    fun maxOperations_3() {
        val result = solution.maxOperations(intArrayOf(4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4), 2)

        assertEquals(2, result)
    }

    @Test
    fun countOccurrences() {
        val occurrences = solution.count(intArrayOf(1, 1))

        assertEquals(
            mutableMapOf(1 to 2), occurrences
        )
    }

    @Test
    fun countOccurrences_2() {
        val occurrences = solution.count(intArrayOf(3, 5, 1, 5))

        assertEquals(
            mutableMapOf(
                3 to 1,
                5 to 2,
                1 to 1
            ),
            occurrences
        )
    }

    @Test
    fun countPair() {
        val pairCounts = solution.countPair(mutableMapOf(1 to 2), 2)

        assertEquals(1, pairCounts)
    }

    @Test
    fun countPair_2() {
        val pairCounts = solution.countPair(mutableMapOf(1 to 1, 2 to 1, 3 to 1, 4 to 1), 5)

        assertEquals(2, pairCounts)
    }

    @Test
    fun countPair_3() {
        val pairCounts = solution.countPair(mutableMapOf(3 to 1, 5 to 2, 1 to 1), 2)

        assertEquals(0, pairCounts)
    }
}
