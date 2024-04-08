class Solution {
    //a => 0
    //ab => 0
    //aab => 2
    //leetcode => 0
    //loveleetcode => 2
    //aabb => -1
    fun firstUniqChar(s: String): Int {
        val cache = mutableSetOf<Char>()

        for (i: Int in s.indices) {
            if (cache.contains(s[i])) {
                continue
            }

            val currentChar = s[i]
            val before = s.length
            val after = s.replace(currentChar.toString(), "").length

            if (before - after == 1) {
                return s.indexOfFirst { c -> c == currentChar }
            }

            cache.add(currentChar)
        }

        return -1
    }
}
