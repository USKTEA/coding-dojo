import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun findPeakElement() {
        val peak = solution.findPeakElement(intArrayOf(1, 2, 3, 1))

        assertEquals(2, peak)
    }

    @Test
    fun findPeakElement_2() {
        val peak = solution.findPeakElement(intArrayOf(2, 1))

        assertEquals(0, peak)
    }

    @Test
    fun findPeakElement_3() {
        val peak = solution.findPeakElement(intArrayOf(1, 2))

        assertEquals(1, peak)
    }

    @Test
    fun findPeakElement_4() {
        val peak = solution.findPeakElement(intArrayOf(3, 2, 1))

        assertEquals(0, peak)
    }

    @Test
    fun findPeakElement_5() {
        val peak = solution.findPeakElement(intArrayOf(6, 5, 4, 3, 2, 3, 2))

        assertEquals(0, peak)
    }
}
