import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenRootIsNull() {
        val node = null

        assertEquals(0, solution.maxDepth(node))
    }

    @Test
    fun whenRootDontHaveNode() {
        val node = TreeNode(1)

        assertEquals(1, solution.maxDepth(node))
    }

    @Test
    fun whenRootHaveOneNode() {
        val node = TreeNode(1).apply {
            right = TreeNode(2)
        }

        assertEquals(2, solution.maxDepth(node))
    }

    @Test
    fun whenRootHaveLotsOfNodes() {
        val node = TreeNode(1).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        assertEquals(3, solution.maxDepth(node))
    }
}
