class Solution {
    fun power(number: String): Int {
        if (number == "1") {
            return 0
        }

        var current = number

        while (current != "1") {
            if (current == "0") {
                return 0
            }

            var index = 0
            var last = 0
            var temp = ""

            while (index <= current.lastIndex) {
                val currentNumber = (last * 10) + Character.getNumericValue(current[index])

                if (currentNumber % 2 == 1 && index != current.lastIndex) {
                    return 0
                }

                last = if (currentNumber % 2 == 1) 1 else 0

                if (index > 0 || currentNumber / 2 != 0) {
                    temp += currentNumber / 2
                }

                index += 1
            }

            if (last == 1) {
                return 0
            }

            current = temp
        }

        return 1
    }
}
