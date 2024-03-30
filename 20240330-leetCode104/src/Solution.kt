class Solution {
    //[] => 0
    //[1] => 1
    //[1, null, 2] => 2
    //[3,9,20,null,null,15,7] => 3
    //maxDepth(root: Node?, depth: Int) if root == null return depth
    //return math.max(left, right)
    fun maxDepth(root: TreeNode?, depth: Int = 0): Int {
        if (root == null) {
            return depth
        }

        return maxDepth(root.left, depth + 1).coerceAtLeast(maxDepth(root.right, depth + 1))
    }
}

data class TreeNode(
    val `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
