class Solution {
    fun countAndSay(toCount: Int, counted: String = ""): String {
        if (toCount == 0) {
            return counted
        }
        if (toCount < 0) {
            return "1"
        }
        return countAndSay(toCount = toCount - 1, counted = count(counted))
    }

    fun count(counted: String): String {
        if (counted == "") {
            return "1"
        }
        var right = 0

        return buildString {
            while (right <= counted.lastIndex) {
                val currentNumber = counted[right]
                val start = right
                while (right <= counted.lastIndex && currentNumber == counted[right]) {
                    right += 1
                }
                append(right - start)
                append(currentNumber)
            }
        }
    }
}
