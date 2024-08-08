class Solution {

    //[1, 7, 0, 7, -8, null, null] => 2
    fun maxLevelSum(root: TreeNode?, depth: Int = 0, sum: MutableList<Int> = mutableListOf()): Int {
        if (root != null) {
            sum.getOrElse(depth) { sum.add(0) }
            sum[depth] = sum[depth] + root.`val`
            println(sum)

            maxLevelSum(root.left, depth + 1, sum)
            maxLevelSum(root.right, depth + 1, sum)
        }

        return sum.mapIndexedNotNull { index, i ->
            if (i == sum.max()) {
                return@mapIndexedNotNull index
            }

            return@mapIndexedNotNull null
        }.first() + 1
    }
}

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
