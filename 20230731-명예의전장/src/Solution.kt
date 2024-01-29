class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val result = score.fold(Records(k)) { record: Records, score: Int ->
            record.add(score)

            record
        }

        return result.toAnnounce().toIntArray()
    }
}

class Records(
    private val rankSize: Int
) {
    private val ranking = mutableListOf<Int>()
    private val toAnnounce = mutableListOf<Int>()

    fun toAnnounce(): MutableList<Int> {
        return this.toAnnounce
    }

    fun ranking(): MutableList<Int> {
        return this.ranking
    }

    fun add(score: Int) {
        if (this.ranking.size < rankSize) {
            this.ranking.add(score)
            this.ranking.sortDescending()
            this.toAnnounce.add(this.ranking.last())

            return
        }

        if (this.ranking.size >= rankSize) {
            ranking.add(score)
            this.ranking.sortDescending()
            ranking.removeAt(rankSize)
            this.toAnnounce.add(this.ranking.last())
        }
    }
}
