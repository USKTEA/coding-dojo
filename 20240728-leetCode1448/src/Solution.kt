class Solution {
    fun goodNodes(root: TreeNode?): Int {
        return countGoodNodes(root, Int.MIN_VALUE)
    }

    private fun countGoodNodes(node: TreeNode?, maxSoFar: Int): Int {
        if (node == null) return 0

        val isGoodNode = node.`val` >= maxSoFar
        val newMax = maxOf(maxSoFar, node.`val`)

        val leftCount = countGoodNodes(node.left, newMax)
        val rightCount = countGoodNodes(node.right, newMax)

        return (if (isGoodNode) 1 else 0) + leftCount + rightCount
    }
}

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
)
