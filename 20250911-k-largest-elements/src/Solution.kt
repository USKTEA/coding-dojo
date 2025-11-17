class Solution {
    fun solve(A: ArrayList<Int>, B: Int): ArrayList<Int> {
        return ArrayList(A.sorted().drop(A.size - B))
    }
}
