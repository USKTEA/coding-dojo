import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RecordsTest {

    @Test
    fun add() {
        val rankingSize = 3
        val records = Records(rankingSize)

        records.add(10)

        assertEquals(mutableListOf(10), records.toAnnounce())
        assertEquals(mutableListOf(10), records.ranking())
    }

    @Test
    fun addTwoScores() {
        val rankingSize = 3
        val records = Records(rankingSize)

        records.add(10)
        records.add(20)

        assertEquals(mutableListOf(10, 10), records.toAnnounce())
        assertEquals(mutableListOf(20, 10), records.ranking())
    }

    @Test
    fun addThreeScores() {
        val rankingSize = 3
        val records = Records(rankingSize)

        records.add(10)
        records.add(20)
        records.add(10)

        assertEquals(mutableListOf(10, 10, 10), records.toAnnounce())
        assertEquals(mutableListOf(20, 10, 10), records.ranking())
    }

    @Test
    fun addFourScores() {
        val rankingSize = 3
        val records = Records(rankingSize)

        records.add(10)
        records.add(20)
        records.add(10)
        records.add(100)

        assertEquals(mutableListOf(10, 10, 10, 10), records.toAnnounce())
        assertEquals(mutableListOf(100, 20, 10), records.ranking())
    }

    @Test
    fun addSevenScores() {
        val rankingSize = 3
        val records = Records(rankingSize)

        records.add(10)
        records.add(100)
        records.add(20)
        records.add(150)
        records.add(1)
        records.add(100)
        records.add(200)

        assertEquals(mutableListOf(10, 10, 10, 20, 20, 100, 100), records.toAnnounce())
        assertEquals(mutableListOf(200, 150, 100), records.ranking())
    }
}
