class Mapper(
    private val distances: Array<IntArray>,
    private val positions: MutableList<Coordinate>
) {
    private val directions = listOf(
        Coordinate(-1, 0),
        Coordinate(1, 0),
        Coordinate(0, -1),
        Coordinate(0, 1)
    )

    fun startMapping() {
        while (positions.isNotEmpty()) {
            val step = positions.removeFirst()
            val currentDistance = distances[step.y][step.x]

            directions.forEach { direction ->
                val nextX = step.x + direction.x
                val nextY = step.y + direction.y

                if (inBoundary(nextX, nextY) && distances[nextY][nextX] > currentDistance + 1) {
                    distances[nextY][nextX] = currentDistance + 1
                    positions.add(Coordinate(nextX, nextY))
                }
            }
        }
    }

    private fun inBoundary(nextX: Int, nextY: Int): Boolean {
        return nextX in distances[0].indices && nextY in distances.indices
    }
}
