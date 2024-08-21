class Solution {

    fun prettyPrint(size: Int): ArrayList<ArrayList<Int>> {
        val matrix = toMatrix(size)

        println(matrix)
        return ArrayList()
    }

    fun toMatrix(size: Int): ArrayList<ArrayList<Int>> {
        return with(ArrayList<ArrayList<Int>>(size)) {
            repeat(size) {
                this.add(ArrayList(List(size) { 0 }))
            }

            this
        }
    }
}
