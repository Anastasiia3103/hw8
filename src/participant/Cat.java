package participant;

public class Cat implements Participant {
    private String name;

    public Cat (String name) {
        this.name = name;
    }

    public String getName ( ) {
        return name;
    }

    public void run (int distance) {
        System.out.println ("Cat " + name + " ran " + distance + " meters.");
    }

    public void jump (int height) {
        System.out.println ("Cat " + name + " jumped " + height + " meters.");
    }
}
