import kotlin.math.max

class Solution {
    //abciiidef, 3 => 3
    //aeiou, 2 => 2
    //leetcode, 3 => 2
    fun maxVowels(s: String, k: Int): Int {
        val queue = ArrayDeque<Char>()
        var maxVowels = 0
        var vowels = 0

        for (char in s) {
            if (queue.size < k) {
                queue.addLast(char)

                if (isVowel(char)) {
                    vowels += 1
                }
            }

            if (queue.size == k) {
                maxVowels = max(maxVowels, vowels)

                if (maxVowels == k) {
                    return maxVowels
                }

                if (isVowel(queue.removeFirst())) {
                    vowels -= 1
                }
            }
        }

        return maxVowels
    }

    fun isVowel(char: Char): Boolean {
        return when (char) {
            'a' -> true
            'e' -> true
            'i' -> true
            'o' -> true
            'u' -> true
            else -> false
        }
    }
}
