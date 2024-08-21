import com.sun.source.tree.Tree
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun deleteNode() {
        val node = TreeNode(5).apply {
            left = TreeNode(3).apply {
                left = TreeNode(2)
                right = TreeNode(4)
            }
            right = TreeNode(6).apply {
                right = TreeNode(7)
            }
        }

        val expect = TreeNode(5).apply {
            left = TreeNode(4).apply {
                left = TreeNode(2)
            }
            right = TreeNode(6).apply {
                right = TreeNode(7)
            }
        }

        val result = solution.deleteNode(node, 3)

        assertEquals(expect, result)
    }


    @Test
    fun deleteNode_3() {
        val result = solution.deleteNode(TreeNode(0), 0)

        assertEquals(null, result)
    }

    @Test
    fun getValues() {
        val tree = TreeNode(3).apply {
            left = TreeNode(2)
            right = TreeNode(4)
        }

        val result = solution.getValues(tree)

        assertEquals(mutableListOf(2, 3, 4), result)
    }

    @Test
    fun getValues_1() {
        val tree = TreeNode(5).apply {
            left = TreeNode(3).apply {
                left = TreeNode(2)
                right = TreeNode(4)
            }
            right = TreeNode(6).apply {
                right = TreeNode(7)
            }
        }

        val result = solution.getValues(tree)

        assertEquals(mutableListOf(2, 3, 4, 5, 6, 7), result)
    }

    @Test
    fun toBst() {
        val bst = solution.toBst(listOf(1, 2, 3))

        assertEquals(
            TreeNode(2).apply {
                left = TreeNode(1)
                right = TreeNode(3)
            }, bst)
    }
}
