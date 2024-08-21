class Solution {
    //[[1], [2], [3], []] => true
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val visited = getVisitedRooms(rooms)

        visit(
            rooms = rooms,
            key = 0,
            visited = visited
        )

        return visited.all { it }
    }

    private fun visit(rooms: List<List<Int>>, key: Int, visited: MutableList<Boolean>) {
        if (visited[key]) {
            return
        }

        visited[key] = true

        for (key in rooms[key]) {
            visit(rooms, key, visited)
        }
    }

    fun getVisitedRooms(rooms: List<List<Int>>): MutableList<Boolean> {
        return rooms.map { false }.toMutableList()
    }
}
