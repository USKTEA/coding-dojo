import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun simpleCase1() {
        val root = TreeNode(1)

        assertEquals(1, solution.rangeSumBST(root, 1,  1))
    }

    @Test
    fun simpleCase2() {
        val root = TreeNode(1)

        assertEquals(0, solution.rangeSumBST(root, 2, 2))
    }

    @Test
    fun simpleCase3() {
        val root = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }

        assertEquals(6, solution.rangeSumBST(root, 1, 3))
    }

    @Test
    fun complexCase1() {
        val root = TreeNode(10).apply {
            left = TreeNode(5).apply {
                left = TreeNode(3)
                right = TreeNode(7)
            }
            right = TreeNode(15).apply {
                right = TreeNode(18)
            }
        }

        assertEquals(32, solution.rangeSumBST(root, 7, 15))
    }

    @Test
    fun complexCase2() {
        val root = TreeNode(10).apply {
            left = TreeNode(5).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(1)
                }
                right = TreeNode(7).apply {
                    left = TreeNode(6)
                }
            }
            right = TreeNode(15).apply {
                left = TreeNode(13)
                right = TreeNode(18)
            }
        }

        assertEquals(23, solution.rangeSumBST(root, 6, 10))
    }
}
