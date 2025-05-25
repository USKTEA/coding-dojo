import kotlin.coroutines.Continuation
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VisitorTest {

    @Test
    fun creationWithHotelMap() {
        val hotelMap = arrayListOf(
            arrayListOf(0, 0),
        )

        val visitor = Visitor(hotelMap)

        val distanceMap = visitor.distanceMap()
        val toVisits = visitor.toVisits()

        assertEquals(listOf(
            listOf(Int.MAX_VALUE, Int.MAX_VALUE),
        ), distanceMap)

        assertTrue(toVisits.isEmpty())
    }

    @Test
    fun creationWithHotelMap_1() {
        val hotelMap = arrayListOf(
            arrayListOf(0, 0),
            arrayListOf(1, 0),
        )

        val visitor = Visitor(hotelMap)

        val distanceMap = visitor.distanceMap()
        val toVisits = visitor.toVisits()

        assertEquals(listOf(
            listOf(Int.MAX_VALUE, Int.MAX_VALUE),
            listOf(0, Int.MAX_VALUE),
        ), distanceMap)

        assertEquals(listOf(
            Coordinate(0, 1)
        ), toVisits)
    }
}
