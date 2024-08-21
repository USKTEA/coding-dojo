class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val visited = BooleanArray(rooms.size) { false }

        dfs(rooms, 0, visited)

        return visited.all { it }
    }

    private fun dfs(rooms: List<List<Int>>, currentRoom: Int, visited: BooleanArray) {
        if (visited[currentRoom]) {
            return
        }

        visited[currentRoom] = true

        for (key in rooms[currentRoom]) {
            dfs(rooms, key, visited)
        }
    }
}
