import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WeighIndexTest {
    @Test
    fun picked() {
        val weighIndex = WeighIndex(
            from = 0.0, to = 0.25, index = 0
        )

         assertTrue(weighIndex.picked(0.1))
         assertTrue(weighIndex.picked(0.0))
         assertTrue(weighIndex.picked(0.124))
         assertFalse(weighIndex.picked(0.25))
         assertFalse(weighIndex.picked(0.26))
    }
}
