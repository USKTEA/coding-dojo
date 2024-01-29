class Solution {
    fun solution(names: Array<String>, yearning: IntArray, photos: Array<Array<String>>): IntArray {
        val pointsPerName = toHashMap(names, yearning)

        return photos.map { photo ->
            photo.sumOf { name -> pointsPerName[name] ?: 0 }
        }.toIntArray()
    }

    fun toHashMap(names: Array<String>, yearning: IntArray): Map<String, Int> {
        return names.mapIndexed { index, name ->
            name to yearning[index]
        }.toMap()
    }
}