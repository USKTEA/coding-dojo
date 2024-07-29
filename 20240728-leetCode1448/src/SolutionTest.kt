import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun goodNodes() {
        val tree = TreeNode(3).apply {
            left = TreeNode(3).apply {
                left = TreeNode(4)
                right = TreeNode(2)
            }
        }

        val result = solution.goodNodes(tree)

        assertEquals(3, result)
    }

    @Test
    fun goodNodes_2() {
        val tree = TreeNode(3).apply {
            left = TreeNode(1).apply {
                left = TreeNode(3)
            }
            right = TreeNode(4).apply {
                left = TreeNode(1)
                right = TreeNode(5)
            }
        }

        val result = solution.goodNodes(tree)

        assertEquals(4, result)
    }

    @Test
    fun goodNodes_3() {
        val tree = TreeNode(9).apply {
            right = TreeNode(3).apply {
                right = TreeNode(6)
            }
        }

        val result = solution.goodNodes(tree)

        assertEquals(1, result)
    }
}
