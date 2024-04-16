class Solution {
    //[""] => [[""]]
    //["a"] => [[a]]
    //[a, b] => [[a], [b]]
    //[cat, tac] => [[cat, tac]]
    //[eat, tea, tan, ate, nat, bat] => [[bat], [nat, tan], [ate, eat, tea]]
    //for(i in 0..strs.indece) { val score = caclulateScore(string),
    //Map<Int, List<String>> getOrDefault(mutableListOf(string))
    //return map.fold()
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = mutableMapOf<Anagram, MutableList<String>>()

        for (word in strs) {
            val anagram = Anagram(word)
            val group = groups.getOrDefault(anagram, mutableListOf())
            group.add(word)
            groups[anagram] = group
        }

        return groups.values.fold(mutableListOf<List<String>>()) { acc, strings ->
            acc.add(strings.toList())
            acc
        }.toList()
    }
}

data class Anagram(
    val value: String
) {
    private val sorted: String
        get() = value.toList().sorted().joinToString()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Anagram) return false

        return this.value.toList().containsAll(other.value.toList())
    }

    override fun hashCode(): Int {
        return sorted.hashCode()
    }
}
