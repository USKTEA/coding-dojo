class Solution {
    //[3,5,1,6,2,0,8,null,null,7,4], 5, 1 => 3
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        if (root == p || root == q) {
            return root
        }

        // 왼쪽과 오른쪽 자식에서 LCA 찾기
        val lcaFromLeft = lowestCommonAncestor(root.left, p, q)
        val lcaFromRight = lowestCommonAncestor(root.right, p, q)

        // p와 q가 각각 왼쪽과 오른쪽에 있을 경우, 현재 root가 LCA
        if (lcaFromLeft != null && lcaFromRight != null) {
            return root
        }

        // 왼쪽 또는 오른쪽에서만 LCA가 발견된 경우 해당 노드 반환
        return lcaFromLeft ?: lcaFromRight
    }
}

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
)
