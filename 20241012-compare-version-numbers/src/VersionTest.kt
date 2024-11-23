import java.math.BigDecimal
import java.math.BigInteger
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VersionTest {
    @Test
    fun fromString() {
        assertEquals(
            Version(
                listOf(BigInteger("1"), BigInteger("1"))
            ),
            Version.fromString("1.1")
        )
    }

    @Test
    fun fromString_2() {
        assertEquals(
            Version(
                listOf(BigInteger("1"))
            ),
            Version.fromString("1")
        )
    }

    @Test
    fun fromString_3() {
        assertEquals(
            Version(
                listOf(
                    BigInteger("4444371174137455")
                )
            ),
            Version.fromString("4444371174137455")
        )
    }

    @Test
    fun fromString_4() {
        assertEquals(
            Version(
                listOf(BigInteger("444444444444444444444444"))
            ),
            Version.fromString("444444444444444444444444")
        )
    }

    @Test
    fun compareTo() {
        val version = Version.fromString("1.2")
        val otherVersion = Version.fromString("1.1")

        assertTrue(version > otherVersion)
    }

    @Test
    fun compareTo_2() {
        val version = Version.fromString("1.13")
        val otherVersion = Version.fromString("1.13.4")

        assertTrue(version < otherVersion)
    }
}
