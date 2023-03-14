package participant;

public class Wall implements Obstacle{
    private String name;
    private int height;
    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public int getDifficulty() {
        return height;
    }
}
