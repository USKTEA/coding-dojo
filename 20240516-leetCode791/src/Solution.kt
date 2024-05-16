class Solution {
    //cba, abcd => cbad
    //bcafg, abcd => bcad
    //s to map (s , list())
    //for (character in order) {
    // getOrNull
    // ordered
    // }
    fun customSortString(order: String, s: String): String {
        val characterOccurrence = recordOccurrence(s)

        val ordered = order.fold("") { acc: String, c: Char ->
            val occurrence = characterOccurrence[c] ?: return@fold acc

            characterOccurrence.remove(c)
            acc + occurrence.joinToString("")
        }

        val last = characterOccurrence.values.fold("") { acc, chars -> acc + chars.joinToString("") }

        return ordered + last
    }

    fun recordOccurrence(string: String): MutableMap<Char, MutableList<Char>> {
        return string.fold(mutableMapOf()) { acc, c ->
            acc.computeIfAbsent(c) { mutableListOf() }.add(c)
            acc
        }
    }
}
