
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenRootIsNull() {
        val result = solution.verticalOrder(null)

        assertEquals(emptyList<Int>(), result)
    }

    @Test
    fun whenTreeOnlyHaveOneNode() {
        val root = TreeNode(1)
        val result = solution.verticalOrder(root)

        assertEquals(listOf(listOf(1)), result)
    }

    @Test
    fun whenTreeHaveTreeNodes() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }
        val result = solution.verticalOrder(root)

        assertEquals(listOf(listOf(2), listOf(1), listOf(3)), result)
    }

    @Test
    fun complexTestCase1() {
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }
        val result = solution.verticalOrder(root)

        assertEquals(listOf(listOf(9), listOf(3, 15), listOf(20), listOf(7)), result)
    }

    @Test
    fun complexTestCase2() {
        val root = TreeNode(3).apply {
            left = TreeNode(9).apply {
                left = TreeNode(4)
                right = TreeNode(0)
            }
            right = TreeNode(8).apply {
                left = TreeNode(1)
                right = TreeNode(7)
            }
        }
        val result = solution.verticalOrder(root)

        assertEquals(
            listOf(
                listOf(4),
                listOf(9),
                listOf(3, 0, 1),
                listOf(8),
                listOf(7),
            ), result
        )
    }

    @Test
    fun complexTestCase3() {
        val root = TreeNode(3).apply {
            left = TreeNode(9).apply {
                left = TreeNode(4)
                right = TreeNode(0).apply {
                    left = TreeNode(5)
                    right = TreeNode(2)
                }
            }
            right = TreeNode(8).apply {
                left = TreeNode(1)
                right = TreeNode(7)
            }
        }

        val result = solution.verticalOrder(root)

        assertEquals(
            listOf(
                listOf(4),
                listOf(9, 5),
                listOf(3, 0, 1),
                listOf(8, 2),
                listOf(7),
            ), result
        )
    }
}
