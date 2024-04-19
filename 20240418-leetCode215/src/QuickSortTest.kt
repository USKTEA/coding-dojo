import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class QuickSortTest {
    @Test
    fun process() {
        val sort = QuickSort()
        val sorted = sort.process(intArrayOf(5, 1, 4, 3, 2))

        println(sorted.toList())
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), sorted)
    }

    @Test
    fun sort() {
        val sort = QuickSort()
        val sorted = sort.sort(2, 4, intArrayOf(5, 1, 4, 3 ,2))

        assertArrayEquals(intArrayOf(2, 1, 3, 4, 5), sorted)
    }

    @Test
    fun sort2() {
        val sort = QuickSort()
        val sorted = sort.sort(1, 2, intArrayOf(2, 1, 3, 4 ,5))

        println(sorted.toList())
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), sorted)
    }
}
