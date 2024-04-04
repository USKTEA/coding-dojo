import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenPricesSizeIsOne() {
        val pricesOne = intArrayOf(1)
        val pricesTwo = intArrayOf(0)

        assertEquals(0, solution.maxProfit(pricesOne))
        assertEquals(0, solution.maxProfit(pricesTwo))
    }

    @Test
    fun whenPricesSizeIsTwo() {
        val pricesOne = intArrayOf(1, 1)
        val pricesTwo = intArrayOf(1, 2)
        val pricesThree = intArrayOf(3, 2)

        assertEquals(0, solution.maxProfit(pricesOne))
        assertEquals(1, solution.maxProfit(pricesTwo))
        assertEquals(0, solution.maxProfit(pricesThree))
    }

    @Test
    fun whenPricesSizeIsThree() {
        val pricesOne = intArrayOf(1, 2, 3)
        val pricesTwo = intArrayOf(2, 1, 4)

        assertEquals(2, solution.maxProfit(pricesOne))
        assertEquals(3, solution.maxProfit(pricesTwo))
    }

    @Test
    fun whenPricesSIzeIsSix() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)

        assertEquals(5, solution.maxProfit(prices))
    }
}
