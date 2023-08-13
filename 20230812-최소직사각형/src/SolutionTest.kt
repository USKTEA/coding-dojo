import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution(arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40)))

        assertEquals(4000, result)
    }

    @Test
    fun `첫 번째 요소가 두 번째 요소의 크기보다 크거나 같을 때 switch를 할 경우 순서가 변경되지 않는다`() {
        val solution = Solution()
        val switched = solution.switch(intArrayOf(60, 50))

        assertArrayEquals(intArrayOf(60, 50), switched)
    }

    @Test
    fun `첫 번째 요소가 두 번째 요소의 크기보다 작을 때 때 switch를 할 경우 순서가 변경된다`() {
        val solution = Solution()
        val switched = solution.switch(intArrayOf(50, 60))

        assertArrayEquals(intArrayOf(60, 50), switched)
    }

    @Test
    fun `intArray 중 가장 큰 첫 번째 요소와 두 번째 요소의 값을 반환한다`() {
        val solution = Solution()
        val maxSize = solution.calculateMaxSize(listOf(intArrayOf(60, 50), intArrayOf(70, 30), intArrayOf(60 ,30), intArrayOf(80, 40)))

        println(maxSize[0])
        println(maxSize[1])
        assertArrayEquals(intArrayOf(80, 50), maxSize)
    }
}
