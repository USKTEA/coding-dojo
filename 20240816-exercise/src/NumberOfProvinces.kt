class NumberOfProvinces {
    //[[1, 1, 0], [1, 1, 0], [0, 0, 1]] => 2
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val visited = BooleanArray(isConnected.size) { false }
        var provinces = 0

        isConnected.forEachIndexed { city, cities ->
            if (!visited[city]) {
                visit(isConnected, visited, cities, city)
                provinces += 1
            }
        }

        return provinces
    }

    private fun visit(connected: Array<IntArray>, visited: BooleanArray, cities: IntArray, city: Int) {
        visited[city] = true

        cities.forEachIndexed { index, city ->
            if (city == 1 && !visited[index]) {
                visit(connected, visited, connected[index], index)
            }
        }
    }
}
