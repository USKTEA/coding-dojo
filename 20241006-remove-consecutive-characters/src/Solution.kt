class Solution {
    fun solve(letters: String, consecutiveCount: Int): String {
        var left = 0
        var right = left
        var current = letters

        while (left <= current.lastIndex) {
            val currentLetter = current[right]

            while (right < current.lastIndex && currentLetter == letters[right + 1]) {
                right += 1
            }

            val count = right - left + 1

            if (count == consecutiveCount) {
                current = current.substring(0, left) + current.substring(right + 1)
                right = left
            }

            if (count != consecutiveCount) {
                left = right + 1
                right = left
            }
        }

        return current
    }
}
