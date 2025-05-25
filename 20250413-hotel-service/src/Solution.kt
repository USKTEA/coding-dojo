import java.util.ArrayList
import kotlin.math.abs

class Solution {
    //호텔 위치가 담겨진 2차원 배열 hotelMap과 현재 위치가 담긴 2차원 배열 positions가 주어졌을 때 각 position에 대해 가장 가까운 위치에 있는 Hotel과의 거리를 계산한 distances 배열을 반환해라
    //hotelMap 배열의 각 요소는 0 또는 1로 이루어져있고 0은 빈 곳 1은 호텔이 있다는 의미이다
    //position은 1부터 시작한다. 시작위치는 (1, 1), 호텔의 위치가 1, 1에 있고 position이 2, 1일 경우 거리는 1이다
    //거리 계산 공식은 abs(x-x1) + abs(y-y1)
    //Try라는 객체를 만든다. Try는 시작위치 (poistion)과 현재위치 (x, y)를 가진다 hotelMap[x, y]가 1이 아닐 경우 상하좌우로 이동할 수 있다
    //상하좌우의 범위는 1 <= M,N 그리고 방문하지 않았던 위치
    //근데 모든 hotelMap을 순회할 필요는 없지 않나?
    //만약 찾은 hotelMap이 있을 때 xy 좌표가 현재 xy 좌표 보다 작다면 지워도 될 듯?
    //[[0, 0, 0]  [[1, 1]]
    // [0, 1, 0]
    // [1, 0, 0]]
    //그럼 초기값은 M과 N 중 제일 큰 값
    //Visited, 0< 현재위치 <= M, N
    fun nearestHotel(hotelMap: ArrayList<ArrayList<Int>>, positions: ArrayList<ArrayList<Int>>): ArrayList<Int> {
        val visitors = positions.map { position ->
            Visitor(
                startPosition = Coordinate(y = position[0] - 1, x = position[1] - 1),
                hotelMap = hotelMap,
            )
        }

        visitors.forEach { visitor ->
            visitor.findNearestHotelDistance()
        }

        return ArrayList(visitors.map { it.nearestHotelDistance })
    }
}

class Visitor(
    private val startPosition: Coordinate,
    private var currentPosition: Coordinate = startPosition,
    private val hotelMap: ArrayList<ArrayList<Int>>,
    private val visited: MutableList<Coordinate> = mutableListOf(),
    private val toVisit: MutableList<Coordinate> = mutableListOf(),
) {
    var nearestHotelDistance: Int = Int.MAX_VALUE

    fun findNearestHotelDistance() {
        if (arrived()) {
            val distance = calculateDistance()

            nearestHotelDistance = minOf(distance, nearestHotelDistance)

            return
        }

        visited.add(currentPosition)

        val toVisits = getToVisits()

        toVisit.addAll(toVisits)

        if (toVisit.isEmpty()) {
            return
        }

        currentPosition = toVisit.removeFirst()

        return findNearestHotelDistance()
    }

    private fun getToVisits(): List<Coordinate> {
        return setOf(
            Coordinate(x = currentPosition.x - 1, y = currentPosition.y),
            Coordinate(x = currentPosition.x, y = currentPosition.y - 1),
            Coordinate(x = currentPosition.x + 1, y = currentPosition.y),
            Coordinate(x = currentPosition.x, y = currentPosition.y + 1),
        ).filter { inTheBoundary(it) && notVisited(it) && worthToVisit(it) }
    }

    private fun worthToVisit(coordinate: Coordinate): Boolean {
        return nearestHotelDistance > abs(startPosition.x - coordinate.x) + abs(startPosition.y - coordinate.y)
    }

    private fun notVisited(coordinate: Coordinate): Boolean {
        return !visited.contains(coordinate)
    }

    private fun inTheBoundary(coordinate: Coordinate): Boolean {
        return (coordinate.x >= 0 && coordinate.y >= 0) && (coordinate.x < hotelMap[0].size && coordinate.y < hotelMap.size)
    }

    private fun calculateDistance(): Int {
        return abs(startPosition.y - currentPosition.y) + abs(startPosition.x - currentPosition.x)
    }

    private fun arrived(): Boolean {
        return hotelMap[currentPosition.y][currentPosition.x] == 1
    }
}

data class Coordinate(
    val x: Int,
    val y: Int,
)
