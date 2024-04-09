import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LRUCacheTest {

    @Test
    fun init() {
        val cache = LRUCache(5)

        assertEquals(5, cache.capacity)
    }

    @Test
    fun putAndGet() {
        val cache = LRUCache(5)

        assertEquals(-1, cache.get(1))

        cache.put(1, 1)

        assertEquals(1, cache.get(1))
    }

    @Test
    fun whenPutMoreThanCapacity() {
        val cache = LRUCache(2)

        cache.put(1, 1)
        cache.put(2, 2)

        assertEquals(1, cache.get(1))
        assertEquals(2, cache.get(2))

        cache.put(3, 3)

        assertEquals(-1, cache.get(1))
        assertEquals(2, cache.get(2))
        assertEquals(3, cache.get(3))
    }

    @Test
    fun evictAlgorithm() {
        val cache = LRUCache(2)

        cache.put(1, 1)
        cache.put(2, 2)

        assertEquals(2, cache.get(2))
        assertEquals(1, cache.get(1))

        cache.put(3, 3)

        assertEquals(3, cache.get(3))
        assertEquals(1, cache.get(1))
        assertEquals(-1, cache.get(2))
    }

    @Test
    fun testCase1() {
        val cache = LRUCache(2)

        cache.put(1, 1)
        cache.put(2, 2)

        assertEquals(1, cache.get(1))

        cache.put(3, 3)

        assertEquals(-1, cache.get(2))

        cache.put(4, 4)

        assertEquals(-1, cache.get(1))
        assertEquals(3, cache.get(3))
        assertEquals(4, cache.get(4))
    }

    @Test
    fun testCase2() {
        val cache = LRUCache(2)

        cache.put(2, 1)
        cache.put(1, 1)
        cache.put(2, 3)
        cache.put(4, 1)
        assertEquals(-1, cache.get(1))
        assertEquals(3, cache.get(2))
    }
}
