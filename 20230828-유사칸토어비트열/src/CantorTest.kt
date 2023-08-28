import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CantorTest {
    @Test
    fun creation() {
        val cantor1 = Cantor(0)
        val bitArray1 = cantor1.bitArray()

        assertEquals("1", bitArray1)

        val cantor2 = Cantor(1)
        val bitArray2 = cantor2.bitArray()

        assertEquals("11011", bitArray2)

        val cantor3 = Cantor(2)
        val bitArray3 = cantor3.bitArray()

        assertEquals("1101111011000001101111011", bitArray3)
    }

    @Test
    fun slice() {
        val cantor = Cantor(2)
        val sliced = cantor.slice(left = 4, right = 17)

        assertEquals("11110110000011", sliced.bitArray())
    }

    @Test
    fun count() {
        val cantor = Cantor(2)
        val sliced = cantor.slice(left = 4, right = 17)
        val count = sliced.count('1')

        assertEquals(8, count)
    }
}
