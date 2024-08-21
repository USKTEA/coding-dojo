import kotlin.math.round

class Solution {
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if (root == null) {
            return null
        }

        if (root.`val` == key) {
            val values = buildList {
                addAll(getValues(root.left))
                addAll(getValues(root.right))
            }

            val bst = toBst(values)

            return bst
        }

        if (root.left?.`val` == key) {
            val values = buildList {
                addAll(getValues(root.left?.left))
                addAll(getValues(root.left?.right))
            }

            val bst = toBst(values)

            root.left = bst

            return root
        }

        if (root.right?.`val` == key) {
            val values = buildList {
                addAll(getValues(root.right?.left))
                addAll(getValues(root.right?.right))
            }

            val bst = toBst(values)

            root.right = bst

            return root
        }

        deleteNode(root.left, key)
        deleteNode(root.right, key)

        return root
    }

    fun toBst(nums: List<Int>): TreeNode? {
        if (nums.isEmpty()) return null
        return sortedListToBSTHelper(nums, 0, nums.size - 1)
    }

    // 재귀적으로 BST를 구축하는 도우미 함수
    private fun sortedListToBSTHelper(nums: List<Int>, start: Int, end: Int): TreeNode? {
        if (start > end) return null

        val mid = (start + end) / 2
        val root = TreeNode(nums[mid])

        root.left = sortedListToBSTHelper(nums, start, mid - 1)
        root.right = sortedListToBSTHelper(nums, mid + 1, end)

        return root
    }

    fun getValues(node: TreeNode?, values: MutableList<Int> = mutableListOf()): MutableList<Int> {
        if (node == null) {
            return values
        }

        if (node.left == null && node.right == null) {
            values.add(node.`val`)

            return values
        }

        if (node.left != null) {
            getValues(node.left, values)
        }

        values.add(node.`val`)

        if (node.right != null) {
            getValues(node.right, values)
        }

        return values
    }
}

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
)
