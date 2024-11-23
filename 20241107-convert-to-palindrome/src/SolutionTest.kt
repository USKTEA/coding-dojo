import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test() {
        val result = solution.solve("abcba")

        assertEquals(1, result)
    }

    @Test
    fun test_2() {
        val result = solution.solve("abecbea")

        assertEquals(0, result)
    }

    @Test
    fun test_3() {
        val result = solution.solve("aaabccc")

        assertEquals(0, result)
    }

    @Test
    fun test_4() {
        val result = solution.solve("baaaaaa")

        assertEquals(1, result)
    }

    @Test
    fun test_5() {
        val result = solution.solve("aaaaaab")

        assertEquals(1, result)
    }

    @Test
    fun test_6() {
        val result = solution.solve("aabbddbaa")

        assertEquals(0, result)
    }

    @Test
    fun test_7() {
        val result = solution.solve("ivjwvi")

        assertEquals(1, result)
    }


    @Test
    fun test_8() {
        val result = solution.solve("baaccab")

        assertEquals(1, result)
    }
}
