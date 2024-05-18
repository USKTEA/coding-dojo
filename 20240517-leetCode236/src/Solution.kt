class Solution {

    //[3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 => 3
    //if(current.left == null) && (current.right == null) return false
    //if(current.isAncestorOf(q) && current.isAncesotr(q) {
    // left.isAncestorOf(p, q)
    // right.isAncestorOf(p, q)
    // }

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        // 만약 root가 p나 q 중 하나와 같다면 root를 반환
        if (root == p || root == q) {
            return root
        }

        // 왼쪽과 오른쪽 서브트리에서 LCA 찾기
        val left = lowestCommonAncestor(root.left, p, q)
        val right = lowestCommonAncestor(root.right, p, q)

        // 만약 p와 q가 서로 다른 서브트리에 있다면, root가 LCA가 됨
        if (left != null && right != null) {
            return root
        }

        // 만약 p와 q가 같은 서브트리에 있다면, 그 서브트리의 결과를 반환
        return left ?: right
    }
}

data class TreeNode(
    val `val`: Int = 0,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
) {
    fun isAncestorOf(p: TreeNode?, q: TreeNode?): Boolean {
        if (left == null && right == null) {
            return false
        }

        if (this.left == p || this.right == q || this.right == p || this.left == q) {
            return true
        }

        if (left != null && right != null) {
            return left?.isAncestorOf(p, q)!! || right?.isAncestorOf(p, q)!!
        }

        if (left == null) {
            return right?.isAncestorOf(p, q)!!
        }

        return left?.isAncestorOf(p, q)!!
    }
}
