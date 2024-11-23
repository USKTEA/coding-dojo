class Solution {
    //abcba
    //양끝머리에서 검사를 시작한다
    fun solve(letters: String): Int {
        var left = 0
        var right = letters.lastIndex

        while (left <= right) {
            if (letters[left] == letters[right]) {
                left += 1
                right -= 1

                continue
            }

            val isPalindrome = check(
                letters = letters,
                left = left + 1,
                right = right,
            ) || check(
                letters = letters,
                left = left,
                right = right - 1,
            )

            if (!isPalindrome) {
                return 0
            }

            return 1
        }

        return 1
    }

    fun check(letters: String, left: Int, right: Int): Boolean {
        var currentLeft = left
        var currentRight = right

        while (currentLeft < currentRight) {
            if (letters[currentLeft] == letters[currentRight]) {
                currentLeft += 1
                currentRight -= 1

                if (currentLeft == letters.length || currentRight == -1) {
                    return true
                }

                continue
            }

            return false
        }

        return true
    }
}
