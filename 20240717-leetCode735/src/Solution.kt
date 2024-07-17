class Solution {
    //[5, 10, -5] => [5, 10]
    //[8, -8] => []
    //[10, 2, -5] => [10]
    fun asteroidCollision(asteroids: IntArray): IntArray {
        return asteroids.fold(ArrayDeque<Int>()) { acc, asteroid ->
            if (asteroid >= 0) {
                acc.addLast(asteroid)

                return@fold acc
            }

            if (acc.isNotEmpty()) {
                var last = acc.last()

                while (last < asteroid * -1 && last >= 0) {
                    acc.removeLast()

                    if (acc.isEmpty()) {
                        acc.addLast(asteroid)

                        return@fold acc
                    }

                    last = acc.last()
                }

                if (acc.last() > asteroid * -1) {
                    return@fold acc
                }

                if (acc.last() == asteroid * -1) {
                    acc.removeLast()
                    return@fold acc
                }

                acc.addLast(asteroid)

                return@fold acc
            }

            acc.addLast(asteroid)
            acc
        }.toIntArray()
    }
}
