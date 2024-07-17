import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun closeStrings() {
        val result = solution.closeStrings("abc", "cba")

        assertTrue(result)
    }

    @Test
    fun closeStrings_1() {
        val result = solution.closeStrings("cabbba", "abbccc")

        assertTrue(result)
    }

    @Test
    fun closeStrings_2() {
        val result = solution.closeStrings("cabbba", "aabbss")

        assertFalse(result)
    }

    @Test
    fun closeStrings_3() {
        val result = solution.closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff")

        assertFalse(result)
    }

    @Test
    fun whenStringsLengthNotEqual() {
        assertFalse(solution.closeStrings("a", "aa"))
    }

    @Test
    fun getOccurrence() {
        val occurrence = solution.getOccurrence("abc")

        assertEquals(
            mapOf(
                'a' to 1,
                'b' to 1,
                'c' to 1
            ), occurrence
        )
    }
}
