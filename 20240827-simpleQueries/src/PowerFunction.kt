class PowerFunction {
    fun pow(x: Int, n: Int, d: Int): Int {
        if (d == 1) {
            return 0
        }

        return powMod(x, n ,d)
    }

    private fun powMod(x: Int, n: Int, d: Int): Int {
        if (n == 0) {
            return 1
        }

        val modX = (((x % d) + d) % d).toLong()
        val half = powMod(modX.toInt(), n / 2, d)

        if (n % 2 == 0) {
            return half * half % d
        }

        return ((half * half * modX % d) % d).toInt()
    }
}
