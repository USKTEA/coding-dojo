import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun searchBST() {
        val node = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }

        val treeNode = TreeNode(4).apply {
            left = node
            right = TreeNode(7)
        }

        val result = solution.searchBST(treeNode, 2)

        assertEquals(node, result)
    }
}
