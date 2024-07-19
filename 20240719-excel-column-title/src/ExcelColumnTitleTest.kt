import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ExcelColumnTitleTest {
    private val excelColumnTitle = ExcelColumnTitle()

    @Test
    fun excelColumnTitle() {
        val result = excelColumnTitle.convertToTitle(26 * 26)

        assertEquals("YZ", result)
    }
}
