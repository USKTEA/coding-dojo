class Solution {
    //aab => aba
    //aaab => ""
    //a => a
    //ab => ab
    //abc => abc
    //aabc => abac
    //aaabc => abaca
    //charIndices = HashMap<Char, MutableList<Int>)
    //for (index in s.indices) {
    //val indices = charIndices.getOrDefault(s[index], mutablelistOf()
    //indices.add(index)
    //while (hashMap.isNotEmpty() {
    // map.entries.fold("") { "", key, values -> "" + key values 지우다.  빈 배열? 삭제 그리고 전거랑 비교 동일? return "" }
    // }
    fun reorganizeString(s: String): String {
        val charProvider = CharProvider(s)
        var reorganizeString = ""

        while (s.length != reorganizeString.length) {
            val provided = charProvider.provide()

            if (provided == null || provided == reorganizeString.lastOrNull()) {
                return ""
            }

            reorganizeString += provided
        }

        return reorganizeString
    }
}

class CharProvider(s: String) {
    private val charIndices : MutableMap<Char, MutableList<Int>>
    private var lastProvided : Char? = null

    init {
        charIndices = getCharIndices(s)
    }

    fun provide(): Char? {
        val char = findCharHaveMost(lastProvided)

        if (char == null) {
            return null
        }

        val indices = charIndices.getValue(char)

        indices.removeFirst()

        charIndices[char] = indices
        lastProvided = char

        return char
    }

    private fun findCharHaveMost(lastProvidedChar: Char?): Char? {
        val founded = charIndices.entries.fold(Pair('A', 0)) { (char, count), (key, value) ->
            if (value.isEmpty()) {
                return@fold Pair(char, count)
            }

            if (key == lastProvidedChar) {
                return@fold Pair(char, count)
            }

            if (count == 0 || count < value.size) {
                return@fold Pair(key, value.size)
            }

            return@fold Pair(char, count)
        }.first

        if (founded == 'A') {
            return null
        }

        return founded
    }

    private fun getCharIndices(s: String): MutableMap<Char, MutableList<Int>> {
        return s.foldIndexed(mutableMapOf()) { index, acc, c ->
            val char = s[index]
            val indices = acc.getOrDefault(char, mutableListOf())
            indices.add(index)
            acc[char] = indices
            acc
        }
    }
}
