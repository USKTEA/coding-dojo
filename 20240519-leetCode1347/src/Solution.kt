class Solution {
    //bab, aba -> 1
    //leetcode, practice -> 5
    //anagram, mangaar -> 0
    //s.forEach
    //t map (char s to count) if 없으면 +1
    fun minSteps(s: String, t: String): Int {
        val counts = count(t)
        val differences = getDifferences(s, counts)

        return differences
    }

    fun count(word: String): MutableMap<Char, Int> {
        return word.fold(mutableMapOf()) { count, char ->
            count.compute(char) { _, value -> (value ?: 0) + 1 }
            count
        }
    }

    fun getDifferences(word: String, counts: MutableMap<Char, Int>): Int {
        return word.fold(0) { differences: Int, char: Char ->
            val count = counts.getOrDefault(char, 0)

            if (count - 1 < 0) {
                return@fold differences + 1
            }

            counts[char] = count - 1
            differences
        }
    }
}
