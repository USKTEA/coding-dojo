class Solution {
    //2, 3, 3 => 2
    //power를 구현하고 나머지를 구한다
    //d가 1이라면 값은 0이다
    //나머지의 값은 음수가 되면 안된다
    //3의 3제곱은 3 * 3^2이다
    //3의 4제곱은 3^2 * 3^2이다
    fun pow(x: Int, n: Int, d: Int): Int {
        if (d == 1) {
            return 0
        }

        return search(x.toLong(), n, d).toInt()
    }

    private fun search(x: Long, n: Int, d: Int): Long {
        if (n == 0) {
            return 1
        }

        val modX = nonNegativeMod(x, d)

        val half = search(modX, n / 2, d)

        if (n % 2 == 1) {
            return ((half * half) % d) * (modX % d) % d
        }

        return (half * half) % d
    }

    fun nonNegativeMod(number: Long, divisor: Int): Long {
        return ((number % divisor) + divisor) % divisor

    }
}
