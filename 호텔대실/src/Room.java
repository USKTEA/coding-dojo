public class Room {
    private int timeInUse;

    public Room(int time) {
        this.timeInUse = time + 10;
    }

    public boolean canUse(int time) {
        return time >= timeInUse;
    }

    public void inUse(int time) {
        this.timeInUse = time + 10;
    }
}
