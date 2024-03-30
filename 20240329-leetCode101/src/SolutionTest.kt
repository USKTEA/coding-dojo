import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun traverse1() {
        val node = TreeNode(1)

        assertEquals(mutableListOf(mutableListOf(1), mutableListOf(null, null)), solution.traverse(node))
    }

    @Test
    fun traverse2() {
        val node = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
                right = TreeNode(4)
            }
            right = TreeNode(2).apply {
                left = TreeNode(4)
                right = TreeNode(3)
            }
        }

        assertEquals(
            mutableListOf(
                mutableListOf(1),
                mutableListOf(2, 2),
                mutableListOf(3, 4, 4, 3),
                mutableListOf(null, null, null, null, null, null, null, null),
            ),
            solution.traverse(node)
        )
    }

    @Test
    fun traverse3() {
        val node = TreeNode(1).apply {
            left = TreeNode(2).apply {
                right = TreeNode(3)
            }
            right = TreeNode(2).apply {
                right = TreeNode(3)
            }
        }

        assertEquals(
            mutableListOf(
                mutableListOf(1),
                mutableListOf(2, 2),
                mutableListOf(null, 3, null, 3),
                mutableListOf(null, null, null, null)
            ),
            solution.traverse(node)
        )
    }

    @Test
    fun traverse4() {
        val node = TreeNode(2).apply {
            left = TreeNode(3).apply {
                left = TreeNode(4)
                right = TreeNode(5).apply {
                    left = TreeNode(8)
                    right = TreeNode(9)
                }
            }

            right = TreeNode(3).apply {
                left = TreeNode(5)
                right = TreeNode(4).apply {
                    left = TreeNode(9)
                    right = TreeNode(8)
                }
            }
        }

        assertEquals(
            mutableListOf(
                mutableListOf(2),
                mutableListOf(3, 3),
                mutableListOf(4, 5, 5, 4),
                mutableListOf(null, null, 8, 9, null, null, 9, 8),
                mutableListOf(null, null, null, null, null, null, null, null)
            ),
            solution.traverse(node)
        )
    }

    @Test
    fun checkIsSymmetric1() {
        val values: MutableList<MutableList<Int?>> = mutableListOf(mutableListOf(1))

        assertTrue(solution.checkIsSymmetric(values))
    }

    @Test
    fun checkIsSymmetric2() {
        val values: MutableList<MutableList<Int?>> =
            mutableListOf(mutableListOf(1), mutableListOf(2, 2), mutableListOf(null, 3, null, 3))

        assertFalse(solution.checkIsSymmetric(values))
    }

    @Test
    fun checkIsSymmetric3() {
        val values: MutableList<MutableList<Int?>> =
            mutableListOf(mutableListOf(1), mutableListOf(2, 2), mutableListOf(3, 4, 4, 3))

        assertTrue(solution.checkIsSymmetric(values))
    }
}
