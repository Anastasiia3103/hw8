package participant;

public class Treadmill implements Obstacle {
    private String name;
    private int length;

    public Treadmill (String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName () {
        return name;
    }

    public int getDifficulty () {
        return length;
    }
}
