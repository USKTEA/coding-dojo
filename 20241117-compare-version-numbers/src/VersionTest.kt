import java.math.BigInteger
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VersionTest {

    @Test
    fun creation() {
        val version = Version.fromString("1.13")

        assertEquals(
            Version(
                revisionLevels = listOf(
                    BigInteger("1"), BigInteger("13")
                )
            ), version
        )
    }

    @Test
    fun compareTo() {
        val version = Version.fromString("1.13")
        val otherVersion = Version.fromString("1.13.4")

        assertTrue(version < otherVersion)
    }

    @Test
    fun compareTo_2() {
        val version = Version.fromString("01")
        val otherVersion = Version.fromString("1")

        assertTrue(version == otherVersion)
    }
}
