import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.letterCombinations("2")

        assertEquals(listOf("a", "b", "c"), result)
    }

    @Test
    fun test_case_2() {
        val result = solution.letterCombinations("23")

        assertEquals(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result)
    }

    @Test
    fun test_case_3() {
        val result = solution.letterCombinations("234")

        assertEquals(
            listOf(
                "adg",
                "adh",
                "adi",
                "aeg",
                "aeh",
                "aei",
                "afg",
                "afh",
                "afi",
                "bdg",
                "bdh",
                "bdi",
                "beg",
                "beh",
                "bei",
                "bfg",
                "bfh",
                "bfi",
                "cdg",
                "cdh",
                "cdi",
                "ceg",
                "ceh",
                "cei",
                "cfg",
                "cfh",
                "cfi"
            ), result
        )
    }
}
