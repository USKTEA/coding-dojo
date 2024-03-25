import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenTreeIsNull() {
        val root = null
        val result = solution.inorderTraversal(root)

        assertEquals(emptyList<Int>(), result)
    }

    @Test
    fun whenTreeOnlyHaveOneNode() {
        val root = TreeNode(1)
        val result = solution.inorderTraversal(root)

        assertEquals(listOf(1), result)
    }

    @Test
    fun whenTreeHasTreeNodes() {
        val root = TreeNode(1)
        val node1 = TreeNode(2)
        val node2 = TreeNode(3)
        root.left = null
        root.right = node1
        node1.left = node2

        val result = solution.inorderTraversal(root)
        assertEquals(listOf(1, 3, 2), result)
    }
}
