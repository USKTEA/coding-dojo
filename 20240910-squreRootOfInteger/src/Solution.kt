class Solution {
    //11 => 3
    //9 => 3
    //9 => 3
    //1, number middle을 구하고 middle * midddle의 크기와 number와 비교한다
    //middle*middle이 number보다 크다면 작은쪽으로 이진탐색
    //middle*middle이 number보다 작다면 큰쪽으로 이진탐색
    //start >= end라면 start를 반환한다

    fun sqrt(number: Int): Int {
        return search(number, 1, number)
    }

    private fun search(number: Int, start: Int, end: Int): Int {
        val middle = start +  (end - start) / 2
        val powered = middle * middle

        if (start >= end) {
            if (start * start > number) {
                return start - 1
            }

            return start
        }

        if (powered == number) {
            return middle
        }

        if (powered > number) {
            return search(number, start, middle - 1)
        }

        return search(number, middle + 1, end)
    }
}
