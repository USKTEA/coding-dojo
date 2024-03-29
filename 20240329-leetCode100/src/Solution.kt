/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

// [1, 2, 3], [1, 2, 3] => true
// [1, 2], [1, null, 2] => false
// [1, 2, 1], [1, 1, 2] => false
// [], [] => true
// [1], [1] => true
// [1, 1], [1, 1] => true
// result = true
// (p.left != q.left) return false
// (p.right != q.right) return false
// (p.left != null) && (q.right != null) isSameTree(p, q, true)
// return true
class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return p.isEqual(q)
    }
}

private fun TreeNode?.isEqual(other: TreeNode?): Boolean {
    if (this == null && other == null) {
        return true
    }

    if (this?.`val` != other?.`val`) {
        return false
    }

    return this?.left.isEqual(other?.left) && this?.right.isEqual(other?.right)
}

data class TreeNode(
    val `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
