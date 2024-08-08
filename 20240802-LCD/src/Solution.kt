import kotlin.math.max
import kotlin.math.min

class Solution {
    //30, 12 => 5

    fun cpFact(num: Int, coprime: Int): Int {
        var num = num
        var gcd = gcd(num, coprime)
        while (gcd != 1) {
            num /= gcd
            gcd = gcd(num, gcd)
        }

        return num
    }

    fun getDividers(number: Int): List<Int> = buildList {
        var divider = 1

        while(divider <= number / 2) {
            if (number % divider == 0) {
                add(divider)
            }

            divider += 1
        }

        add(number)
    }

    tailrec fun gcd(number1: Int, number2: Int): Int {
        val max = max(number1, number2)
        val min = min(number1, number2)
        if (min == 0) return max

        return gcd(min, max % min)
    }
}
