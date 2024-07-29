class Solution {
    fun leafSimilar(root1: TreeNode, root2: TreeNode): Boolean {
        val leaves = mutableListOf<Int>()

        root1.apply {
            this.leaves = leaves
            this.other = root2
        }

        root2.apply {
            this.leaves = leaves
            this.other = root1
        }

        return root1.traverse()
    }
}
