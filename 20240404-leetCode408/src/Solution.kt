class Solution {
    //a, 1 => true
    //a, 0 => false
    //substitution, s10n => true
    //substitution, 12 => true
    //internationalization, i12iz4n => true
    //apple, a2e => false
    //split("a2e") => ["a", "2", "e"].reduce(0) acc += element.toIntOrNull() 

    fun validWordAbbreviation(word: String, abbr: String): Boolean {
        val splitted = split(abbr)
        
        val size = splitted.foldIndexed(0) { index, acc, s ->
            val result = s.toIntOrNull()

            if (acc >= word.length) {
                return false
            }

            if (result == null) {
                if (word[acc].toString() != s) {
                    return false
                }

                return@foldIndexed acc + 1
            }

            if (s.startsWith("0")) {
                return false
            }

            acc + result
        }

        return word.length == size
    }

    fun split(abbr: String): List<String> {
        return abbr.foldIndexed(mutableListOf()) { index, acc, c ->
            val result = c.digitToIntOrNull()

            if (result == null) {
                acc.add(c.toString())

                return@foldIndexed acc
            }

            if (index != 0) {
                val lastElement = acc[acc.lastIndex]

                if (lastElement.toIntOrNull() == null) {
                    acc.add(c.toString())

                    return@foldIndexed acc
                }

                acc[acc.lastIndex] = lastElement + c.toString()
                return@foldIndexed acc
            }

            acc.add(result.toString())
            acc
        }
    }
}
