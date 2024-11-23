class Solution {

    //["a", "b"] => "a1~b1~"
    fun serialize(words: ArrayList<String>): String {
        return words.joinToString("", transform = transform())
    }

    fun deserialize(word: String): ArrayList<String> {
        return ArrayList(word.split("~").dropLast(1).map(removeNumber()))
    }

    private fun removeNumber(): (String) -> String {
        return { word ->
            var lastIndex = word.lastIndex
            while (word[lastIndex] in '0'..'9') {
                lastIndex -= 1
            }

            word.substring(0, lastIndex + 1)
        }
    }

    private fun transform(): (String) -> String {
        return { word -> "$word${word.length}~" }
    }
}
