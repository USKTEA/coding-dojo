class Solution {
    //
    //        "A", "C"
    //    "C" "A", "B"
    //    "CB", "A", "A"
    //
    //        "A", "A"
    //        "A", "A"
    //        "C", "A"
    //    "A", "C", "A"
    //    "AA", "C", "C"
    //    "AA", "E", "E"
    fun solve(letters: String): Int {
        val str: String = letters + "#" + StringBuilder(letters).reverse().toString()
        val lps = IntArray(str.length)
        var len = 0
        var i = 1

        while (i < str.length) {
            if (str[i] == str[len]) {
                len++
                lps[i] = len
                i++
            } else {
                if (len != 0) {
                    len = lps[len - 1]
                } else {
                    lps[i] = 0
                    i++
                }
            }
        }

        return letters.length - lps[str.length - 1]
    }
}
