import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("1234", "one-thousand-two-hundred-and-thirty-four")

        assertEquals(1, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("1016", "one-thousand-and-sixteen")

        assertEquals(1, result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve("10", "ten")

        assertEquals(1, result)
    }

    @Test
    fun solve_4() {
        val result = solution.solve("1", "one")

        assertEquals(1, result)
    }

    @Test
    fun solve_5() {
        val result = solution.solve("21", "twenty-one")

        assertEquals(1, result)
    }

    @Test
    fun solve_6() {
        val result = solution.solve("71675398", "seven-crore-sixteen-lakh-seventy-five-thousand-three-hundred-and-ninety-eight")

        assertEquals(1, result)
    }


    @Test
    fun solve_7() {
        val result = solution.solve("100", "one-hundred")

        assertEquals(1, result)
    }

    @Test
    fun solve_8() {
        val result = solution.solve("28440447", "two-crore-eighty-four-lakh-forty-thousand-four-hundred-and-forty-seven")

        "2_84_40_447"
        assertEquals(1, result)
    }

    @Test
    fun parseCrores() {
        val parsed = solution.parse(ParsedResult(1_00_00_000, listOf()), IndianUnit.CRORE);

        assertEquals(
            ParsedResult(
                original = 0, result = listOf(IndianNumber(1, IndianUnit.CRORE))
            ), parsed
        )
    }

    @Test
    fun parseTenCrores() {
        val parsed = solution.parse(ParsedResult(10_00_00_000, listOf()), IndianUnit.CRORE);

        assertEquals(
            ParsedResult(
                original = 0, result = listOf(IndianNumber(10, IndianUnit.CRORE))
            ), parsed
        )
    }

    @Test
    fun parseNinetyNineCrores() {
        val parsed = solution.parse(ParsedResult(99_00_00_000, listOf()), IndianUnit.CRORE);

        assertEquals(
            ParsedResult(
                original = 0, result = listOf(IndianNumber(99, IndianUnit.CRORE))
            ), parsed
        )
    }

    @Test
    fun parseNineCroresTenLakhs() {
        val parsed = solution.parse(ParsedResult(9_10_00_000, listOf()), IndianUnit.CRORE);

        assertEquals(
            ParsedResult(
                original = 10_00_000, result = listOf(IndianNumber(9, IndianUnit.CRORE))
            ), parsed
        )
    }

    @Test
    fun parseTenLakhs() {
        val parsed = solution.parse(ParsedResult(10_00_000, listOf()), IndianUnit.LAKH);

        assertEquals(
            ParsedResult(
                original = 0, result = listOf(IndianNumber(10, IndianUnit.LAKH))
            ), parsed
        )
    }

    @Test
    fun parseCroresAndLakhs() {
        val parsed =
            solution.parse(
                solution.parse(ParsedResult(9_10_00_000, listOf()), IndianUnit.CRORE),
                IndianUnit.LAKH
            )

        assertEquals(
            ParsedResult(
                original = 0, result = listOf(
                    IndianNumber(9, IndianUnit.CRORE),
                    IndianNumber(10, IndianUnit.LAKH)
                )
            ), parsed
        )
    }

    @Test
    fun pasreThousands() {
        val parsed = solution.parse(
            ParsedResult(10_000, listOf()), IndianUnit.THOUSAND
        )

        assertEquals(
            ParsedResult(
                original = 0,
                result = listOf(IndianNumber(10, IndianUnit.THOUSAND))
            ), parsed
        )
    }

    @Test
    fun pasreOneThousandAndOne() {
        val parsed = solution.parse(
            ParsedResult(1_001, listOf()), IndianUnit.THOUSAND
        )

        assertEquals(
            ParsedResult(
                original = 1,
                result = listOf(IndianNumber(1, IndianUnit.THOUSAND))
            ), parsed
        )
    }

    @Test
    fun parseTwenty() {
        val parsed = solution.parse(
            ParsedResult(20, listOf()), IndianUnit.TEN
        )

        assertEquals(
            ParsedResult(
                original = 0,
                result = listOf(IndianNumber(2, IndianUnit.TEN))
            ), parsed
        )
    }

    @Test
    fun parseTwentyOne() {
        val parsed = solution.parse(
            ParsedResult(21, listOf()), IndianUnit.TEN
        )

        assertEquals(
            ParsedResult(
                original = 1,
                result = listOf(IndianNumber(2, IndianUnit.TEN))
            ), parsed
        )
    }

    @Test
    fun parse() {
        val parsed = solution.parse(
            ParsedResult(21, listOf()), IndianUnit.TEN
        )

        assertEquals(
            ParsedResult(
                original = 1,
                result = listOf(IndianNumber(2, IndianUnit.TEN))
            ), parsed
        )
    }
}
