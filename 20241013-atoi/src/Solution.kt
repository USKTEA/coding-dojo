import java.math.BigInteger

class Solution {
    //문자를 Int로 반환하는 함수 atoi를 구현하라
    //문자는 여러 규칙을 가질 수 있고 유효하지 않는 Char를 포함할 수 있다
    //문자를 파싱하는 도중 유효하지 않는 Char를 만나면 여태까지 파싱한 결과를 반환한다
    //만약 파싱한 결과가 없다면 0을 반환한다
    //만약 결과가 오버플로우 된다면 음수인 경우 INT.MIN 양수인 경우 INT.MAX를 반환한다
    //- 또는 +는 파싱한 결과가 없을 때만 유효하고 각각 양수 또는 음수를 나타낸다
    //- 또는 + 뒤에는 무조건 숫자가 있어야 한다 아닐 경우 0을 반환한다
    //결과 값은 *10 + char.toInt() 하면 된다
    fun atoi(number: String): Int {
        var result: String? = null
        var left = 0
        var sign: Long = 0

        while (left < number.length) {
            val current = number[left]

            if (result == null) {
                if (current == ' ' && sign == 0L) {
                    left += 1
                    continue
                }

                if (current == '+') {
                    if (sign != 0L) {
                        return resultToInt(result, sign)
                    }

                    left += 1
                    sign += 1
                    continue
                }

                if (current == '-') {
                    if (sign != 0L) {
                        return resultToInt(result, sign)
                    }

                    left += 1
                    sign -= 1
                    continue
                }
            }

            if (current !in '0'..'9') {
                return resultToInt(result, sign)
            }

            if (result == null) {
                result = current.toString()
            } else {
                result += current.toString()
            }

            left += 1
        }

        return resultToInt(result, sign)
    }

    private fun resultToInt(number: String?, sign: Long): Int {
        if (number == null) {
            return 0
        }
        val correctSign = if (sign == 0L) 1L else sign

        val threshold = Int.MAX_VALUE / 10
        var result = 0

        for (digit in number) {
            val d = digit - '0'
            if (result > threshold || (result == threshold && d > 7)) {
                if (correctSign > 0) {
                    return Int.MAX_VALUE
                }

                return Int.MIN_VALUE
            }

            result = result * 10 + d
        }

        // 최종 부호 적용 및 오버플로우 체크
        if (correctSign > 0 && result < 0) {
            return Int.MAX_VALUE
        }
        if (correctSign < 0 && -result > 0) {
            return Int.MIN_VALUE
        }

        return (result * correctSign).toInt()
    }
}
