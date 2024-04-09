class LRUCache(
    val capacity: Int,
    private val cache: LinkedHashMap<Int, Int> = LinkedHashMap(),
    private val recentlyUsed: LinkedHashSet<Int> = LinkedHashSet(),
) {

    fun get(key: Int): Int {
        val value = cache.getOrDefault(key, -1)

        if (value != -1) {
            recentlyUsed.remove(key)
            recentlyUsed.add(key)
        }

        return value
    }

    fun put(key: Int, value: Int) {
        cache[key] = value

        if (recentlyUsed.contains(key)) {
            recentlyUsed.remove(key)
        }

        recentlyUsed.add(key)

        if (cache.size > capacity) {
            val toEvict = recentlyUsed.first()

            recentlyUsed.remove(toEvict)
            cache.remove(toEvict)
        }
    }
}
