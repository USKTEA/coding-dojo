class Solution {
    fun solve(letters: String): Int {
        val letterCounts = letters.fold(mutableMapOf<Char, Int>()) { counts, letter ->
            val count = counts.getOrDefault(letter, 0)

            if (count == 0) {
                counts[letter] = 1
            } else {
                counts[letter] = 0
            }

            counts
        }

        if (isPalindrome(letterCounts, isEven(letters.length))) {
            return 1
        }

        return 0
    }


    private fun isEven(length: Int): Boolean {
        return length % 2 == 0
    }

    private fun isPalindrome(letterCounts: MutableMap<Char, Int>, isEven: Boolean): Boolean {
        if (isEven) {
            return letterCounts.values.sum() == 0
        }

        return letterCounts.values.sum() == 1
    }
}
