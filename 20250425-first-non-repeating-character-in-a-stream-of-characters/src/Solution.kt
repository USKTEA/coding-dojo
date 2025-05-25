class Solution {
    //문자열 letters로 규칙에 따라 새로운 문자열을 반환하는 문제
    //규칙은 첫 번째
    val counts = mutableMapOf<Char, Int>()
    val result = mutableListOf<Char>()
    val deque = ArrayDeque<Char>()

    fun solve(letters: String): String {
        for (letter in letters) {
            val count = counts.getOrDefault(letter, 0)
            counts[letter] = count + 1
            deque.addLast(letter)

            while (deque.isNotEmpty() && counts[deque.first()] != 1) {
                deque.removeFirst()
            }

            if (deque.isEmpty()) {
                result.add('#')

                continue
            }

            result.add(deque.first())
        }

        return result.joinToString("")
    }
}
