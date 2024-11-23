class Solution {
    fun countAndSay(number: Int, countedNumber: String = ""): String {
        if (number == 0) {
            return countedNumber
        }

        val nextNumber = number - 1

        if (number < 0) {
            return "1"
        }

        if (countedNumber == "") {
            return countAndSay(
                number = nextNumber,
                countedNumber = "1"
            )
        }

        return countAndSay(
            number = nextNumber,
            countedNumber = countNumber(countedNumber)
        )
    }

    fun countNumber(toCount: String): String {
        var left = 0
        var right = 0
        var counted = ""

        while (left <= toCount.lastIndex) {
            val current = toCount[left]
            var count = 0

            while (right <= toCount.lastIndex && current == toCount[right]) {
                count += 1
                right += 1
            }

            left = right
            right = left
            counted += "$count$current"
        }

        return counted
    }
}
