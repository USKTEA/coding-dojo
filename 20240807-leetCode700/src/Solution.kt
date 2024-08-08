class Solution {
    //[4, 2, 7, 1, 3], 2 => [2, 1, 3]
    //BST는 자신보다 작은건 왼쪽에 큰건 오른쪽에 있다
    //주어진 val이 root의 val과 같으면 root 반환
    //val이 root.val 보다 작으면 root.left.val 그런데 root가 없졍 그럼 null 반환
    //오른쪽도 동일하게
    tailrec fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) {
            return null
        }

        if (root.`val` == `val`) {
            return root
        }

        if (root.`val` > `val`) {
            return searchBST(root.left, `val`)
        }

        return searchBST(root.right, `val`)
    }
}

data class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
