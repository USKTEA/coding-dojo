class Solution {
    fun anagrams(words: MutableList<String>): ArrayList<ArrayList<Int>> {
        val result = mutableMapOf<Int, ArrayList<Int>>()

        words.forEachIndexed { index, word ->
            val hashCode = word.toCharArray().sorted().hashCode()
            result.computeIfAbsent(hashCode) { ArrayList() }.add(index + 1)
        }

        return ArrayList(result.values)
    }
}
