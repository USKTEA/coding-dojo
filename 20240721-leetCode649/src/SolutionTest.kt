import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun predictPartyVictory() {
        val result = solution.predictPartyVictory("RD")

        assertEquals("Radiant", result)
    }

    @Test
    fun predictPartyVictory_2() {
        val result = solution.predictPartyVictory("RDD")

        assertEquals("Dire", result)
    }

    @Test
    fun countSenatorParties() {
        val result = solution.countSenatorParties("RD")

        assertEquals(Pair(1, 1), result)
    }

    @Test
    fun countSenatorParties_2() {
        val result = solution.countSenatorParties("RRD")

        assertEquals(Pair(2, 1), result)
    }

    @Test
    fun countSenatorParties_3() {
        val result = solution.countSenatorParties("RRDD")

        assertEquals(Pair(2, 2), result)
    }
}
