class Solution {
    //[3, 9, 20, null, null, 15, 7] => [[9], [3, 15], [20], [7]]
    //[1] => [[1]]
    //[1, 2, 3] => [[3], [1], [2]]
    //if(root.left != null) verticalOrder(root.left, order - 1, result)
    //result.add(order, val)
    //if(root.right != null) verticalOrder(root.right, order + 1, result)
    //return result
    fun verticalOrder(
        root: TreeNode?,
        order: Int = 0,
        depth: Int = 0,
        result: MutableMap<Int, MutableList<Node>> = mutableMapOf()
    ): List<List<Int>> {
        if (root == null) {
            return getResult(result)
        }

        val toAdd = result.getOrDefault(order, mutableListOf())
        toAdd.add(Node(`val` = root.`val`, depth = depth))
        result[order] = toAdd

        if (root.left != null) {
            verticalOrder(root.left, order - 1, depth +1, result)
        }

        if (root.right != null) {
            verticalOrder(root.right, order + 1, depth + 1, result)
        }

        return getResult(result)
    }

    private fun getResult(result: MutableMap<Int, MutableList<Node>>): List<List<Int>> {
        val keys = result.keys.sorted()
        return keys.fold(mutableListOf<MutableList<Int>>()) { acc, key ->
            val nodes = result[key]!!
            nodes.sortBy { it.depth }
            acc.add(nodes.map { it.`val` }.toMutableList())
            acc
        }
    }
}

data class TreeNode(
    val `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)

data class Node(
    val `val`: Int,
    val depth: Int,
)
