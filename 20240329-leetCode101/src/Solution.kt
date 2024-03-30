class Solution {
    //[1, 2, 2, 3, 4, 4, 3] => true
    //[1, 2, 2, null, 3, null, 3] => false
    //[1, 2, 2, 3, 3, 3, 3] traverse => [[1], [2, 2], [3, 3, 3, 3]]
    //isSymmetric() left = 0, right = list.lastIndex return list[left] == list[right]
    //if (left >= right) break

    fun isSymmetric(root: TreeNode): Boolean {
        val values = traverse(root)
        values.removeAt(values.size - 1)

        return checkIsSymmetric(values)
    }

    fun checkIsSymmetric(values: MutableList<MutableList<Int?>>): Boolean {
        for (i: Int in 0..<values.size) {
            val numbers = values[i]

            var left = 0
            var right = numbers.size - 1

            while (left < right) {
                if (numbers[left] != numbers[right]) {
                    return false
                }

                left += 1
                right -= 1
            }
        }

        return true
    }

    fun traverse(
        root: TreeNode?,
        depth: Int = 0,
        result: MutableList<MutableList<Int?>> = mutableListOf()
    ): MutableList<MutableList<Int?>> {
        if (result.size <= depth) {
            result.add(mutableListOf())
        }

        if (root == null) {
            result[depth].add(null)

            return result
        }

        result[depth].add(root.`val`)

        traverse(root.left, depth + 1, result)
        traverse(root.right, depth + 1, result)

        return result
    }
}

data class TreeNode(
    val `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
