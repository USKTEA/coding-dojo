public class Reservation {
    private int start;
    private int end;

    public Reservation(String startTime, String endTime) {
        setStart(startTime);
        setEnd(endTime);
    }

    private void setStart(String start) {
        this.start = toMinutes(start);
    }

    private void setEnd(String end) {
        this.end = toMinutes(end);
    }

    private int toMinutes(String time) {
        int hour = Integer.parseInt(time.split(":")[0]);
        int minutes = Integer.parseInt(time.split(":")[1]);

        return hour * 60 + minutes;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
