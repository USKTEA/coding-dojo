import kotlin.math.max

class Solution {
    //[1,null,1,1,1,null,null,1,1,null,1,null,null,null,1] => 3
    fun longestZigZag(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val leftLongestZigZag = traverse(root.left, Direction.RIGHT)
        val rightLongestZigZag = traverse(root.right, Direction.LEFT)

        return max(leftLongestZigZag, rightLongestZigZag)
    }

    fun traverse(node: TreeNode?, direction: Direction, zigZag: Int = 1): Int {
        if (node == null) {
            return zigZag - 1
        }

        val left = when (direction) {
            Direction.LEFT -> traverse(node.left, Direction.RIGHT, zigZag + 1)
            Direction.RIGHT -> traverse(node.left, Direction.RIGHT, 1)
        }

        val right = when (direction) {
            Direction.LEFT -> traverse(node.right, Direction.LEFT, 1)
            Direction.RIGHT -> traverse(node.right, Direction.LEFT, zigZag + 1)
        }

        return max(left, right)
    }
}

enum class Direction {
    LEFT, RIGHT
}

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
