import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.suggestedProducts(arrayOf("havana"), "havana")

        assertEquals(
            listOf(
                listOf("havana"),
                listOf("havana"),
                listOf("havana"),
                listOf("havana"),
                listOf("havana"),
                listOf("havana"),
            ), result
        )
    }

    @Test
    fun test_case_2() {
        val result = solution.suggestedProducts(arrayOf("mobile", "mouse", "moneypot", "monitor", "mousepad"), "mouse")

        assertEquals(
            listOf(
                listOf("mobile", "moneypot", "monitor"),
                listOf("mobile", "moneypot", "monitor"),
                listOf("mouse", "mousepad"),
                listOf("mouse", "mousepad"),
                listOf("mouse", "mousepad"),
            ), result
        )
    }

    @Test
    fun search() {
        val sortedProduct = listOf("mobile", "moneypot", "monitor", "mouse", "mousepad")

        val (result1, nextCursor1) = solution.search(
            sortedProducts = sortedProduct,
            cursor = 0,
            searchWord = "m"
        )

        assertEquals(listOf("mobile", "moneypot", "monitor"), result1)
        assertEquals(0, nextCursor1)

        val (result2, nextCursor2) = solution.search(
            sortedProducts = sortedProduct,
            cursor = 0,
            searchWord = "mo"
        )

        assertEquals(listOf("mobile", "moneypot", "monitor"), result2)
        assertEquals(0, nextCursor2)

        val (result3, nextCursor3) = solution.search(
            sortedProducts = sortedProduct,
            cursor = 0,
            searchWord = "mou"
        )

        assertEquals(listOf("mouse", "mousepad"), result3)
        assertEquals(3, nextCursor3)

        val (result4, nextCursor4) = solution.search(
            sortedProducts = sortedProduct,
            cursor = 3,
            searchWord = "mous"
        )

        assertEquals(listOf("mouse", "mousepad"), result4)
        assertEquals(3, nextCursor4)

        val (result5, nextCursor5) = solution.search(
            sortedProducts = sortedProduct,
            cursor = 3,
            searchWord = "mouse"
        )

        assertEquals(listOf("mouse", "mousepad"), result5)
        assertEquals(3, nextCursor5)
    }
}
