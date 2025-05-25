import java.nio.charset.StandardCharsets
import java.time.LocalDate
import java.time.Period
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun getIntersectionNode() {
        val list = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {}
            }
        }

        val otherList = ListNode(2).apply {
            next = ListNode(3)
        }

        val result = solution.getIntersectionNode(list, otherList)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(3)
            }, result
        )
    }

    @Test
    fun test() {
        val age = Period.between(LocalDate.now(), LocalDate.parse("1992-09-09")).years

        println(age)
    }
}
