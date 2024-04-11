import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NodeTest {
    @Test
    fun merge() {
        val node1 = Node(1, 2)
        val node2 = Node(2, 3)

        val merged = node1.merge(node2)

        assertEquals(Node(1, 3), merged)
    }
}
