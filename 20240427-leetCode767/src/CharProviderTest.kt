import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CharProviderTest {
    @Test
    fun provide() {
        val provider = CharProvider("aaabc")

        assertEquals('a', provider.provide())
        assertEquals('b', provider.provide())
        assertEquals('a', provider.provide())
        assertEquals('c', provider.provide())
        assertEquals('a', provider.provide())
    }
}
