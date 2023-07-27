class Solution {
    fun solution(t: String, p: String): Int {
        return (0..t.length - p.length).map {
            t.substring(it, p.length + it)
        }.count { it <= p }
    }
}