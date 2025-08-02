class Solution {
    fun getPermutation(n: Int, k: Int): String {
        val visited = BooleanArray(n + 1) // 1-based
        val current = StringBuilder()
        val result = StringBuilder()
        var count = 0

        fun found(): Boolean {
            if (current.length == n) {
                count += 1

                if (count == k) {
                    result.append(current)
                    return true // found
                }
                return false
            }

            for (i in 1..n) {
                if (!visited[i]) {
                    visited[i] = true
                    current.append(i)

                    if (found()) {
                        return true
                    }

                    current.deleteCharAt(current.lastIndex)
                    visited[i] = false
                }
            }

            return false
        }

        found()

        return result.toString()
    }
}
