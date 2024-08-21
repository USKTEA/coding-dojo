class Solution {
    //[[1, 1, 0], [1, 1, 0], [0, 0, 1]] => 2
    //2차원 배열의 첫 배열 중 첫 요소인 0, 0에서 방문한다
    //방문과 동시에 방문한 적이 있는지 확인하고 방문했다면 방문을 종료한다
    //방문하지 않았다면 방문 표시를 남기고 자신을 제외한 나머지를 방문 예정 목록에 넣는다
    //방문 예정 목록은 FILO이다
    //재귀적으로 방문 예정 목록을 통해 다른 요소를 방문한다.
    //방문할 때 방문한 애들의 좌표를 기록하고 반환한다
    //마지막으로 방문한 애들의 길이를 반환한다
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val visited = BooleanArray(isConnected.size) { false }
        var provinces = 0

        isConnected.forEachIndexed { city, connections ->
            if (!visited[city]) {
                dfs(isConnected, visited, city, connections)
                provinces += 1
            }
        }

        return provinces
    }

    private fun dfs(isConnected: Array<IntArray>, visited: BooleanArray, city: Int, connections: IntArray) {
        visited[city] = true
        connections.forEachIndexed { neighbor, connected ->
            if (connected == 1 && !visited[neighbor]) {
                dfs(isConnected, visited, neighbor, isConnected[neighbor])
            }
        }
    }
}
