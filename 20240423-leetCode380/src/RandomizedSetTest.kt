import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RandomizedSetTest {
    @Test
    fun insertAndRemove() {
        val randomizedSet = RandomizedSet()

        assertTrue(randomizedSet.insert(1))
        assertEquals(mutableSetOf(1), randomizedSet.saved())

        assertFalse(randomizedSet.insert(1))
        assertEquals(mutableSetOf(1), randomizedSet.saved())

        assertTrue(randomizedSet.insert(2))
        assertEquals(mutableSetOf(1, 2), randomizedSet.saved())

        assertTrue(randomizedSet.remove(1))
        assertEquals(mutableSetOf(2), randomizedSet.saved())

        assertFalse(randomizedSet.remove(1))
        assertEquals(mutableSetOf(2), randomizedSet.saved())

        assertTrue(randomizedSet.remove(2))
        assertEquals(mutableSetOf<Int>(), randomizedSet.saved())
    }

    @Test
    fun getRandom() {
        val randomizedSet = RandomizedSet()

        assertTrue(randomizedSet.insert(1))
        assertTrue(randomizedSet.insert(2))
        assertTrue(randomizedSet.insert(3))

        assertEquals(1, randomizedSet.getRandom())
    }

    @Test
    fun randomHelper() {
        val randomizedSet = RandomizedSet()

        assertTrue(randomizedSet.insert(1))
        assertTrue(randomizedSet.insert(2))
        assertTrue(randomizedSet.insert(3))

        randomizedSet.randomHelper()
    }
}
