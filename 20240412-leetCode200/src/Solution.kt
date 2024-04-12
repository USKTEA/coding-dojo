class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val fields = grid.mapIndexed { y, chars ->
            chars.mapIndexed { x, c -> Field(value = c, x = x, y = y) }.toMutableList()
        }.toMutableList()

        val islands: MutableList<MutableList<Field>> = mutableListOf()

        for (i: Int in fields.indices) {
            for (j: Int in fields[i].indices) {
                val fields = getIsland(j, i, fields)

                if (fields.isNotEmpty()) {
                    islands.add(fields)
                }
            }
        }

        return islands.size
    }

    fun getIsland(
        x: Int,
        y: Int,
        fields: MutableList<MutableList<Field>>,
        island: MutableList<Field> = mutableListOf()
    ): MutableList<Field> {
        val yLimit = fields.size - 1
        val xLimit = fields[0].size - 1

        if (x > xLimit || x < 0) {
            return island
        }

        if (y > yLimit || y < 0) {
            return island
        }

        val field = fields[y][x]

        if (field.value == '0' || field.traversed) {
            return island
        }

        field.traversed = true
        island.add(field)

        getIsland(x + 1, y, fields, island)
        getIsland(x - 1, y, fields, island)
        getIsland(x, y + 1, fields, island)
        getIsland(x, y - 1, fields, island)

        return island
    }
}

data class Field(
    val value: Char,
    val x: Int,
    val y: Int,
    var traversed: Boolean = false,
)
