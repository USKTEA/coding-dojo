class Solution {
    //2.0, 10 => 1024.0
    //2.1, 3 => 9.2610
    //2.0, -2 => 0.25
    fun myPow(x: Double, n: Int): Double {
        if (n == 0) {
            return 1.0
        }

        if (n < 0) {
            return 1.0 / myPow(x, -1 * n)
        }

        if (n % 2 == 1) {
            return x * myPow(x * x, (n - 1) / 2)
        }

        return myPow(x * x, n / 2)
    }
}
