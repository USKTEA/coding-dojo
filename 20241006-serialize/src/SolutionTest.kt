import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun serialize() {
        val result = solution.serialize(arrayListOf("scaler", "academy"))

        assertEquals("scaler6~academy7~", result)
    }

    @Test
    fun deserialize() {
        val result = solution.deserialize("mxxxzclaql10~omttepvukq10~sckhqgagqt10~miaufqvumh10~jndrqnllah10~wqlithzmfi10~oczafaqcrz10~lnubllvcsq10~rzngzhllmw10~ntpvbeyxnk10~")

        assertEquals(arrayListOf("scaler", "academy"), result)
    }
}
