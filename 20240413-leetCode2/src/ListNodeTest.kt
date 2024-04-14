import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ListNodeTest {
    @Test
    fun merge() {
        val node = ListNode(1)
        val otherNode = ListNode(1)

        node.merge(otherNode)

        assertEquals(ListNode(2), node)
    }

    @Test
    fun merge2() {
        val node = ListNode(1)
        val otherNode = ListNode(9)

        node.merge(otherNode)

        assertEquals(ListNode(0, next = ListNode(1)), node)
    }

    @Test
    fun merge3() {
        val node = ListNode(1, next = ListNode(1))
        val otherNode = ListNode(9)

        node.merge(otherNode)

        assertEquals(ListNode(0, next = ListNode(2)), node)
    }
}
