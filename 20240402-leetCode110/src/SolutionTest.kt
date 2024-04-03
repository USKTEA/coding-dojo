import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenRootIsNull() {
        val root = null

        assertTrue(solution.isBalanced(root))
    }

    @Test
    fun whenRootDontHaveSubTrees() {
        val root = TreeNode(1)

        assertTrue(solution.isBalanced(root))
    }

    @Test
    fun whenRootHaveOneSubNode() {
        val root = TreeNode(1).apply {
            left = TreeNode(1)
        }

        assertTrue(solution.isBalanced(root))
    }

    @Test
    fun whenRootHaveTwoSubNodes() {
        val root = TreeNode(1).apply {
            left = TreeNode(1)
            right = TreeNode(1)
        }

        assertTrue(solution.isBalanced(root))
    }

    @Test
    fun whenRootLeftNodeHaveNode() {
        val root = TreeNode(1).apply {
            left = TreeNode(1).apply {
                left = TreeNode(1)
            }
        }

        assertFalse(solution.isBalanced(root))
    }

    @Test
    fun withComplex1() {
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        assertTrue(solution.isBalanced(root))
    }

    @Test
    fun withComplex2() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(4)
                    right = TreeNode(4)
                }
                right = TreeNode(3)
            }
            right = TreeNode(2)
        }

        assertFalse(solution.isBalanced(root))
    }

    @Test
    fun withComplex3() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(4)
                }
            }
            right = TreeNode(2).apply {
                right = TreeNode(3).apply {
                    right = TreeNode(4)
                }
            }
        }

        assertFalse(solution.isBalanced(root))
    }
}
