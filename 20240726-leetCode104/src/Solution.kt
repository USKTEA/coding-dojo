import kotlin.math.max

class Solution {
    //[3, 9, 20, null, null, 15, 7] => 3
    //[1, null, 2] => 2
    fun maxDepth(root: TreeNode?, depth: Int = 1): Int {
        if (root == null) {
            return depth - 1
        }

        return max(
            maxDepth(
                root = root.left,
                depth = depth + 1,
            ), maxDepth(
                root = root.right,
                depth = depth + 1
            )
        )
    }
}

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
)
