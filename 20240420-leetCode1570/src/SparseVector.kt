//[1, 0, 0, 2, 3], [0, 3, 0, 4, 0] => 8
//[0, 1, 0, 0, 0], [0, 0, 0, 0, 2] => 0
//[0, 1, 0, 0, 2, 0, 0] => [1, 0, 0, 0, 3, 0, 4] => 6
//[0], [0] => 0
//[1], [0] => 0
//[1], [1] => 1
//[1, 2], [1, 1] => 3
class SparseVector(
    val nums: IntArray,
    private var current: Int = 0
) {
    // Return the dotProduct of two sparse vectors
    fun dotProduct(vec: SparseVector): Int {
        var product = 0

        while (hasDot()) {
            product += this.dot() * vec.dot()
        }

        return product
    }

    private fun hasDot(): Boolean {
        return this.current < nums.size
    }

    fun dot(): Int {
        if (current == nums.size) {
            return nums.last()
        }

        val dot = nums[current]

        if (current < nums.size) {
            current += 1
        }

        return dot
    }
}
