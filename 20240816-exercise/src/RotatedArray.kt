class RotatedArray {
    //[4, 5, 6, 7, 1, 2] => 1
    //중간 값을 찾는다
    //중간 값부터 오른쪽 끝값이 정렬되어 있는지 확인한다
    //만약 정렬이 되어 있다면 왼쪽 배열을 찾는다
    //만약 정렬이 되어 있다면 다시 그 왼쪽을 찾는다
    //만약 정렬이 되어 있지 않다면 정렬이 되지 않는 첫 번째 값이거나 배열의 크기가 1일 때 그 값이다
    fun findMin(rotatedArray: List<Int>): Int {
        return find(rotatedArray, 0, rotatedArray.lastIndex)
    }

    private fun find(rotatedArray: List<Int>, start: Int, end: Int): Int {
        if (rotatedArray[start] <= rotatedArray[end]) {
            return rotatedArray[start]
        }

        if (end - start <= 1) {
            return minOf(rotatedArray[start], rotatedArray[end])
        }

        val middle = start + (end - start) / 2

        if (rotatedArray[middle] <= rotatedArray[end]) {
            return find(rotatedArray, start, middle)
        }
        return find(rotatedArray, middle, end)
    }
}
