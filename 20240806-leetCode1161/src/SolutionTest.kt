import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxLevelSum() {
        val treeNode = TreeNode(1).apply {
            left = TreeNode(7).apply {
                left = TreeNode(7)
                right = TreeNode(-8)
            }
            right = TreeNode(0)
        }

        val result = solution.maxLevelSum(treeNode)

        assertEquals(2, result)
    }
}
