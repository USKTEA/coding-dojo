class Solution {
    fun solve(parantheses: String): Int {
        val deque = ArrayDeque<Char>()

        parantheses.forEach {
            if (it == '(') {
                deque.addLast(it)
            }

            if (it == ')') {
                if (deque.isEmpty()) {
                    return 0
                }

                if (deque.last() != '(') {
                    return 0
                }

                deque.removeLast()
            }
        }

        if (deque.isNotEmpty()) {
            return 0
        }

        return 1
    }
}
