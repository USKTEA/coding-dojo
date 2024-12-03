import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WordBasketTest {
    @Test
    fun creation() {
        val basket = WordBasket.withSize(5)

        assertEquals(5, basket.words.size)
    }

    @Test
    fun add() {
        val basket = WordBasket.withSize(2)

        assertEquals(0, basket.pointer)

        basket.add('A')
        assertEquals(1, basket.pointer)
        assertEquals(listOf("A", ""), basket.words)

        basket.add('B')
        assertEquals(0, basket.pointer)
        assertEquals(listOf("A", "B"), basket.words)

        basket.add('C')
        assertEquals(1, basket.pointer)
        assertEquals(listOf("AC", "B"), basket.words)

        basket.add('D')
        assertEquals(0, basket.pointer)
        assertEquals(listOf("AC", "BD"), basket.words)
    }
}
