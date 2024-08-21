class Solution {
    //[[0, 1], [1, 3], [2, 3], [4, 0], [4, 5]] => 3
    fun minReorder(n: Int, connections: Array<IntArray>): Int {
        val visited = visited(n)
        var count = 0
        var graph = Array(n) { mutableListOf<Pair<Int, Boolean>>() }

        for (connection in connections) {
            graph[connection[0]].add(Pair(connection[1], true))
            graph[connection[1]].add(Pair(connection[0], false))
        }

        fun dfs(city: Int) {
            visited[city] = true

            for ((city, origin) in graph[city]) {
                if (!visited[city]) {
                    if (origin) {
                        count += 1
                    }
                    dfs(city)
                }
            }
        }

        dfs(0)

        return count
    }

    fun visited(n: Int): BooleanArray {
        return BooleanArray(n) { false }
    }
}
