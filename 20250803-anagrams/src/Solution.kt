class Solution {
    fun anagrams(letters: MutableList<String>): ArrayList<ArrayList<Int>> {
        val result = mutableMapOf<CustomString, MutableList<Int>>()
        val customStrings = letters.map { CustomString(
            it.toCharArray().toList()
        ) }

        customStrings.forEachIndexed { index, customString ->
            result.getOrPut(customString) { ArrayList() }.add(index + 1)
        }

        return ArrayList(result.values.map { ArrayList(it) })
    }

    data class CustomString(
        val value: List<Char>,
    ) {
        override fun hashCode(): Int {
            return value.fold(0) { acc, c -> acc + 31 * c.hashCode() }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as CustomString

            if (value.size != other.value.size) return false

            return value.containsAll(other.value) && other.value.containsAll(value)
        }
    }
}
