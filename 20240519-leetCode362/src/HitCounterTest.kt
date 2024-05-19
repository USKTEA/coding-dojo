import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class HitCounterTest {
    @Test
    fun test_case_1() {
        val hitCounter = HitCounter()
        hitCounter.hit(1)
        hitCounter.hit(2)
        hitCounter.hit(3)

        assertEquals(3, hitCounter.getHits(4))

        hitCounter.hit(300)

        assertEquals(4, hitCounter.getHits(300))
        assertEquals(3, hitCounter.getHits(301))
    }

    @Test
    fun hit() {
        val hitCounter = HitCounter()

        hitCounter.hit(0)

        val record = hitCounter.records

        assertEquals(
            TreeMap<Int, Int>().also {
                it[0] = 1
            }, record
        )
    }

    @Test
    fun hit_twice_at_same_timestamp() {
        val hitCounter = HitCounter()

        hitCounter.hit(0)
        hitCounter.hit(0)

        val record = hitCounter.records

        assertEquals(
            TreeMap<Int, Int>().also {
                it[0] = 2
            }, record
        )
    }

    @Test
    fun hit_twice_at_same_timestamp_and_once_at_other() {
        val hitCounter = HitCounter()

        hitCounter.hit(0)
        hitCounter.hit(0)
        hitCounter.hit(100)

        val record = hitCounter.records

        assertEquals(
            TreeMap<Int, Int>().also {
                it[0] = 2
                it[100] = 1
            }, record
        )
    }

    @Test
    fun when_get_his_with_timestamp_0() {
        val hitCounter = HitCounter()

        assertEquals(0, hitCounter.getHits(0))

        hitCounter.hit(0)

        assertEquals(1, hitCounter.getHits(300))

        hitCounter.hit(0)

        assertEquals(2, hitCounter.getHits(300))

        hitCounter.hit(0)

        assertEquals(0, hitCounter.getHits(301))
    }
}
