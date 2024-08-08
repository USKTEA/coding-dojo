class Solution {
    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        if (root == null) return 0

        // 현재 노드에서 시작하는 경로의 수를 계산
        val pathsFromRoot = countPaths(root, targetSum.toLong())

        // 왼쪽과 오른쪽 서브트리에서 시작하는 경로의 수를 재귀적으로 계산
        val pathsFromLeft = pathSum(root.left, targetSum)
        val pathsFromRight = pathSum(root.right, targetSum)

        // 모든 경로의 수를 합산
        return pathsFromRoot + pathsFromLeft + pathsFromRight
    }

    private fun countPaths(node: TreeNode?, targetSum: Long): Int {
        if (node == null) {
            return 0
        }

        var count = 0

        if (node.`val`.toLong() == targetSum) {
            count += 1
        }

        // 왼쪽과 오른쪽 자식 노드로 경로를 계속 탐색
        count += countPaths(node.left, targetSum - node.`val`)
        count += countPaths(node.right, targetSum - node.`val`)

        return count
    }
}

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
)
