class Solution {
    fun serialize(words: ArrayList<String>): String {

        return words.fold("") { acc, word ->
            acc + word + word.length + "~"
        }
    }
}
