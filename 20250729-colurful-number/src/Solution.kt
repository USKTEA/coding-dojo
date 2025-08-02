import java.math.BigInteger

class Solution {
    //숫자의 모든 부분수열의 곱이 모두 다르다면 1, 하나라도 같다면 0을 반환한다
    //부분수열의 길이는 1 ~ number.size -1
    //makeSubsequenceProduct(1)
    //result.add() = false return false return true
    //until number.lastIndex

    fun colorful(numbers: Int): Int {
        val result = mutableSetOf<BigInteger>()

        return checkIfColorful(1, numbers.toString(), result)
    }

    private fun checkIfColorful(
        subsequenceSize: Int,
        numbers: String,
        result: MutableSet<BigInteger>,
    ): Int {
        if (subsequenceSize > numbers.length) {
            return 1
        }

        var currentIndex = 0
        var numberAdded = 0
        val subsequence = mutableListOf<BigInteger>()

        while (currentIndex + subsequenceSize - 1 <= numbers.lastIndex) {
            while (subsequenceSize != numberAdded) {
                val currentNumber = numbers[currentIndex]

                subsequence.add(BigInteger.valueOf(Character.getNumericValue(currentNumber).toLong()))
                numberAdded += 1
                currentIndex += 1
            }

            val product = subsequence.fold(BigInteger.ONE) { acc, i -> acc * i }

            val added = result.add(product)

            if (!added) {
                return 0
            }

            while (numberAdded != 0) {
                subsequence.removeLast()
                numberAdded -= 1
                currentIndex -= 1
            }

            currentIndex += 1
        }

        return checkIfColorful(subsequenceSize + 1, numbers, result)
    }
}
