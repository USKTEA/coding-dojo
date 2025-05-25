class Solution {
    //2차원 배열 hotelMap과 2차원 배열 positions가 주어졌을 때 호텔에서 position 까지 가장 거리 중 가장 가까운 거리만 기록하라.
    //이동은 상하좌우로 움직일 수 있다 (0, 1) (0, -1), (1, 0), (-1, 0)
    //이동은 0, 0 그리고 hotelMap을 벗어나지 못한다
    //여러 경로에서 동일한 좌표에 도착했을 때 가장 가까운 값만 저장한다.
    //지도를 탐방하는 Visitor를 hotelMap을 이용해 생성한다.
    //각 호텔의 위치는 0과 1로 판단할 수 있고 만약 호텔이라면 0 나머지는 Int.Max
    fun nearestHotel(hotelMap: ArrayList<ArrayList<Int>>, positions: ArrayList<ArrayList<Int>>): ArrayList<Int> {
        val visitor = Visitor(hotelMap)

        visitor.visit()

        val distanceMap = visitor.distanceMap()
        val result = ArrayList(positions.map { position ->
            distanceMap[position[0] - 1][position[1] - 1]
        })

        return result
    }
}

class Visitor(
    private val hotelMap: ArrayList<ArrayList<Int>>,
) {
    private val distanceMap: MutableList<MutableList<Int>> = hotelMap.mapIndexed { y, row ->
        row.mapIndexed { x, value ->
            if (hotelMap[y][x] == 1) {
                return@mapIndexed 0
            }

            return@mapIndexed Int.MAX_VALUE
        }.toMutableList()
    }.toMutableList()

    private val toVisits = hotelMap.flatMapIndexed { y, row ->
        row.mapIndexedNotNull { x, value ->
            if (hotelMap[y][x] == 1) {
                return@mapIndexedNotNull Coordinate(x, y)
            }

            return@mapIndexedNotNull null
        }
    }.toMutableList()

    private val directions = listOf(
        Coordinate(0, 1),
        Coordinate(0, -1),
        Coordinate(1, 0),
        Coordinate(-1, 0),
    )

    fun visit() {
        while (toVisits.isNotEmpty()) {
            val currentCoordinate = toVisits.removeFirst()
            val currentDistance = distanceMap[currentCoordinate.y][currentCoordinate.x]

            directions.forEach { direction ->
                val nextX = currentCoordinate.x + direction.x
                val nextY = currentCoordinate.y + direction.y

                if (isInBoundary(nextX, nextY) && worthToVisit(nextX, nextY, currentDistance)) {
                    toVisits.add(Coordinate(nextX, nextY))
                    distanceMap[nextY][nextX] = currentDistance + 1
                }
            }
        }
    }

    private fun worthToVisit(nextX: Int, nextY: Int, currentDistance: Int): Boolean {
        return distanceMap[nextY][nextX] > currentDistance + 1
    }

    private fun isInBoundary(x: Int, y: Int): Boolean {
        return x in hotelMap[0].indices && y in hotelMap.indices
    }

    fun distanceMap(): List<List<Int>> {
        return distanceMap
    }

    fun toVisits(): List<Coordinate> {
        return toVisits
    }
}

data class Coordinate(val x: Int, val y: Int)
