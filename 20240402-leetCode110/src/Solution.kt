import kotlin.math.abs

class Solution {
    //[] => true
    //[1] => true
    //[1, 1] => true
    //[1, 1, 1] => true
    //[1, 2, null, 3] => false
    //[3, 9, 20, null, null, 15, 7] => true
    //[1, 2, 2, 3, 3, null, null, 4, 4]
    //if root == null return true
    //if root.left != null && root.right != null
    //isBalanced(root.left) && isBalanced(root.right)

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        val leftHeight = getHeight(root.left)
        val rightHeight = getHeight(root.right)

        return abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)
    }

    private fun getHeight(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }

        return getHeight(node.left).coerceAtLeast(getHeight(node.right)) + 1
    }
}

data class TreeNode(
    val `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
