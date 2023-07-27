class Solution {
    fun solution(s: String): IntArray {
        val record = s.foldIndexed(Record()) { index, acc, character ->
            if (acc.have(character)) {
                acc.recordDifferences(index - acc.lookUp(character))
                acc.addLookup(character, index)
            }

            if (!acc.have(character)) {
                acc.addLookup(character, index)
                acc.recordDifferences(-1)
            }

            acc
        }

        return record.differences().toIntArray()
    }
}

data class Record(
    val lookup: MutableMap<Char, Int> = mutableMapOf(),
    val differences: MutableList<Int> = mutableListOf()
) {

    fun have(c: Char): Boolean {
        return this.lookup.contains(c)
    }

    fun lookUp(c: Char): Int {
        return this.lookup[c]!!
    }

    fun recordDifferences(i: Int) {
        this.differences.add(i)
    }

    fun addLookup(character: Char, index: Int) {
        this.lookup[character] = index
    }

    fun differences() : MutableList<Int> {
        return this.differences
    }
}