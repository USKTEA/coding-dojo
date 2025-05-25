class Solution {
    fun subsets(A: ArrayList<Int>): ArrayList<ArrayList<Int>> {
        // 1. 사전 순 정렬을 위해 먼저 A를 정렬
        A.sort()

        val result = ArrayList<ArrayList<Int>>()
        val current = ArrayList<Int>()

        // 2. 백트래킹 시작
        fun backtrack(start: Int) {
            // 현재까지의 선택 결과를 저장 (깊은 복사 필요)
            result.add(ArrayList(current))

            for (i in start until A.size) {
                current.add(A[i])         // 현재 원소 선택
                backtrack(i + 1)          // 다음 인덱스로 재귀
                current.removeAt(current.size - 1) // 백트래킹
            }
        }

        backtrack(0)
        return result
    }
}
