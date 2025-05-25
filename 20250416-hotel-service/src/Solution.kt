import java.util.ArrayList

class Solution {
    //hotel에서 부터 position까지 거리를 구한다
    //2차원 배열 hotelMap에서 요소의 값으 1이면 호텔이 있다는 것
    //hotel을 시작점으로 각 position까지 거리가 얼마나 있는지 구한다
    fun nearestHotel(hotelMap: ArrayList<ArrayList<Int>>, positions: ArrayList<ArrayList<Int>>): ArrayList<Int> {
        val toVisits = calculateToVisits(hotelMap)
        val distanceMap = getDistanceMap(hotelMap)
        val visitor = Visitor(distanceMap)

        visitor.visitAll(toVisits)

        return ArrayList(positions.map { position -> distanceMap[position[0] - 1][position[1] - 1] })
    }

    private fun getDistanceMap(hotelMap: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        return ArrayList(hotelMap.map { row ->
            ArrayList(
                row.map { element ->
                    if (element == 1) {
                        return@map 0
                    }

                    return@map Integer.MAX_VALUE
                }
            )
        })
    }

    private fun calculateToVisits(hotelMap: ArrayList<ArrayList<Int>>): List<Coordinate> {
        return hotelMap.flatMapIndexed { y, row ->
            row.mapIndexedNotNull { x, element ->
                if (element == 1) {
                    return@mapIndexedNotNull Coordinate(x, y)
                }

                return@mapIndexedNotNull null
            }
        }
    }
}

class Visitor(
    private val distanceMap: ArrayList<ArrayList<Int>>,
) {
    private val toVisits = ArrayDeque<Coordinate>()
    private val directions = listOf(
        Coordinate(0, 1),
        Coordinate(0, -1),
        Coordinate(1, 0),
        Coordinate(-1, 0),
    )

    fun visitAll(coordinates: List<Coordinate>) {
        toVisits.addAll(coordinates)

        while (toVisits.isNotEmpty()) {
            val coordinate = toVisits.removeFirst()

            directions.forEach { direction ->
                val nextX = coordinate.x + direction.x
                val nextY = coordinate.y + direction.y
                val currentDistance = distanceMap[coordinate.y][coordinate.x]

                if (inBoundary(nextX, nextY) && worthToVisit(nextX, nextY, currentDistance)) {
                    distanceMap[nextY][nextX] = currentDistance + 1
                    toVisits.add(Coordinate(nextX, nextY))
                }
            }

        }
    }

    private fun inBoundary(x: Int, y: Int): Boolean {
        return x in (distanceMap[0].indices) && y in (distanceMap.indices)
    }

    private fun worthToVisit(x: Int, y: Int, currentDistance: Int): Boolean {
        return distanceMap[y][x] > currentDistance + 1
    }
}

data class Coordinate(
    val x: Int,
    val y: Int
)
