public class Truck {
    private int truckWeight;
    private int position;

    public Truck(int truckWeight) {
        this.truckWeight = truckWeight;
        this.position = 0;
    }

    public int weight() {
        return this.truckWeight;
    }

    public void move() {
        this.position += 1;
    }

    public int position() {
        return this.position;
    }
}
