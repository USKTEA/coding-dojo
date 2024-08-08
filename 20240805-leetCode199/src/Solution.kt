class Solution {
    //[1, 1, null] => [1, 1]
    //[1, 2, 3, null, 5, null, 4] => [1, 3, 4]
    fun rightSideView(root: TreeNode?, rightSides: MutableList<Int> = mutableListOf(), depth: Int = 1): List<Int> {
        if (root != null) {
            if (rightSides.size < depth) {
                rightSides.add(root.`val`)
            }

            rightSideView(root.right, rightSides, depth + 1)
            rightSideView(root.left, rightSides, depth + 1)
        }

        return rightSides
    }
}

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
)
