import kotlin.math.floor

class Solution {
    //[[1, 1, 1], [1, 0, 1], [1, 1, 1]] => [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    //isCorner(x, y) => (x == 0 && (y == 0 || y == 2)|| x == 2 && (y == 0 || y == 2))
    //isMiddle(x, y) => x == 1 && y == 1

    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
        return img.mapIndexed { x, pixels ->
            pixels.mapIndexed { y, pixel ->
                if (isCorner(x, y)) {
                    return@mapIndexed cornerSmooth(img)
                }

                if (isMiddle(x, y)) {
                    return@mapIndexed middleSmooth(img)
                }

                otherSmooth(img)
            }.toIntArray()
        }.toTypedArray()
    }

    fun middleSmooth(img: Array<IntArray>): Int {
        return floor((img.sumOf { it.sum() } / 9).toDouble()).toInt()
    }

    fun otherSmooth(img: Array<IntArray>): Int {
        return floor(
            ((img[0][1] + img[1][0] + img[1][1] + img[1][2] + img[2][0] + img[2][2]) / 6).toDouble()
        ).toInt()
    }

    private fun isMiddle(x: Int, y: Int): Boolean {
        return x == 1 && y == 1
    }

    fun cornerSmooth(img: Array<IntArray>): Int {
        return floor(
            ((img[0][0] + img[0][1] + img[1][0] + img[1][1]) / 4).toDouble()
        ).toInt()
    }

    fun isCorner(x: Int, y: Int): Boolean {
        return (x == 0 || x == 2) && (y == 0 || y == 2)
    }
}
