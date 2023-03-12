import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    private List<Room> rooms = new ArrayList<>();

    public int solution(String[][] book_time) {
        return countRoomsToUse(toReservation(book_time));
    }

    public List<Reservation> toReservation(String[][] bookTimes) {
        List<Reservation> reservations = Arrays.asList(bookTimes)
                .stream()
                .map((time) -> new Reservation(time[0], time[1]))
                .collect(Collectors.toList());

        reservations.sort(Comparator.comparingInt(Reservation::getStart));

        return reservations;
    }

    public int countRoomsToUse(List<Reservation> reservations) {
        boolean shouldAddRoom = true;

        for (Reservation reservation : reservations) {
            if (rooms.size() == 0) {
                rooms.add(new Room(reservation.getEnd()));

                continue;
            }

            for (Room room : rooms) {
                if (room.canUse(reservation.getStart())) {
                    room.inUse(reservation.getEnd());
                    shouldAddRoom = false;

                    break;
                }
            }

            if (shouldAddRoom) {
                rooms.add(new Room(reservation.getEnd()));
            }

            shouldAddRoom = true;
        }

        return rooms.size();
    }
}
