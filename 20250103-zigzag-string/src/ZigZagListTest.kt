import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ZigZagListTest {
    @Test
    fun add() {
        val zigZagList = ZigZagList.withSize(3)

        zigZagList.add("A")

        assertEquals(mutableListOf("A", "", ""), zigZagList.elements)

        zigZagList.add("A")

        assertEquals(mutableListOf("A", "A", ""), zigZagList.elements)

        zigZagList.add("A")

        assertEquals(mutableListOf("A", "A", "A"), zigZagList.elements)

        zigZagList.add("A")

        assertEquals(mutableListOf("A", "AA", "A"), zigZagList.elements)

        zigZagList.add("A")

        assertEquals(mutableListOf("AA", "AA", "A"), zigZagList.elements)

        zigZagList.add("A")

        assertEquals(mutableListOf("AA", "AAA", "A"), zigZagList.elements)
    }

    @Test
    fun jointToString() {
        val zigZagList = ZigZagList.withSize(3)

        zigZagList.add("A")

        assertEquals(mutableListOf("A", "", ""), zigZagList.elements)

        zigZagList.add("B")

        assertEquals(mutableListOf("A", "B", ""), zigZagList.elements)

        zigZagList.add("C")

        assertEquals(mutableListOf("A", "B", "C"), zigZagList.elements)

        zigZagList.add("A")

        assertEquals(mutableListOf("A", "BA", "C"), zigZagList.elements)

        zigZagList.add("B")

        assertEquals(mutableListOf("AB", "BA", "C"), zigZagList.elements)

        zigZagList.add("C")

        assertEquals(mutableListOf("AB", "BAC", "C"), zigZagList.elements)

        val word = zigZagList.joinToString("")

        assertEquals("ABBACC", word)
    }
}
