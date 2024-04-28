class Solution {
    //123 => 321
    //-123 => -321
    //120 => 21
    //1 => 1
    //10 => 1
    //-10 = > -1
    fun reverse(x: Int): Int {
        val numbers = getNumber(x)

        if (x > 0) {
            if (numbers > Integer.MAX_VALUE) {
                return 0
            }
        }

        if (x < 0) {
            if (numbers < Integer.MIN_VALUE) {
                return 0
            }
        }

        return numbers.toInt()
    }

    private fun getNumber(x: Int): Long {
        if (x >= 0) {
            return x.toString().reversed().toLong()
        }

        return x.toString().removeRange(0..0).reversed().toLong() * -1
    }
}
