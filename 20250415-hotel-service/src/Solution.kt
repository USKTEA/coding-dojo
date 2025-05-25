import java.util.*

class Solution {
    fun nearestHotel(hotelMap: ArrayList<ArrayList<Int>>, positions: ArrayList<ArrayList<Int>>): ArrayList<Int> {
        val distance = Array(hotelMap.size) { IntArray(hotelMap.first().size) { Int.MAX_VALUE } }
        val hotels = findHotelCoordinates(hotelMap)

        initializeDistances(hotels, distance)

        val mapper = Mapper(distance, hotels)

        mapper.startMapping()

        return ArrayList(positions.map { pos ->
            val y = pos[0] - 1
            val x = pos[1] - 1
            distance[y][x]
        })
    }
    private fun findHotelCoordinates(hotelMap: ArrayList<ArrayList<Int>>): MutableList<Coordinate> {
        val result = mutableListOf<Coordinate>()
        hotelMap.forEachIndexed { y, row ->
            row.forEachIndexed { x, c ->
                if (c == 1) {
                    result.add(Coordinate(x, y))
                }
            }
        }
        return result
    }

    private fun initializeDistances(hotels: List<Coordinate>, distance: Array<IntArray>) {
        hotels.forEach { coord ->
            distance[coord.y][coord.x] = 0
        }
    }
}

data class Coordinate(val x: Int, val y: Int)
