class Solution {
    //1 => 10
    //2 => 20
    //3131 => 136006598
    //dials = list(list(1, 2, 3), (3, 4, 5), (7, 8, 9), (*, 0, #))
    //knight.move()
    //+2, +1 => 5
    //+2, -1 => -1
    //-2. +1 => 1
    //-2, -1 => -5
    //-1, +2 => +5
    //+1, +2 => +6
    //+1, +2 => +6
    //-1, +2 => +5
    //checkCanMove()
    fun knightDialer(n: Int): Int {
        val knights = getKnights()
        knights.forEach { it.move(n) }

        return 0
    }

    private fun getKnights(): List<Knight> {
        val dials = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

        return dials.mapNotNull {
            if (it == 10 || it == 12) {
                return@mapNotNull null
            }

            Knight(
                currentNumber = it,
                numbers = mutableListOf(it.toString())
            )
        }
    }
}

data class Knight(
    val currentNumber: Int,
    var moved: Int = 1,
    val numbers: MutableList<String> = mutableListOf()
) {
    val moveList = listOf(-7, -5, +7, +5, +1, -1)
    fun move(n: Int) {
        if (moved == n) {
            return
        }

        val nexts = moveList
            .map { it + currentNumber }
            .filterNot {
                if (it >= 12 || it < 1) {
                    return@filterNot true
                }

                if (it == 10 || it == 12) {
                    return@filterNot true
                }

                false
            }

        println(nexts)
    }
}
