import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AnagramTest {
    @Test
    fun equality() {
        val anagram1 = Anagram("a")
        val anagram2 = Anagram("a")

        assertEquals(anagram1, anagram2)
    }

    @Test
    fun equality2() {
        val anagram1 = Anagram("ab")
        val anagram2 = Anagram("ba")

        assertEquals(anagram1, anagram2)
    }
}
