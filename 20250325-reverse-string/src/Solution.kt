class Solution {
    //abc -> cba
    fun reverseString(word: String): String {
        val deque = ArrayDeque<Char>()
        var result = ""

        word.forEach { deque.add(it) }

        while (deque.isNotEmpty()) {
            result += deque.removeLast()
        }

        return result
    }
}
