import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun longestZigZag() {
        val tree = TreeNode(1).also {
            it.left = TreeNode(1).also {
                it.right = TreeNode(1).also {
                    it.left = TreeNode(1).also {
                        it.right = TreeNode(1)
                    }
                    it.right = TreeNode(1)
                }
            }
            it.right = TreeNode(1)
        }

        val result = solution.longestZigZag(tree)

        assertEquals(4, result)
    }

    @Test
    fun traverse() {
        val treeNode = TreeNode(1)

        val zigZag = solution.traverse(treeNode, Direction.LEFT)

        assertEquals(0, zigZag)
    }

    @Test
    fun traverse_2() {
        val treeNode = TreeNode(1).also {
            it.left = TreeNode(1)
        }

        val zigZag = solution.traverse(treeNode, Direction.LEFT)

        assertEquals(1, zigZag)
    }

    @Test
    fun traverse_3() {
        val treeNode = TreeNode(1).also {
            it.right = TreeNode(1)
        }

        val zigZag = solution.traverse(treeNode, Direction.LEFT)

        assertEquals(0, zigZag)
    }

    @Test
    fun traverse_4() {
        val treeNode = TreeNode(1).also {
            it.right = TreeNode(1).also {
                it.right = TreeNode(1).also {
                    it.left = TreeNode(1).also {
                        it.right = TreeNode(1)
                    }
                }
            }
        }

        val zigZag = solution.traverse(treeNode, Direction.RIGHT)

        assertEquals(2, zigZag)
    }
}
