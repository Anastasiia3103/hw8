package participant;

public class Robot implements Participant{
    private String name;
    public Robot(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void run(int distance) {
        System.out.println("Robot " + name + " ran " + distance + " meters.");
    }
    public void jump(int height) {
        System.out.println("Robot " + name + " cannot jump.");
    }
}
