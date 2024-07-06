class Solution {
    //[1, 0, 0, 0, 1], 1 => true
    //[1, 0, 0, 0, 1], 2 => false
    fun canPlaceFlowers(flowerbed: IntArray, flower: Int): Boolean {
        val mapped = mapBedInUse(flowerbed)

        val remains = plants(mapped, flower)


        if (remains == 0) {
            return true
        }

        return false
    }

    fun plants(mapped: IntArray, flower: Int): Int {
        var index = 0
        var remain = flower

        while (remain > 0 && index <= mapped.lastIndex) {
            if (mapped[index] == 0) {
                if (index - 1 >= 0) {
                    mapped[index - 1] = 1
                }

                mapped[index] = 1

                if (index < mapped.lastIndex) {
                    mapped[index + 1] = 1
                }

                remain -= 1
                index += 2

                continue
            }

            index += 1
        }

        return remain
    }

    fun mapBedInUse(flowerbed: IntArray): IntArray {
        val usedIndex = mutableSetOf<Int>()

        flowerbed.forEachIndexed { index, inUse ->
            if (inUse == 1) {
                if (index - 1 >= 0) {
                    usedIndex.add(index - 1)
                }

                usedIndex.add(index)

                if (index <= flowerbed.lastIndex) {
                    usedIndex.add(index + 1)
                }
            }
        }

        return flowerbed.mapIndexed { index, i ->
            if (usedIndex.contains(index)) {
                return@mapIndexed 1
            }

            return@mapIndexed 0
        }.toIntArray()
    }
}
