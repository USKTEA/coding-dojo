class KeysAndRooms {
    //[[1], [2], [3], []] => true
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val visited =  BooleanArray(rooms.size) { false }

        visit(rooms, visited, 0)

        return visited.all { it }
    }

    private fun visit(rooms: List<List<Int>>, visited: BooleanArray, key: Int) {
        if (visited[key]) {
            return
        }

        visited[key] = true

        rooms[key].forEach { roomKey ->
            visit(rooms, visited, roomKey)
        }
    }
}
