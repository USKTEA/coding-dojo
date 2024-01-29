public class ParkingRecord {
    private int time;
    private String carNumber;
    private String process;

    public ParkingRecord(String record) {
        String[] detail = record.split(" ");

        setTime(detail[0]);
        this.carNumber = detail[1];
        this.process = detail[2];
    }

    private void setTime(String time) {
        String[] hourAndMinuit = time.split(":");

        String hour = hourAndMinuit[0];
        String minute = hourAndMinuit[1];

        this.time = Integer.parseInt(hour) * 60 + Integer.parseInt(minute);
    }

    public int time() {
        return time;
    }

    public String carNumber() {
        return carNumber;
    }

    public String process() {
        return process;
    }
}
