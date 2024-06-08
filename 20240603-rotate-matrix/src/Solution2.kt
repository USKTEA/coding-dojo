class Solution2 {

    //n = 4
    //x = 0, y = 0
    //temp = [4, 0]
    //[4, 0] = [4, 4]
    //[4, 4] = [0, 4]
    //[0, 0] = temp
    //x = 1, y = 0
    //temp = [3, 0] (n-x), y
    //[3, 0] = [4, 3] (n-y), n - x
    //[4, 3] = [2, 4]
    val matrix = arrayListOf(
        arrayListOf(31, 32, 228, 333),
        arrayListOf(79, 197, 241, 246),
        arrayListOf(77, 84, 126, 337),
        arrayListOf(110, 291, 356, 371),
    )

    fun rotate(matrix: ArrayList<ArrayList<Int>>) {
        for (i in 0..(matrix.size + 1) / 2) {
            for (j in 0..matrix[i].lastIndex / 2) {

            }
        }
    }
}
