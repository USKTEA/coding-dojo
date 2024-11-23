class Solution {
    fun solve(letters: String): Int {
        var left = 0
        var right = letters.lastIndex

        while (left <= right) {
            if (letters[left] == letters[right]) {
                left += 1
                right -= 1

                continue
            }

            val isPalindrome = checkPalindrome(
                letters = letters,
                left = left + 1,
                right = right
            ) || checkPalindrome(
                letters = letters,
                left = left,
                right = right - 1
            )

            if (!isPalindrome) {
                return 0
            }

            return 1
        }

        return 1
    }

    fun checkPalindrome(letters: String, left: Int, right: Int): Boolean {
        var currentLeft = left
        var currentRight = right

        while (currentLeft <= currentRight) {
            if (letters[currentLeft] == letters[currentRight]) {
                currentLeft += 1
                currentRight -= 1

                continue
            }

            return false
        }

        return true
    }
}
