import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NestedIntegerTest {
    @Test
    fun sum() {
        val nestedInteger = NestedInteger(1)

        assertEquals(1, nestedInteger.sum())
    }

    @Test
    fun sumWithDepth2() {
        val nestedInteger = NestedInteger(
            nestedIntegers = mutableListOf(
                NestedInteger(1),
                NestedInteger(1),
            )
        )

        assertEquals(4, nestedInteger.sum())
    }

    @Test
    fun sumWithDepth3() {
        val nestedInteger = NestedInteger(
            nestedIntegers = mutableListOf(
                NestedInteger(
                    nestedIntegers = mutableListOf(
                        NestedInteger(1)
                    )
                ),
            )
        )

        assertEquals(3, nestedInteger.sum())
    }
}
