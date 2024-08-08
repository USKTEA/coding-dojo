import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun pathSum() {
        val tree = TreeNode(10).also {
            it.left = TreeNode(5).also {
                it.left = TreeNode(3).also {
                    it.left = TreeNode(3)
                    it.right = TreeNode(-2)
                }
                it.right = TreeNode(2).also {
                    it.right = TreeNode(1)
                }
            }
            it.right = TreeNode(-3).also {
                it.right = TreeNode(11)
            }
        }
        val result = solution.pathSum(tree, 8)

        assertEquals(3, result)
    }
}
