import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenBothAreNull() {
        val p = null
        val q = null

        assertTrue(solution.isSameTree(p = p, q = q))
    }

    @Test
    fun whenBothSizeIsOneAndValueIsOne() {
        val p = TreeNode(1)
        val q = TreeNode(1)

        assertTrue(solution.isSameTree(p, q))
    }

    @Test
    fun whenBothSizeIsTwoAndSomeValueAreDifferent() {
        val p = TreeNode(1).apply { this.left = TreeNode(1) }
        val q = TreeNode(1).apply { this.left = TreeNode(2) }

        assertFalse(solution.isSameTree(p, q))
    }

    @Test
    fun whenBothSizeIsTwoAndHaveSameValue() {
        val p = TreeNode(1).apply { this.left = TreeNode(1) }
        val q = TreeNode(1).apply { this.left = TreeNode(1) }

        assertTrue(solution.isSameTree(p, q))
    }

    @Test
    fun whenSizeIsDifferent() {
        val p = TreeNode(1).apply { this.left = TreeNode(1) }
        val q = TreeNode(1)

        assertFalse(solution.isSameTree(p, q))
    }

    @Test
    fun complexTestCase1() {
        val p = TreeNode(1).apply {
            this.left = TreeNode(2)
            this.right = TreeNode(3)
        }

        val q = TreeNode(1).apply {
            this.left = TreeNode(2)
            this.right = TreeNode(3)
        }

        assertTrue(solution.isSameTree(p, q))
    }

    @Test
    fun complexTestCase2() {
        val p = TreeNode(1).apply {
            this.left = TreeNode(2)
        }

        val q = TreeNode(1).apply {
            this.right = TreeNode(2)
        }

        assertFalse(solution.isSameTree(p, q))
    }

    @Test
    fun complexTestCase3() {
        val p = TreeNode(1).apply {
            this.left = TreeNode(2)
            this.right = TreeNode(1)
        }

        val q = TreeNode(1).apply {
            this.left = TreeNode(1)
            this.right = TreeNode(2)
        }

        assertFalse(solution.isSameTree(p, q))
    }
}
