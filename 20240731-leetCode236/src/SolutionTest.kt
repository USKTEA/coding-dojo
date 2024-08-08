import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun lowestCommonAncestor() {
        val left = TreeNode(5).apply {
            left = TreeNode(6)
            right = TreeNode(2).apply {
                left = TreeNode(7)
                right = TreeNode(4)
            }
        }

        val right = TreeNode(1).apply {
            this.left = TreeNode(0)
            this.right = TreeNode(8)
        }

        val tree = TreeNode(3).apply {
            this.left = left
            this.right = right
        }

        val result = solution.lowestCommonAncestor(tree, left, right)

        assertEquals(tree, result)
    }

    @Test
    fun findLca() {
        val tree = TreeNode(1).apply {
            this.left = TreeNode(0)
            this.right = TreeNode(8)
        }

        val left = TreeNode(5).apply {
            left = TreeNode(6)
            right = TreeNode(2).apply {
                left = TreeNode(7)
                right = TreeNode(4)
            }
        }

        val right = TreeNode(1).apply {
            this.left = TreeNode(0)
            this.right = TreeNode(8)
        }

        val lca = solution.findLca(tree, left, right)

        assertNull(lca)
    }
}
