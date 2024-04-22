import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun easyTest() {
        val solution = Solution(
            w = intArrayOf(1)
        )

        val randomGenerator = MockRandomGenerator(0.3333333333333333)

        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
    }

    @Test
    fun complexTest() {
        val solution = Solution(
            w = intArrayOf(1, 3)
        )

        val randomGenerator = MockRandomGenerator(0.3333333333333333)

        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
        assertEquals(0, solution.pickIndex(randomGenerator))
    }

    @Test
    fun weightIndex1() {
        val solution = Solution(
            w = intArrayOf(1, 3)
        )

        assertEquals(
            listOf(
                WeighIndex(
                    from = 0.0,
                    to = 0.25,
                    index = 0
                ),
                WeighIndex(
                    from = 0.25,
                    to = 1.0,
                    index = 1
                ),
            ), solution.weighIndex
        )
    }

    @Test
    fun weightIndex2() {
        val solution = Solution(
            w = intArrayOf(1, 1, 1)
        )

        assertEquals(
            listOf(
                WeighIndex(
                    from = 0.0,
                    to = 0.3333333333333333,
                    index = 0
                ),
                WeighIndex(
                    from = 0.3333333333333333,
                    to = 0.6666666666666666,
                    index = 1
                ),
                WeighIndex(
                    from = 0.6666666666666666,
                    to = 1.0,
                    index = 2
                ),
            ), solution.weighIndex
        )
    }
}
