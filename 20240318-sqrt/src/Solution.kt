class Solution {
    //4 => 2
    //  2 * 2 == 4 stop return 2
    //8 => 2
    //  2 * 2 < 8
    //  3 * 3 > 8 stop return 2
    fun mySqrt(x: Int, current: Int = 2): Int {
        if (x == 0) {
            return 0
        }

        if (x <= 3) {
            return 1
        }

        for (i: Long in current.toLong()..x) {
            val powered = i * i

            if (powered == x.toLong()) {
                return i.toInt()
            }

            if (powered > x.toLong()) {
                return i.toInt() - 1
            }
        }

        return 0
    }
}
