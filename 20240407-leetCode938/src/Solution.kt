class Solution {
    //[10, 5, 15, 3, 7, null, 18], 7, 15 => 32
    //[1], 1, 1 => 1
    //[1], 2, 2 => 0
    //[2, 1, 3], 1, 3 => 6
    //if(root.val > low) getHigher(root.left, low)
    //if(root.val < high) getLower(root.right, high)
    //if (root.val >= low && root.val <= high) return val +...
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) {
            return 0
        }

        if (root.`val` < low) {
            return rangeSumBST(root.right, low, high)
        }

        if (root.`val` > high) {
            return rangeSumBST(root.left, low, high)
        }

        return root.`val` + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
    }
}

data class TreeNode(
    val `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
