import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun compress() {
        var chars = charArrayOf('a')
        val result = solution.compress(chars)

        assertEquals(1, result)
        assertArrayEquals(charArrayOf('a'), chars)
    }

    @Test
    fun compress_1() {
        var chars = charArrayOf('a', 'a')
        val result = solution.compress(chars)

        assertEquals(2, result)
        assertArrayEquals(charArrayOf('a', '2'), chars)
    }

    @Test
    fun compress_2() {
        var chars = charArrayOf('a', 'a', 'a')
        val result = solution.compress(chars)

        assertEquals(2, result)
        assertArrayEquals(charArrayOf('a', '3', 'a'), chars)
    }

    @Test
    fun compress_3() {
        var chars = charArrayOf('a', 'a', 'a', 'b')
        val result = solution.compress(chars)

        assertEquals(3, result)
        assertArrayEquals(charArrayOf('a', '3', 'b', 'b'), chars)
    }

    @Test
    fun compress_4() {
        var chars = charArrayOf('a', 'a', 'a', 'b', 'b')
        val result = solution.compress(chars)

        assertEquals(4, result)
        assertArrayEquals(charArrayOf('a', '3', 'b', '2', 'b'), chars)
    }


    @Test
    fun compress_5() {
        var chars = charArrayOf('a', 'b', 'b', 'b', 'b')
        val result = solution.compress(chars)

        assertEquals(3, result)
        assertArrayEquals(charArrayOf('a', 'b', '4', 'b', 'b'), chars)
    }

    @Test
    fun compress_6() {
        var chars = charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')
        val result = solution.compress(chars)

        assertEquals(3, result)
        assertArrayEquals(charArrayOf('a', 'b', '1', '2', 'b'), chars)
    }
}
