import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun rightSideView() {
        val tree = TreeNode(1).apply {
            left = TreeNode(2).apply {
                right = TreeNode(5)
            }
            right = TreeNode(3).apply {
                right = TreeNode(4)
            }
        }

        val result = solution.rightSideView(tree)

        assertEquals(listOf(1, 3, 4), result)
    }

    @Test
    fun rightSideView_1() {
        val tree = TreeNode(1).apply {
            right = TreeNode(3)
        }

        val result = solution.rightSideView(tree)

        assertEquals(listOf(1, 3), result)
    }

    @Test
    fun rightSideView_2() {
        val tree = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4)
            }
            right = TreeNode(3)
        }

        val result = solution.rightSideView(tree)

        assertEquals(listOf(1, 3, 4), result)
    }
}
