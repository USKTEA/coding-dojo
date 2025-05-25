import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VisitorTest {
    @Test
    fun findNearestHotelDistance() {
        val visitor = Visitor(
            startPosition = Coordinate(x = 0, y = 0),
            hotelMap = arrayListOf(arrayListOf(1, 0))
        )

        visitor.findNearestHotelDistance()

        assertEquals(0, visitor.nearestHotelDistance)
    }

    @Test
    fun `find_nearest_hotel_distance_when_hotel_at_(0, 1)`() {
        val visitor = Visitor(
            startPosition = Coordinate(x = 0, y = 0),
            hotelMap = arrayListOf(arrayListOf(0, 1))
        )

        visitor.findNearestHotelDistance()

        assertEquals(1, visitor.nearestHotelDistance)
    }

    @Test
    fun `find_nearest_hotel_distance_when_hotel_at_(1, 1)`() {
        val visitor = Visitor(
            startPosition = Coordinate(x = 0, y = 0),
            hotelMap = arrayListOf(
                arrayListOf(0, 0),
                arrayListOf(0, 1),
            )
        )

        visitor.findNearestHotelDistance()

        assertEquals(2, visitor.nearestHotelDistance)
    }
}
