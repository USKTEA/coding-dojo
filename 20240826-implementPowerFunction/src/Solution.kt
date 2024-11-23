class Solution {
    //2, 3, 3 => 2

    fun pow(x: Int, n: Int, d: Int): Int {
        if (d == 1) {
            return 0
        }

        val result = powerMod(x, n, d)

        return (((result % d) + d) % d)
    }

    private fun powerMod(x: Int, n: Int, d: Int): Int {  // 반환 타입을 Long으로 변경
        val modX = ((x % d) + d) % d

        if (n == 0) {
            return 1
        }

        val half = powerMod(modX, n / 2, d)

        if (n % 2 != 0) {
            return (half * half * modX % d) % d
        }

        return (half * half) % d
    }
}
