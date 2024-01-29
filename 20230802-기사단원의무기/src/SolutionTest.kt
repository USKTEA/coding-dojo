import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class
SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution(5, 3, 2)

        assertEquals(10, result)
    }

    @Test
    fun countDivisorsNumber1() {
        val solution = Solution()
        val count = solution.countDivisors(1)

        assertEquals(1, count)
    }

    @Test
    fun countDivisorsNumber2() {
        val solution = Solution()
        val count = solution.countDivisors(2)

        assertEquals(2, count)
    }

    @Test
    fun countDivisorsNumber3() {
        val solution = Solution()
        val count = solution.countDivisors(3)

        assertEquals(2, count)
    }

    @Test
    fun countDivisor15() {
        val solution = Solution()
        val count = solution.countDivisors(15)

        assertEquals(4, count)
    }

    @Test
    fun partitionOfNumber15() {
        val solution = Solution()
        val partition = solution.partition(15)

        assertEquals(3, partition)
    }

    @Test
    fun partitionOfNumber16() {
        val solution = Solution()
        val partition = solution.partition(16)

        assertEquals(4, partition)
    }

    @Test
    fun partitionOfNumber5() {
        val solution = Solution()
        val partition = solution.partition(5)

        assertEquals(2, partition)
    }

    @Test
    fun partitionOfNumber100() {
        val solution = Solution()
        val partition = solution.partition(100)

        assertEquals(10, partition)
    }
}
