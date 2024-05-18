import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val pNode = TreeNode(5).apply {
            this.left = TreeNode(6)
            this.right = TreeNode(2).apply {
                this.left = TreeNode(7)
                this.right = TreeNode(4)
            }
        }
        val qNode = TreeNode(1).apply {
            this.left = TreeNode(0)
            this.right = TreeNode(8)
        }

        val rootNode = TreeNode(3).apply {
            this.left = pNode
            this.right = qNode
        }

        val result = solution.lowestCommonAncestor(rootNode, pNode, qNode)

        assertEquals(3, result?.`val`)
    }

    @Test
    fun test_case_2() {
        val q = TreeNode(4)
        val p = TreeNode(5).apply {
            left = TreeNode(6)
            right = TreeNode(2).apply {
                left = TreeNode(7)
                right = q
            }
        }
        val node = TreeNode(3).apply {
            left = p
            right = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(8)
            }
        }

        val result = solution.lowestCommonAncestor(node, p, q)

        assertEquals(5, result?.`val`)
    }
}
