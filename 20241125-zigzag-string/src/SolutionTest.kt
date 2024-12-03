import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun convert() {
        val result = solution.convert("PAYPALISHIRING", 3)

        assertEquals("PAHNAPLSIIGYIR", result)
    }

    @Test
    fun convert_2() {
        val result = solution.convert("kHAlbLzY8Dr4zR0eeLwvoRFg9r23Y3hEujEqdio0ctLh4jZ1izwLh70R7SAkFsXlZ8UlghCL95yezo5hBxQJ1Td6qFb3jpFrMj8pdvP6M6k7IaXkq21XhpmGNwl7tBe86eZasMW2BGhnqF6gPb1YjCTexgCurS", 1)

        assertEquals("kHAlbLzY8Dr4zR0eeLwvoRFg9r23Y3hEujEqdio0ctLh4jZ1izwLh70R7SAkFsXlZ8UlghCL95yezo5hBxQJ1Td6qFb3jpFrMj8pdvP6M6k7IaXkq21XhpmGNwl7tBe86eZasMW2BGhnqF6gPb1YjCTexgCurS", result)
    }
}
