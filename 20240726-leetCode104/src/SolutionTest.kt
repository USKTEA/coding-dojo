import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxDepth() {
        val tree = TreeNode(1).apply {
            left = null
            right = TreeNode(2)
        }

        val result = solution.maxDepth(tree)

        assertEquals(2, result)
    }

    @Test
    fun maxDepth_2() {
        val tree = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val result = solution.maxDepth(tree)

        assertEquals(3, result)
    }
}
