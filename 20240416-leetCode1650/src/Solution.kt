class Solution {
    fun lowestCommonAncestor(p: Node?, q: Node?): Node? {
        if (isAncestorOf(p, q)) {
            return p
        }

        if (isAncestorOf(q, p)) {
            return q
        }

        var pAncestor = p?.parent

        while (pAncestor != null) {
            if (isAncestorOf(pAncestor, q)) {
                return pAncestor
            }

            pAncestor = pAncestor?.parent
        }

        var qAncestor = q?.parent

        while (qAncestor != null) {
            if (isAncestorOf(qAncestor, p)) {
                return qAncestor
            }

            qAncestor = qAncestor?.parent
        }

        return null
    }

    private fun isAncestorOf(left: Node?, right: Node?): Boolean {
        if (left == right) {
            return true
        }

        if (left == null) {
            return false
        }

        return isAncestorOf(left.left, right) || isAncestorOf(left.right, right)
    }
}



data class Node(
    var `val`: Int,
    var left: Node? = null,
    var right: Node? = null,
    var parent: Node? = null,
)
