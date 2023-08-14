import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val result = solution.solution(
            arrayOf("muzi", "frodo", "apeach", "neo"),
            arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"),
            2
        )
        
        assertArrayEquals(intArrayOf(2, 1, 1, 0), result)
    }
}
