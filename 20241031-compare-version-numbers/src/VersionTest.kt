import java.math.BigInteger
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VersionTest {
    @Test
    fun fromString() {
        val version = Version.fromString("1.2.3")

        assertEquals(
            Version(
                numbers = mutableListOf(BigInteger("1"), BigInteger("2"), BigInteger("3"))
            ), version
        )
    }

    @Test
    fun compareTo() {
        val version = Version.fromString("1.0.223")
        val otherVersion = Version.fromString("1.222")

        assertTrue(version < otherVersion)
    }
}
