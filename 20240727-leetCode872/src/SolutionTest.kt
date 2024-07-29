import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun leafSimilar() {
        val tree1 = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }

        val tree2 = TreeNode(1).apply {
            left = TreeNode(3)
            right = TreeNode(2)
        }

        val result = solution.leafSimilar(tree1, tree2)

        assertFalse(result)
    }
}
