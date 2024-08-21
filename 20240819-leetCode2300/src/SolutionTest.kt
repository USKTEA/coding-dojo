import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun successfulPairs() {
        val result = solution.successfulPairs(
            spells = intArrayOf(5, 1, 3),
            potions = intArrayOf(1, 2, 3, 4, 5),
            success = 7
        )

        assertArrayEquals(
            intArrayOf(4, 0, 3), result
        )
    }

    @Test
    fun findPairs_1() {
        val pairs = solution.findPairs(
            spell = 5,
            sortedPotions =  listOf(1, 2, 3, 4, 5),
            success =  7,
            start =  0,
            end =  4,
        )

        assertEquals(4, pairs)
    }

    @Test
    fun findPairs_2() {
        val pairs = solution.findPairs(
            spell = 1,
            sortedPotions =  listOf(1, 2, 3, 4, 5),
            success =  7,
            start =  0,
            end =  4,
        )

        assertEquals(0, pairs)
    }

    @Test
    fun findPairs_3() {
        val pairs = solution.findPairs(
            spell = 3,
            sortedPotions =  listOf(1, 2, 3, 4, 5),
            success =  7,
            start =  0,
            end =  4,
        )

        assertEquals(3, pairs)
    }
}
