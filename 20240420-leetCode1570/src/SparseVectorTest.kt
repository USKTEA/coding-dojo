import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SparseVectorTest {
    @Test
    fun create() {
        val sparseVector = SparseVector(
            nums = intArrayOf(1, 0, 0, 2, 3)
        )
    }

    @Test
    fun dotProduct_with_both_zero_int_array() {
        val sparseVector = SparseVector(
            nums = intArrayOf(0)
        )

        val otherSparseVector = SparseVector(
            nums = intArrayOf(0)
        )

        val result = sparseVector.dotProduct(otherSparseVector)

        assertEquals(0, result)
    }

    @Test
    fun current() {
        val sparseVector = SparseVector(
            nums = intArrayOf(1, 2, 3)
        )

        assertEquals(1, sparseVector.dot())
        assertEquals(2, sparseVector.dot())
        assertEquals(3, sparseVector.dot())
        assertEquals(3, sparseVector.dot())
    }

    @Test
    fun dotProduct_with_none_zero_int_array() {
        val sparseVector = SparseVector(
            nums = intArrayOf(1)
        )

        val otherSparseVector = SparseVector(
            nums = intArrayOf(1)
        )

        val result = sparseVector.dotProduct(otherSparseVector)

        assertEquals(1, result)
    }

    @Test
    fun dotProduct_with_long_int_array1() {
        val sparseVector = SparseVector(
            nums = intArrayOf(1, 2)
        )

        val otherSparseVector = SparseVector(
            nums = intArrayOf(1, 1)
        )

        val result = sparseVector.dotProduct(otherSparseVector)

        assertEquals(3, result)
    }

    @Test
    fun complexTestCase1() {
        val sparseVector = SparseVector(
            nums = intArrayOf(1, 0, 0, 2, 3)
        )

        val otherSparseVector = SparseVector(
            nums = intArrayOf(0, 3, 0, 4, 0)
        )

        val result = sparseVector.dotProduct(otherSparseVector)

        assertEquals(8, result)
    }
}
