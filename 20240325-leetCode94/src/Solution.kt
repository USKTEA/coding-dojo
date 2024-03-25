class Solution {
    //root=[1, null, 2, 3] => [1, 3, 2]
    //root=[] => []
    //root=[1] => [1]
    //root=[2, 1, 3] => [2, 1, 3]
    //inOrder => 좌측 자식 + root + 우측 자식
    //traverse(leftNode) + val + traverse(rightNode)
    //if leftNode == null return `val`
    fun inorderTraversal(root: TreeNode?, result: MutableList<Int> = mutableListOf()): List<Int> {
        if (root == null) {
            return emptyList()
        }

        if (root.left == null) {
            result.add(root.`val`)
        }

        if (root.left != null) {
            inorderTraversal(root.left, result)
            result.add(root.`val`)
        }

        inorderTraversal(root.right, result)

        return result
    }
}

data class TreeNode(
    val `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
