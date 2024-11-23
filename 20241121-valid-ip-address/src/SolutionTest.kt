import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun restoreIpAddresses() {
        val result = solution.restoreIpAddresses("25525511135")

        assertEquals(
            arrayListOf("255.255.11.135", "255.255.111.35"), result
        )
    }
}
