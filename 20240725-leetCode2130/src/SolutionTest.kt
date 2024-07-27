import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun pairSum() {
        val result = solution.pairSum(
            ListNode(5).also {
                it.next = ListNode(4).also {
                    it.next = ListNode(2).also {
                        it.next = ListNode(1)
                    }
                }
            }
        )

        assertEquals(6, result)
    }

    @Test
    fun getTwinIndex() {
        val index = solution.getPairIndex(0, 4)

        assertEquals(0, index)
    }

    @Test
    fun getTwinIndex_2() {
        val index = solution.getPairIndex(3, 4)

        assertEquals(0, index)
    }

    @Test
    fun getTwinIndex_3() {
        val index = solution.getPairIndex(1, 4)

        assertEquals(1, index)
    }

    @Test
    fun getTwinIndex_4() {
        val index = solution.getPairIndex(2, 4)

        assertEquals(1, index)
    }

    @Test
    fun getTwinIndex_5() {
        val index1 = solution.getPairIndex(0, 6)
        val index2 = solution.getPairIndex(1, 6)
        val index3 = solution.getPairIndex(2, 6)
        val index4 = solution.getPairIndex(3, 6)
        val index5 = solution.getPairIndex(4, 6)
        val index6 = solution.getPairIndex(5, 6)

        assertEquals(0, index1)
        assertEquals(1, index2)
        assertEquals(2, index3)
        assertEquals(2, index4)
        assertEquals(1, index5)
        assertEquals(0, index6)
    }

    @Test
    fun getNodeSize() {
        val size = solution.getNodeSize(
            ListNode(5).also {
                it.next = ListNode(4).also {
                    it.next = ListNode(2).also {
                        it.next = ListNode(1)
                    }
                }
            })

        assertEquals(4, size)
    }
}
