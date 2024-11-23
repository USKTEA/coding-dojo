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

    @Test
    fun addBit() {
        val result = solution.addBit(-1, '1')

        assertEquals(1, result)
    }

    @Test
    fun addBit_2() {
        val result = solution.addBit(1, '1')

        assertEquals(11, result)
    }
}
