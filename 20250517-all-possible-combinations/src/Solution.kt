class Solution {
    fun specialStrings(A: ArrayList<String>): ArrayList<String> {
        val result = ArrayList<String>()
        val current = StringBuilder()

        fun backtrack(index: Int) {
            if (index == A.size) {
                result.add(current.toString())
                return
            }

            val chars = A[index].toCharArray().sorted() // 사전순 보장을 위해 정렬
            for (c in chars) {
                current.append(c)
                backtrack(index + 1)
                current.deleteCharAt(current.length - 1)
            }
        }

        backtrack(0)
        return result
    }
}

