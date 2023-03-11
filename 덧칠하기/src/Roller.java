public class Roller {
    private int length;
    private int painted;
    private int position;

    public Roller(int length) {
        this.length = length;
        this.painted = 0;
        this.position = 0;
    }

    public int getLength() {
        return length;
    }

    public int painted() {
        return painted;
    }

    public int position() {
        return position;
    }

    public void paint(int section) {
        this.position = section + this.length - 1;
        this.painted += 1;
    }
}
