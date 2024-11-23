class Solution {
    fun solve(letters: String): Int {
        var left = 0
        var right = letters.lastIndex
        var removed = false

        while (left <= right) {
            println(left)
            println(right)
            println("==")
            if (left == right && !removed) {
                removed = true
            }

            if (letters[left] == letters[right]) {
                left += 1
                right -= 1

                continue
            }

            if (removed) {
                return 0
            }

            if (letters[left] == letters[right - 1]) {
                right -= 1
                removed = true

                continue
            }

            if (letters[right] == letters[left + 1]) {
                left += 1
                removed = true

                continue
            }

            return 0
        }

        if (removed) {
            return 1
        }

        return 0
    }
}
