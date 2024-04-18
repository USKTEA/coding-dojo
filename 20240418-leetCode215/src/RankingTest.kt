import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RankingTest {
    private val k = 4
    private var ranking = Ranking(k)

    @BeforeEach
    fun setUp() {
        ranking = Ranking(k)
    }

    @Test
    fun LotsOfNumbers1() {
        val ranking = Ranking(4)

        ranking.add(3)
        ranking.add(2)
        ranking.add(3)
        ranking.add(1)
        ranking.add(2)
        ranking.add(4)
        ranking.add(5)
        ranking.add(5)
        ranking.add(6)

        assertEquals(listOf(6, 5, 5, 4), ranking.numbers())
    }

    @Test
    fun addLotsOfNumbers2() {
        val ranking = Ranking(2)

        ranking.add(3)
        ranking.add(2)
        ranking.add(1)
        ranking.add(5)
        ranking.add(6)
        ranking.add(4)

        assertEquals(listOf(6, 5), ranking.numbers())
    }

    @Test
    fun addLotsOfNumbers3() {
        val ranking = Ranking(2)

        ranking.add(2)
        ranking.add(1)

        assertEquals(listOf(2, 1), ranking.numbers())
    }

    @Test
    fun addLotsOfNumbers4() {
        val ranking = Ranking(2)

        ranking.add(-1)
        ranking.add(2)
        ranking.add(0)

        assertEquals(listOf(2, 0), ranking.numbers())
    }

    @Test
    fun addLotsOfNumbers5() {
        val ranking = Ranking(5)

        ranking.add(7)
        ranking.add(6)
        ranking.add(5)
        ranking.add(4)
        ranking.add(3)
        ranking.add(2)
        ranking.add(1)

        assertEquals(listOf(7, 6, 5, 4, 3), ranking.numbers())
    }

    @Test
    fun addLotsOfNumbers6() {
        val ranking = Ranking(1)

        ranking.add(3)
        ranking.add(3)
        ranking.add(3)
        ranking.add(3)
        ranking.add(4)
        ranking.add(3)
        ranking.add(3)
        ranking.add(3)
        ranking.add(3)

        assertEquals(listOf(4), ranking.numbers())
    }
}
