class Solution {
    //2, 3, 3, => 2
    //x를 n만큼 제곱하고 % d 한다
    //2 * 2 * 2 => 2의 3제곱
    //2 * 2 * 2 * 2 => 2의 4제곱
    fun pow(x: Int, n: Int, d: Int): Int {
        if (d == 1) {
            return 0
        }

        val searched = search(x.toLong(), n.toLong(), d.toLong())

        return (((searched % d) + d) % d).toInt()
    }

    fun search(x: Long, n: Long, d: Long): Long {
        val modX = ((x % d) + d) % d

        if (n == 0L) {
            return 1
        }

        val half =  search(modX, n / 2, d)

        if (n % 2 != 0L) {
            return (half * half * modX) % d
        }

        return half * half
    }
}
