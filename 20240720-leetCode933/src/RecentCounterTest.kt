import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RecentCounterTest {
    @Test
    fun ping() {
        val counter = RecentCounter()

        assertEquals(1, counter.ping(1))
        assertEquals(2, counter.ping(100))
        assertEquals(3, counter.ping(3001))
        assertEquals(3, counter.ping(3002))
    }

    @Test
    fun ping_2() {
        val counter = RecentCounter()

        assertEquals(1, counter.ping(642))
        assertEquals(2, counter.ping(1849))
        assertEquals(1, counter.ping(4921))
        assertEquals(2, counter.ping(5936))
        assertEquals(3, counter.ping(5957))
    }
}
