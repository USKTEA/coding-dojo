import kotlin.math.abs

class Solution {

    fun maxPoints(ys: ArrayList<Int>, xy: ArrayList<Int>): Int {
        val n = ys.size

        if (n <= 2) {
            return n
        }

        val points = ys.zip(xy) { y, x -> Point(y, x) }
        var maxPoints = 1

        for (i in points.indices) {
            val basePoint = points[i]
            val slopeCount = mutableMapOf<Slope, Int>()
            var duplicates = 0

            for (j in points.indices) {
                if (i == j) {
                    continue
                }

                val currentPoint = points[j]

                if (basePoint.x == currentPoint.x && basePoint.y == currentPoint.y) {
                    duplicates += 1
                    continue
                }

                val dx = currentPoint.x - basePoint.x
                val dy = currentPoint.y - basePoint.y

                val slope = Slope.create(dx, dy)

                slopeCount[slope] = slopeCount.getOrDefault(slope, 0) + 1
            }

            maxPoints = maxOf(maxPoints, slopeCount.values.max() + duplicates + 1)
        }

        return maxPoints
    }
}

data class Point(val y: Int, val x: Int)

data class Slope(val numerator: Int, val denominator: Int) {
    companion object {
        fun create(dx: Int, dy: Int): Slope {
            if (dx == 0) {
                return Slope(1, 0)
            }

            if (dy == 0) {
                return Slope(0, 1)
            }

            val gcd = gcd(abs(dx), abs(dy))
            val normalizedDx = dx / gcd
            val normalizedDy = dy / gcd

            if (normalizedDx < 0) {
                return Slope(-normalizedDy, -normalizedDx)
            }

            return Slope(normalizedDy, normalizedDx)
        }

        private fun gcd(a: Int, b: Int): Int {
            if (b == 0) {
                return a
            }

            return gcd(b, a % b)
        }
    }
}
