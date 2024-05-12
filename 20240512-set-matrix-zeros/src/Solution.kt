class Solution {
    //traverse()
    //val zeroIndexes = set()
    fun setZeroes(matrix: ArrayList<ArrayList<Int>>) {
        val (yZeroIndices, xZeroIndices) = getZeroIndices(matrix)

        for (i: Int in 0..matrix.lastIndex) {
            if (yZeroIndices.contains(i)) {
                matrix[i] = ArrayList(matrix[i].map { 0 })
                continue
            }

            for (j: Int in 0..matrix[0].lastIndex) {
                if (xZeroIndices.contains(j)) {
                    matrix[i][j] = 0
                }
            }
        }
    }

    fun getZeroIndices(matrix: ArrayList<ArrayList<Int>>): MutableList<MutableSet<Int>> {
        val zeroIndices: MutableList<MutableSet<Int>> = mutableListOf(
            mutableSetOf(),
            mutableSetOf(),
        )

        for (i: Int in 0..matrix.lastIndex) {
            if (zeroIndices[0].contains(i)) {
                continue
            }

            for (j: Int in 0..matrix[0].lastIndex) {
                if (matrix[i][j] == 0) {
                    zeroIndices[0].add(i)
                    zeroIndices[1].add(j)
                }
            }
        }

        return zeroIndices
    }
}

