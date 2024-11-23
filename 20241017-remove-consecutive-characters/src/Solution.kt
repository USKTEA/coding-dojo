class Solution {
    fun solve(letters: String, consecutive: Int): String {
        var result = letters
        var left = 0

        while (left <= result.lastIndex) {
            val current = result[left]
            var right = left
            var count = 0

            while (right <= result.lastIndex && current == result[right] ) {
                count += 1
                right += 1
            }

            if (count == consecutive) {
                result = result.substring(0, left) + result.substring(right)

                continue
            }

            left = right
        }

        return result
    }
}
