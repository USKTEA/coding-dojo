import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TreeNodeTest {
    @Test
    fun isAncestorOf_1() {
        val p = TreeNode(2)
        val q = TreeNode(3)

        val node = TreeNode(1).apply {
            left = p
            right = q
        }

        assertTrue(node.isAncestorOf(p, q))
    }

    @Test
    fun isAncestorOf_2() {
        val p = TreeNode(2)

        val node = TreeNode(1).apply {
            right = p
        }

        assertTrue(node.isAncestorOf(p, null))
    }

    @Test
    fun isAncestorOf_3() {
        val q = TreeNode(4)
        val node = TreeNode(5).apply {
            right = TreeNode(2).apply {
                left = TreeNode(7)
                right = q
            }
        }

        assertTrue(node.isAncestorOf(node, q))
    }

    @Test
    fun isAncestorOf_4() {
        val q = TreeNode(2)
        val p = TreeNode(3)
        val node = TreeNode(5).apply {
            left = TreeNode(8).apply {
                left = TreeNode(10)
            }
            right = TreeNode(9)
        }

        assertFalse(node.isAncestorOf(q, p))
    }

    @Test
    fun isAncestorOf_5() {
        val q = TreeNode(4)
        val p = TreeNode(2).apply {
            left = TreeNode(7)
            right = q
        }
        val node = TreeNode(5).apply {
            right = p
        }

        assertFalse(p.isAncestorOf(node, q))
    }

    @Test
    fun isAncestOf_6() {
        val q = TreeNode(4)
        val p = TreeNode(5).apply {
            left = TreeNode(6)
            right = TreeNode(2).apply {
                left = TreeNode(7)
                right = q
            }
        }
        val node = TreeNode(3).apply {
            left = p
            right = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(8)
            }
        }

        assertTrue(node.isAncestorOf(p, q))
    }

}
