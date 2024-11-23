import java.math.BigInteger

class Solution {
    //문자열이 주어졌을 때 정수로 변환해서 반환하는 함수를 구현한다
    //가장 처음 문자가 -일 경우 숫자는 마이너스가 된다
    //- 뒤에는 무조건 숫자가 있어야 한다. - 뒤의 문자가 숫자가 아닐 경우 0을 반환한다
    //가장 처음 문자가 -을 제외한 다른 숫자가 아닌 문자일 경우 0을 반환한다
    //문자열을 순회하다 숫자가 아닌 문자를 만나면 여태까지의 결과를 반환한다
    //결과가 정수보다 클 때 INT_MAX 또는 INT_MIN을 반환한다

    fun atoi(number: String): Int {
        var sign: Char? = null
        var index = 0
        var result = ""

        while (index <= number.lastIndex) {
            val currentCharacter = number[index]

            if (sign != null && !currentCharacter.isNumeric()) {
                return calculate(result, sign)
            }

            if (result.isEmpty() && !currentCharacter.isNumeric()) {
                if (currentCharacter == '-' || currentCharacter == '+') {
                    sign = currentCharacter
                    index += 1
                    continue
                }

                if (currentCharacter == ' ') {
                    index += 1
                    continue
                }

                return calculate(result, sign)
            }

            if (!currentCharacter.isNumeric()) {
                return calculate(result, sign)
            }

            result += Character.getNumericValue(currentCharacter)
            index += 1
        }


        return calculate(result, sign)
    }

    private fun calculate(result: String, sign: Char?): Int {
        if (result.isEmpty()) {
            return 0
        }

        if (sign == null || sign == '+') {
            if (BigInteger(result) > BigInteger.valueOf(Int.MAX_VALUE.toLong())) {
                return Int.MAX_VALUE
            }

            return result.toInt()
        }

        if (BigInteger(result) > BigInteger.valueOf(Int.MAX_VALUE.toLong()).plus(BigInteger.ONE)) {
            return Int.MIN_VALUE
        }

        return result.toInt() * -1
    }
}

private fun Char.isNumeric(): Boolean {
    return this in '0'..'9'
}
