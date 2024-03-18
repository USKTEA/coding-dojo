import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenInputIs4() {
        assertEquals(2, solution.mySqrt(4))
    }

    @Test
    fun whenInPutIsLte3() {
        assertEquals(0, solution.mySqrt(0))
        assertEquals(1, solution.mySqrt(1))
        assertEquals(1, solution.mySqrt(2))
        assertEquals(1, solution.mySqrt(3))
    }

    @Test
    fun whenInputIs5() {
        assertEquals(2, solution.mySqrt(5))
    }

    @Test
    fun whenInputIs8() {
        assertEquals(2, solution.mySqrt(8))
    }

    @Test
    fun whenInputIs9() {
        assertEquals(3, solution.mySqrt(9))
    }

    @Test
    fun whenInputIs2147483647() {
        assertEquals(46340, solution.mySqrt(2147483647))
    }
}
