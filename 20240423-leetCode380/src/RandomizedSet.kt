class RandomizedSet(
    private val saved: MutableSet<Int> = mutableSetOf()
) {
    //[], 1 => [1], true
    //[1], 1 => [1], false
    //[1], 2 => [1, 2], true
    fun insert(`val`: Int): Boolean {
        return saved.add(`val`)
    }

    fun remove(`val`: Int): Boolean {
        return saved.remove(`val`)
    }

    fun getRandom(): Int {
        return
    }

    fun randomHelper(): Int {
        val random = Math.random()
        val converted = random * (saved.size.toString().length * 10)

        return ((converted % saved.size).toString().first() + 1).digitToInt()
    }

    fun saved(): MutableSet<Int> {
        return saved
    }
}
