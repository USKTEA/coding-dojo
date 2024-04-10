class Solution {
    //[1, 2, 3], [1, 1] => 1
    //[1, 2], [1, 2, 3] => 2
    //[1], [1] => 1
    //[2], [1] => 0
    //sort
    //for (i: Int in s.indices) if (s[i] >= g[current]) current += 1  else return current
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var current = 0

        val sortedG = g.sorted()
        val sortedS = s.sorted()

        for (i: Int in sortedS.indices) {
            if (current > g.size - 1) {
                return current
            }

            if (sortedS[i] >= sortedG[current]) {
                current += 1

                continue
            }
        }

        return current
    }
}
