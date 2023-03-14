package participant;

public class Human implements Participant {
    private String name;

    public Human (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void run (int distance) {
        System.out.println ("Human " + name + " ran " + distance + " meters.");
    }

    public void jump (int height) {
        System.out.println ("Human " + name + " jumped " + height + " meters.");
    }
}
