class Solution {
    fun power(number: String): Int {
        if (number == "0") {
            return 1
        }

        if (number == "1") {
            return 0
        }

        var currentNumber = number

        while (currentNumber.length > 1) {
            var index = 0
            var last = 0
            var tempResult = ""
            while (index <= currentNumber.lastIndex) {
                val toDivide = last * 10 + Character.getNumericValue(currentNumber[index])

                if (toDivide % 2 == 0) {
                    last = 0
                }

                if (toDivide % 2 != 0) {
                    last = 1
                }

                if (toDivide / 2 >= 1 || (index != 0)) {
                    tempResult += toDivide / 2
                }

                index += 1
            }

            if (Character.getNumericValue(tempResult.last()) % 2 != 0) {
                return 0
            }

            currentNumber = tempResult
        }

        var currentNumberInt = currentNumber.toInt()

        while (currentNumberInt != 1) {
            if (currentNumberInt % 2 != 0) {
                return 0
            }

            currentNumberInt /= 2
        }

        return 1
    }
}
