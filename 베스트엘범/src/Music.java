public class Music {
    private int id;
    private String genre;
    private int plays;

    public Music(int id, String genre, int plays) {
        this.id = id;
        this.genre = genre;
        this.plays = plays;
    }

    public int plays() {
        return plays;
    }

    public int id() {
        return id;
    }
}
